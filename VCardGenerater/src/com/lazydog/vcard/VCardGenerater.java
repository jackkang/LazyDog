/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lazydog.vcard;

import java.io.*;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author labuser
 */
public class VCardGenerater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length == 0) {
            showError(" java com.lazydog.vcard.VCardGenerater <contact.csv", -1);
        }
        
        VCardGenerater vg = new VCardGenerater();
        vg.importData(args[0]);
        vg.createVCards();
        
    }
    
    public static void showError(String errorMsg, int exitCode) {
        System.out.println(errorMsg);
        System.exit(exitCode);
    }
    
    private void importData(String fileName) {
        try {
            String line;
            int lineCnt = 0;
            StringTokenizer tk;
            String [] tokens = new String[20];
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "Unicode"));
            while (true) {
                line = br.readLine();
                lineCnt ++;
                if (line == null || line.length() == 0)
                    break;
                if (lineCnt == 1) {     // The first line is the column title, ignore the line.
                    continue;
                }
                tk = new StringTokenizer(line, "\t", false);
                int idx = 0;
                while (tk.hasMoreElements()) {
                    String ele = tk.nextToken();
                    //tokens[idx++] = ele;
                    tokens[idx++] = ele.equals("\"\"") ? "" : ele.substring(1, ele.length() - 1);
                }
                System.err.println(tokens[0]);
                vCards.addElement(new VCardEntity(tokens));
            }
            br.close();
            System.err.println("" + vCards.size() + " cards read in.");
        } catch (FileNotFoundException fEx) {
            showError("File " + fileName + " doesn't existing.", -11);
        } catch (IOException ioEx) {
            showError("Read file " + fileName + " error. Please check the right permission!", -12);
        }
    }
    
    private void createVCards() {
        Iterator<VCardEntity> it = vCards.iterator();
        while (it.hasNext()) {
            VCardEntity vCard = it.next();
            createVCard(vCard);
            //System.exit(0);
        }
    }
    
    private int toUTF(String s) {
        char leg[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte a;
        int id = 0;
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 0x80)
                cs[id++] = c;
            else if (c > 0x80 && c < 0x800) {
                a = (byte) (0xc0 | (c >> 3));
                cs[id++] = '=';
                cs[id++] = leg[(a >> 4) & 0xf];
                cs[id++] = leg[a & 0xf];
                a = (byte)(0x80 | (c & 0x07));
                cs[id++] = '=';
                cs[id++] = leg[(a >> 4) & 0xf];
                cs[id++] = leg[a & 0xf];
            } else {                // ignore others over BMP
                a = (byte) (0xe0 | ((c >> 12) & 0x0f));
                cs[id++] = '=';
                cs[id++] = leg[(a >> 4) & 0xf];
                cs[id++] = leg[a & 0xf];
                a = (byte) (0x80 | ((c >> 6) & 0x3f));
                cs[id++] = '=';
                cs[id++] = leg[(a >> 4) & 0xf];
                cs[id++] = leg[a & 0xf];
                a = (byte) (0x80 | (c & 0x3f));
                cs[id++] = '=';
                cs[id++] = leg[(a >> 4) & 0xf];
                cs[id++] = leg[a & 0xf];
            }
        }
        return id;
    }
    
    private char [] cs = new char[100];
    
    private void createVCard(VCardEntity entity) {
        
        String fn = DATADIR + "/" + entity.getName() + ".vcf";
        int dup = 0;
        try {
            File f = new File(fn);
            while (f.exists()) {
                fn = DATADIR + "/" + entity.getName() + "-" + ++dup + ".vcf";
                f = new File(fn);
            }
            PrintWriter pw = new PrintWriter(f);
            pw.write("BEGIN:VCARD\nVERSION:2.1\n");
            pw.write("N;CHARSET=UTF-8;ENCODING=QUOTED-PRINTABLE:" + new String(cs, 0, toUTF(entity.getName())) + "\n");
            if (entity.getCell().length() != 0) pw.write("TEL;CELL:" + entity.getCell() + "\n");
            if (entity.getHome().length() != 0) pw.write("TEL;HOME:" + entity.getHome() + "\n");
            if (entity.getOffice().length() != 0) pw.write("TEL;WORK:" + entity.getOffice() + "\n");
            if (entity.getFax().length() != 0) pw.write("TEL;FAX:" + entity.getFax() + "\n");
            if (entity.getEmail().length() != 0) pw.write("EMAIL;INTERNET:" + entity.getEmail() + "\n");
            if (entity.getCompany().length() != 0) pw.write("ORG;CHARSET=UTF-8;ENCODING=QUOTED-PRINTABLE:" + new String(cs, 0, toUTF(entity.getCompany())) + "\n");
            if (entity.getBirthday().length() != 0) pw.write("BDAY:" + entity.getBirthday() + "\n");
            pw.write("END:VCARD\n");
            pw.close();
        } catch (IOException ioEx) {
            showError("Create " + fn + " failed!", -21);
        }
    }
    
    private Vector<VCardEntity> vCards = new Vector<VCardEntity>();
    
    public static final String DATADIR = "/Users/labuser/LazyDog/VCardGenerater/data";
}

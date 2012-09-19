/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lazydog.vcard;

/**
 *
 * @author labuser
 */
public class VCardEntity {
    
    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    private String cell;

    /**
     * Get the value of cell
     *
     * @return the value of cell
     */
    public String getCell() {
        return cell;
    }
    private String home;

    /**
     * Get the value of home
     *
     * @return the value of home
     */
    public String getHome() {
        return home;
    }
    private String company;

    /**
     * Get the value of company
     *
     * @return the value of company
     */
    public String getCompany() {
        return company;
    }
    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }
    private String office;

    /**
     * Get the value of office
     *
     * @return the value of office
     */
    public String getOffice() {
        return office;
    }
    private String fax;

    /**
     * Get the value of fax
     *
     * @return the value of fax
     */
    public String getFax() {
        return fax;
    }
    private String qq;

    /**
     * Get the value of qq
     *
     * @return the value of qq
     */
    public String getQq() {
        return qq;
    }
    private String msn;

    /**
     * Get the value of msn
     *
     * @return the value of msn
     */
    public String getMsn() {
        return msn;
    }
    private String birthday;

    /**
     * Get the value of birthday
     *
     * @return the value of birthday
     */
    public String getBirthday() {
        return birthday;
    }

    private String title;

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }
    private String url;

    /**
     * Get the value of url
     *
     * @return the value of url
     */
    public String getUrl() {
        return url;
    }

    private String note;

    /**
     * Get the value of note
     *
     * @return the value of note
     */
    public String getNote() {
        return note;
    }
    
    private Address address;

    /**
     * Get the value of country
     *
     * @return the value of country
     */
    public Address getAddress() {
        return address;
    }
    
    public VCardEntity(String name, String cell, String home, String company, String email,
            String office, String fax, String qq, String msn, String birthday, String title,
            String url, String note, String country, String state, String city, String street,
            String pobox, String postcode, String ext) {
        this.name = name;
        this.cell = cell;
        this.home = home;
        this.company = company;
        this.email = email;
        this.office = office;
        this.fax = fax;
        this.qq = qq;
        this.msn = msn;
        this.birthday = birthday;
        this.title = title;
        this.url = url;
        this.note = note;
        this.address = new Address(country, state, city, street, pobox, postcode, ext);
    }
    
    public VCardEntity(String [] data) {
        this.name = data[0];
        this.cell = data[1];
        this.home = data[2];
        this.company = data[3];
        this.email = data[4];
        this.office = data[5];
        this.fax = data[6];
        this.qq = data[7];
        this.msn = data[8];
        this.birthday = data[9];
        this.title = data[10];
        this.url = data[11];
        this.note = data[12];
        this.address = new Address(data[13], data[14], data[15], data[16], data[17], data[18], data[19]);
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author labuser
 */
public class RegisterBean {
    
    private String email;
    private String pwd;
    private boolean loggedin = false;

    
    public void setEmail(String e) {
        email = e;
    }
    
    public void setPwd(String p) {
        pwd = p;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPwd() {
        return pwd;
    }
    
    private SessionBean mySession;
    
    public void setMySession(SessionBean s) {
        mySession = s;
    }
    
    public SessionBean getMySession() {
        return mySession;
    }
    
    public String register() {
        /*
        ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
        
        HttpServletRequest req = (HttpServletRequest)ctx.getRequest();
        
        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");
        
        return (email != null && email.equals(pwd) ? "accepted" : "failed");
        * 
        */
        
        setLoggedin(email.equals(pwd));
        
        return (isLoggedin() ? "accepted" : "failed");
       
    }
    
    public String logout() {
        setLoggedin(false);
        return "home";
    }
    
    
    
    public void setLoggedin(boolean l) {
        loggedin = l;
    }
    
    public boolean isLoggedin() {
        return loggedin;
    }
    
    private SelectItem[] options = {
            new SelectItem("ABC"), new SelectItem("DEF"), new SelectItem("XYZ")
    };
    
    public SelectItem[] getOptions() {
        
        return options;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lazydog.vcard;

/**
 *
 * @author labuser
 */
public class Address {
    
    private String country;
    
    private String city;
    
    private String state;
    
    private String street;
    
    private String pobox;
    
    private String postcode;
    
    private String ext;
    
    public Address(String country, String state, String city, String street,
            String pobox, String postcode, String ext) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.pobox = pobox;
        this.postcode = postcode;
        this.ext = ext;
    }
    
    public String getCountry() {
        return country;
    }
    
    public String getState() {
        return state;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getStreet() {
        return street;
    }
    
    public String getPobox() {
        return pobox;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public String getExt() {
        return ext;
    }
    
    public String getFullAddress() {
        return country + state + city + street + pobox + "ZIP: " + postcode + "(" + ext + ")";
    }
    
}

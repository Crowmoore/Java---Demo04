/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Register;

/**
 *
 * @author h3090
 */
public class Person {
 
    private String firstname;
    private String lastname;
    private String ssn;
    
    public Person (String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }
    public String getSsn() {
        return this.ssn;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public String getPerson() {
        return this.firstname + " " + this.lastname + " " + this.ssn;
    }
    
}

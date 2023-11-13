package com.learning.inheritance.employee;

public class Individual {
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString(){
        return String.format("First Name : "+getFirstname()+"\n"+"Last Name : "+getLastname()+"\n");
    }
}

package com.learning.inheritance.employee;

public class Person extends Individual {

    private String email;
    private String contactNum;

    public String getName() {
        return getFirstname()+" "+getLastname();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }

    public String toString(){
        return String.format(super.toString()+"Name : "+getName()+"\n"+"Email Id : "+getEmail()+"\n"+"Contact Number : "+getContactNum());
    }
}

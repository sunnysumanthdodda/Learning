package com.learning.inheritance;

public class Employee extends Person {
    private String title;
    private String EmployerName;
    private String salary;

    public Employee(String name){
        super(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return EmployerName;
    }

    public void setEmployerName(String employerName) {
        EmployerName = employerName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format(super.toString()+"\n"+"Designation : "+getTitle()+"\n"
                +"Client Location : "+getEmployerName()+"\n"+"Fixed Salary : "+getSalary());
    }
}
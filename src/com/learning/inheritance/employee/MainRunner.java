package com.learning.inheritance.employee;

public class MainRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstname("Sunny Sumanth");
        employee.setLastname("Dodda");
        employee.setEmail("sunnysumanthdodda@gmail.com");
        employee.setContactNum("+1 (940) 999-8942");
        employee.setTitle("Software Engineer");
        employee.setEmployerName("Apple Inc");
        employee.setSalary("140,000");
        System.out.println(employee);
    }
}
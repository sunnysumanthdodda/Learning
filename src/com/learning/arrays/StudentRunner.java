package com.learning.arrays;


public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student("Sunny", 95,96,97,98,99);
        System.out.println("Total number of scores is  : "+student.getListofMarks1()+" --> "+student.getNumberofMarks());
        System.out.println("Total sum of marks scored is : "+student.getListofMarks()+" --> "+student.getSumofMarks());
        System.out.println("Maximum score in marks is : "+student.getListofMarks1()+" --> "+student.getMaximumMark());
        System.out.println("Minimum score in marks is : "+student.getListofMarks1()+" --> "+student.getMinimumMark());
        System.out.println("Average of marks scored is : "+student.getSumofMarks()+"/"+student.getNumberofMarks()+" --> "+student.getAverageofMarks());
    }
}
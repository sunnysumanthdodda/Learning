package com.learning.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student("Sunny", 95,96,97,98,99);
//        String[] studentRunners = new String[3];
//        for(int i=0;i<studentRunners.length;i++) {
//            System.out.print("Enter the required name : ");
//            String input = sc.nextLine();
//            studentRunners[i] = input;
//        }
//
//        System.out.println(Arrays.toString(studentRunners));
        System.out.println("Total number of scores is  : "+student.getListofMarks1()+" --> "+student.getNumberofMarks());
        System.out.println("Total sum of marks scored is : "+student.getListofMarks()+" --> "+student.getSumofMarks());
        System.out.println("Maximum score in marks is : "+student.getListofMarks1()+" --> "+student.getMaximumMark());
        System.out.println("Minimum score in marks is : "+student.getListofMarks1()+" --> "+student.getMinimumMark());
        System.out.println("Average of marks scored is : "+student.getSumofMarks()+"/"+student.getNumberofMarks()+" --> "+student.getAverageofMarks());
    }
}
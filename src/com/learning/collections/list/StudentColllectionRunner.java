package com.learning.collections.list;

import java.util.ArrayList;
import java.util.List;

public class StudentColllectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"Top"), new Student(3,"Maverick"),new Student(2,"Gun"));
//        System.out.println(students);
        List<Student> studentsAL = new ArrayList<>(students);
        System.out.println("Input Data of Collection --> "+studentsAL);
        studentsAL.sort(new AscendingStudentCompartor());
        System.out.println("Ascending order of name --> "+studentsAL);
        studentsAL.sort(new DescendingStudentCompartor());
        System.out.println("Descending order of id --> "+studentsAL);
    }
}

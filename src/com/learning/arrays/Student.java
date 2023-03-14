package com.learning.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;

    private int[] marks;

    public Student(String name, int... marks){
        this.name = name;
        this.marks = marks;
    }

    public String getListofMarks1() {
        String listofmarks1 = "";
        for (int mark : marks) {
            if (mark == marks[marks.length - 1]) listofmarks1 += mark;
            else listofmarks1 += mark + ",";
        }
        return listofmarks1;
    }

    public int getNumberofMarks() {
        return marks.length;
    }

    public String getListofMarks() {
        String listofmarks = "";
        for (int mark : marks) {
            if (mark == marks[marks.length - 1]) listofmarks += mark;
            else listofmarks += mark + "+";
        }
        return listofmarks;
    }



    public int getSumofMarks() {
        int sum = 0;
        for(int mark:marks) sum+=mark;
        return sum;
    }

    public int getMaximumMark() {
        int max = marks[0];
        for(int mark:marks){
            if(mark>max) max = mark;
        }
        return max;
    }

    public int getMinimumMark() {
        int min = marks[0];
        for(int mark:marks){
            if(mark<min) min = mark;
        }
        return min;
    }

    public BigDecimal getAverageofMarks() {
//        int sum = getSumofMarks();
//        int num = getNumberofMarks();
        return new BigDecimal(getSumofMarks()).divide(new BigDecimal(getNumberofMarks()),3, RoundingMode.UP);
    }
}
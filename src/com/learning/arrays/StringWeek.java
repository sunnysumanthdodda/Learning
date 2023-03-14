package com.learning.arrays;

public class StringWeek {

    private String[] week;

    StringWeek(String[] week){
        this.week = week;
    }


    public String longestLetter() {
        String longletter = "";
        for(String day:week){
            if(day.length()>longletter.length())
                longletter = day;
        }
        return longletter;
    }

    public String[] reversePrint(){
        String[] rev = new String[week.length];
        for(int i=0;i<week.length;i++){
            rev[i] = week[week.length-i-1];
            StringBuffer sbf = new StringBuffer(rev[i]);
            rev[i] = String.valueOf(sbf.reverse());
        }
        return rev;
    }
}

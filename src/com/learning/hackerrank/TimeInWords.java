package com.learning.hackerrank;

public class TimeInWords {
    public static void main(String[] args) {
        int h = 5, m = 47;
        String[] minutes = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
                "fourteen","fifteen", "sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three",
                "twenty four", "twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        if(m==0) System.out.print(minutes[h]+" o' clock");
        else if(m==1) System.out.print("one minute past "+minutes[h]);
        else if(m==15) System.out.print("quarter past "+minutes[h]);
        else if(m==30) System.out.print("half past "+minutes[h]);
        else if(m==45) System.out.print("quarter to "+minutes[h+1]);
        else if(m>1 && m<30) {
            if(m!=15) System.out.print(minutes[m]+" minutes past "+minutes[h]);
        }
        else System.out.print(minutes[60-m]+" minutes to "+minutes[h]);
    }
}

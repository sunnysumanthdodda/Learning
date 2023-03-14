package com.learning.arrays;

import java.util.Arrays;

public class StringWeekRunner {
    public static void main(String[] args) {
        StringWeek stringWeek = new StringWeek(new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"});
        System.out.println("Longest number of letters is --> "+stringWeek.longestLetter()+" and length of letter is --> "+stringWeek.longestLetter().length());
        System.out.println("Reverse of letters is : "+ Arrays.toString(stringWeek.reversePrint()));
    }
}
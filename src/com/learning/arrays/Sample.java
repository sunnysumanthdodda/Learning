package com.learning.arrays;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String sentence = "Java is the toughest language to learn and crack the interview";
        String[] spl = sentence.split(" ");
        int len = spl[0].length();
        String highest = "";
        for(int i=0;i< spl.length;i++){
            if(len<spl[i].length()) {
                len = spl[i].length();
                highest = spl[i];
            }
        }
        System.out.println("Highest word length in the sentence is -> "+highest+" "+"and length is -> "+len);
        System.out.println("Number of words in the input sentence is -> "+spl.length);
    }
}

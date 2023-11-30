package com.learning.leetcode;

import java.io.*;
import java.util.Scanner;

class Result {
    public static long repeatedString(String s, long n) {
        long ainstring = 0, ainbalancestring = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') ainstring++;
        }
        for(int i=0;i<(n%s.length());i++){
            if(s.charAt(i)=='a') ainbalancestring++;
        }
        return (ainstring*(n/s.length()))+ainbalancestring;
    }
}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("Enter the number : ");
        long num = sc.nextInt();

        System.out.println(Result.repeatedString(s,num));
    }
}

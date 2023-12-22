package com.learning.leetcode;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        String s = String.valueOf(n);
        int product = 1, sum = 0;
        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            product*=num;
            sum+=num;
        }
        int diff = product - sum;
        System.out.println(diff);
    }
}

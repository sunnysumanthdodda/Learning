package com.learning.hackerrank;

public class FindDigits {
    public static void main(String[] args) {
        int n = 124, count = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            int num = (int)s.charAt(i) - 48;
            if(num==0) continue;
            else if(n%num==0) count++;
        }
        System.out.println(count);
    }
}

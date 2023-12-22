package com.learning.leetcode;

public class DividesSelf {

    public static boolean divide(int n){
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            int num = str.charAt(i)-48;
            System.out.println(num);
            if(num==0) return false;
            if(n%num==0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 42;
        System.out.println(divide(n));
    }
}

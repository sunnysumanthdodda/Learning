package com.learning.hackerrank;

public class Palindrome {
    public static void main(String[] args) {
        String A = "madam";
        StringBuilder str = new StringBuilder();
        for(int i=0;i<A.length();i++){
            str.append(A.charAt(A.length() - i - 1));
        }
        if(A.contentEquals(str)) System.out.println("Yes");
        else System.out.println("No");
    }
}

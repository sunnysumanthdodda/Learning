package com.learning.practice.Amazon;

public class StringEncoder {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(stringEncoder(s));
    }

    private static String stringEncoder(String s) {
        if(s == null || s.isEmpty()) return "Give proper input";
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        char prev = 0;
        int count = 0;
        for(char c : chars) {
            if(c == prev) {
                count++;
            }else {
                if(prev!=0) sb.append(count).append(prev);
                prev = c;
                count = 1;
            }
        }
        sb.append(count).append(prev);
        return sb.toString();
    }
}

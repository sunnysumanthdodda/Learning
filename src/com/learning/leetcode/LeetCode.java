package com.learning.leetcode;

public class LeetCode {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int index = Math.abs(i-columnTitle.length()+1);
            result+= (int) (((columnTitle.charAt(i))-64)*Math.pow(26,index));
        }
        return result;
    }
//    public int titleToNumber(String columnTitle) {
//        int res = 0;
//        for(int i = columnTitle.length()-1; i>=0;i--){
//            char c = columnTitle.charAt(i);
//            int pow = Math.abs(i-columnTitle.length()+1);
//            res+= (int) ((c-64)*Math.pow(26, pow));
//        }
//        return res;
//    }
}
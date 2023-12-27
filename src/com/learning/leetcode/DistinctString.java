package com.learning.leetcode;

public class DistinctString {

    public static int strDist(String str, String sub) {
        if(str.length()<sub.length()) return 0;
        if(str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if(!str.startsWith(sub)){
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0,str.length()-1),sub);
    }
    public static void main(String[] args) {
        String str = "cccatcowcatxx";
        String sub = "cat";
        System.out.println(strDist(str,sub));
    }
}

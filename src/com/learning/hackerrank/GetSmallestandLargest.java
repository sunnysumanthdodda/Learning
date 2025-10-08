package com.learning.hackerrank;

public class GetSmallestandLargest {
    static void main() {
        String s = "welcometojava";
        int k = 3;
        String smallestString = s.substring(0,k);
        String largestString = smallestString;
        for(int i = 1; i <= s.length()-k; i++) {
            String cur = s.substring(i,i+k);
            if(cur.compareTo(smallestString)<0) smallestString = cur;
            if(cur.compareTo(largestString)>0) largestString = cur;
        }
        System.out.println(smallestString);
        System.out.println(largestString);
    }
}

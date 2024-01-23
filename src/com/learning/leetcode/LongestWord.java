package com.learning.leetcode;

public class LongestWord {
    public static void main(String[] args) {
        String S = "abppplee";
        String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
        String str = "";
        int max = 0;
        for(int i=0;i<D.length;i++){
            int count = 0;
            for(int j=0;j<D[i].length();j++){
                for(int k=0;k<S.length();k++){
                    if(D[i].charAt(j)==S.charAt(k)) count++;
                }
            }
            if(max<count) {
                max = count;
                str = D[i];
            }
        }
        System.out.println(str);
    }
}

package com.learning.hackerrank;

public class BeautifulDays {
    public static void main(String[] args) {
        int i = 13, j = 45, k = 3, beautifulday = 0;
        for(int m = i;m<=j;m++){
            String s = String.valueOf(m);
            StringBuilder sb = new StringBuilder(s);
            int diff = Math.abs(m - (Integer.parseInt(String.valueOf(sb.reverse()))));
            if(diff%k==0) beautifulday++;
        }
        System.out.println(beautifulday);
    }
}

package com.learning.hackerrank;

public class Library {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        if(y1>y2) return 10000;
        else if(y1==y2){
            if(m1>m2) return 500*(m1-m2);
            else if(m1==m2){
                if(d1>d2) return 15*(d1-d2);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int d1 = 2, m1 = 5,y1 = 2015,  d2 = 6,  m2 = 5,  y2 = 2015;
        System.out.println(libraryFine(d1,m1,y1,d2,m2,y2));
    }
}

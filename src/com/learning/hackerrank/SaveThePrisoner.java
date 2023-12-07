package com.learning.hackerrank;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        int index = 0;
        if(s==1) return m;
        else {
            for(int i=0;i<m;i++){
                index = s++;
                if(index==n) s=1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2));
    }
}

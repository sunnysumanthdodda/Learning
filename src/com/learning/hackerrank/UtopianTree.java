package com.learning.hackerrank;

public class UtopianTree {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<=5;i++){
            if(i%2==0) {
                sum+=1;
                System.out.print(sum+" ");
            }
            else {
                sum*=2;
                System.out.print(sum+" ");
            }
        }
//        System.out.println(sum);
    }
}

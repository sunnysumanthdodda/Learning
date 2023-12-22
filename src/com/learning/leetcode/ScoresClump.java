package com.learning.leetcode;

public class ScoresClump {

    public static boolean scores(int[] scores){
        for(int i=0;i<scores.length-2;i++){
            int diff1 = Math.abs(scores[i]-scores[i+1]);
            int diff2 = Math.abs(scores[i]-scores[i+2]);
            int diff3 = Math.abs(scores[i+1]-scores[i+2]);
            if(diff1<=2 && diff2<=2 && diff3<=2) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] scores = {3,4,6};
        System.out.println(scores(scores));
    }
}

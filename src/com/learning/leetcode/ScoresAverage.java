package com.learning.leetcode;

public class ScoresAverage {

    public static int average(int[] scores, int start, int end){
        int average = 0;
        for(int i=start;i<end;i++){
            average+=scores[i];
        }
        return average;
    }

    public static int scoresAverage(int[] scores){
        int average1 = average(scores,0,scores.length/2);
        int average2 = average(scores,scores.length/2,scores.length);
        return Math.max(average1/(scores.length/2),average2/(scores.length/2));
    }
    public static void main(String[] args) {
        int[] scores = {2,2,4,4};
        System.out.println(scoresAverage(scores));
    }
}

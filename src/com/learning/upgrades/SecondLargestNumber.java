package com.learning.upgrades;

public class SecondLargestNumber {

    public static int secondLargestNumber(int[] arr){
        if(arr.length==0 || arr.length==1) return -1;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                smax = max;
                max = j;
            } else if (j > smax && j != max) smax = j;
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] nums = {5,4};
        System.out.println(secondLargestNumber(nums));
    }
}

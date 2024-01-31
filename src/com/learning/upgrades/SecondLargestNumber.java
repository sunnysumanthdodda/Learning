package com.learning.upgrades;

public class SecondLargestNumber {

    public static int secondLargestNumber(int[] arr){
        if(arr.length==0 || arr.length==1) return -1;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] nums = {5,4};
        System.out.println(secondLargestNumber(nums));
    }
}

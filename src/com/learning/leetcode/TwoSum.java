package com.learning.leetcode;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> numMap = new HashMap<>();
//
//        // Loop through the array of numbers
//        for (int i = 0; i < nums.length; i++) {
//            // Calculate the complement needed to reach the target
//            int complement = target - nums[i];
//
//            // If the complement is in the map, return its index and the current index
//            if (numMap.containsKey(complement)) {
//                return new int[]{numMap.get(complement), i};
//            }
//
//            // Otherwise, add the current number and its index to the map
//            numMap.put(nums[i], i);
//        }
//
//        // If no solution is found, return an empty array
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]+nums[j]==target) return new int[]{j,i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
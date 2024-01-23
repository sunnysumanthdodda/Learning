package com.learning.leetcode;

import java.util.*;
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        List<Integer> longsubseq = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) {
                longsubseq.add(nums[i]);
            }
        }
        System.out.println(longsubseq);
        return longsubseq.size();
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,104,18};
        System.out.println(lengthOfLIS(nums));
    }
}

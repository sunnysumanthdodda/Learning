package com.learning.leetcode;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int num = 0;
        if(nums.length==1) return nums[0];
        Map<Integer,Integer> result = new HashMap<>();
        for (int i : nums) {
            result.put(i, result.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            if(entry.getValue()==1) num = entry.getKey();
        }
        return num;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4};
        System.out.println(singleNumber(nums));
    }
}

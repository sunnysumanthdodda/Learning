package com.learning.sample;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();
                if (nums[i] + nums[j] == target) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list1.add(list);
                }
            }
        }
        return list1;
    }
}

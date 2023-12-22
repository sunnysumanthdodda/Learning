package com.learning.leetcode;

import java.util.Arrays;

public class MaxTriple {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, 9, 7, 8, 9};
        int[] res = new int[3];
        res[0] = nums[nums.length/2 - 1];
        System.out.println(res[0]);
        res[1] = nums[nums.length/2];
        System.out.println(res[1]);
        res[2] = nums[nums.length/2 + 1];
        System.out.println(res[2]);
        Arrays.sort(res);
        System.out.println(res[res.length-1]);
    }
}

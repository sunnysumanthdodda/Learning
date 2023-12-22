package com.learning.leetcode;

import java.util.*;
public class CopyEvens {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 5, 8}; int count = 2;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) res.add(num);
        }
        int[] even = new int[count];
        for(int j=0;j<count;j++){
            even[j] = res.get(j);
        }
        System.out.println(Arrays.toString(even));
    }
}

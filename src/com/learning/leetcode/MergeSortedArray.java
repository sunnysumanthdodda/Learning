package com.learning.leetcode;

import java.util.*;

public class MergeSortedArray {

    public static void merge(int[] nums1, int[] nums2) {
        if(nums2.length==0 || nums2[0] == 0) System.out.println(Arrays.toString(nums1));
        if(nums1.length==0 || nums1[0] == 0) System.out.println(Arrays.toString(nums2));
    }
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {0};
        int[] nums = {5};
        int[] nums4 = {5,6,7};
        merge(nums1,nums2);
    }
}

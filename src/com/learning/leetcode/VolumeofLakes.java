package com.learning.leetcode;

public class VolumeofLakes {

    public static int trap(int[] height) {
        int trappedWater = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while(leftIndex < rightIndex) {
            if (height[leftIndex] <= height[rightIndex]) {
                leftMax = Math.max(leftMax, height[leftIndex]);
                trappedWater += Math.max(0, leftMax - height[leftIndex]);
                leftIndex += 1;
            }
            else {
                rightMax = Math.max(rightMax, height[rightIndex]);
                trappedWater += Math.max(0, rightMax - height[rightIndex]);
                rightIndex -= 1;
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2};
        System.out.println(trap(arr));
    }
}

package com.learning.leetcode;

import java.util.*;
public class Candies {
    public static int distributeCandies(int[] candyType) {
//        List<Integer> uList = new ArrayList<>();
//        for(int i=0;i<candyType.length;i++) uList.add(candyType[i]);
//        Set<Integer> unique = new HashSet<>(new ArrayList<>(uList));
//        Integer[] arr = unique.toArray(new Integer[0]);
//        return Math.min(arr.length,candyType.length/2);
        Set<Integer> unique = new HashSet<>();
        for(int num : candyType){
            if(unique.size()>=candyType.length/2)
                return candyType.length/2;
            unique.add(num);
        }
        return Math.min(unique.size(),candyType.length/2);
    }

    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}

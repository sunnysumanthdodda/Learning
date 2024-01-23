package com.learning.leetcode;

import java.util.*;

public class BinaryLaughSearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,1,2,3,4,5,6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target number : ");
        int target = scanner.nextInt();
        List<Integer> index = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                index.add(i);
            }
        }
        if(!index.isEmpty()) System.out.println("Your target number is found at index : "+index.get(0));
        else System.out.println("Better luck next time..!");
    }
}

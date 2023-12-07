package com.learning.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
//    public static void main(String[] args) {
//        int num1 = 0, num2 = 1, sum=0;
//        for(int i=0;i<9;i++){
//            sum = num1+num2;
//            num1 = num2;
//            num2 = sum;
//        }
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4,4,3,3,3,3,3,2,2,2,2,2,1};
        int lowestIndex = findLowestIndex(arr);
        System.out.println("The lowest index of the same frequency of numbers in the array is: " + lowestIndex);
    }

    public static int findLowestIndex(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }

        int lowestFrequency = Integer.MAX_VALUE;
        int lowestIndex = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < lowestFrequency) {
                lowestFrequency = entry.getValue();
                lowestIndex = entry.getKey();
            } else if (entry.getValue() == lowestFrequency && entry.getKey() < lowestIndex) {
                lowestIndex = entry.getKey();
            }
        }
        return lowestIndex;
    }
}

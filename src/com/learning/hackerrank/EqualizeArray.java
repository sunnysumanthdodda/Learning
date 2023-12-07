package com.learning.hackerrank;

import java.util.*;
public class EqualizeArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(35 ,65 ,69 ,28 ,12, 69 ,37, 80, 80, 50, 80, 50, 15, 57, 79, 69, 57, 65, 15, 69, 57, 50 ,65 ,2 ,14 ,64 ,15 ,65 ,65 ,5 ,15 ,64, 57 ,37 ,50 ,12, 64, 37, 28, 20, 80, 80, 50));
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int k = 0;k<arr.size();k++) {
            frequency.put(arr.get(k), frequency.getOrDefault(arr.get(k), 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            res.add(entry.getValue());
        }
        int max = res.get(0);
        for (int i=0;i<res.size();i++) {
            if (max < res.get(i)) max = res.get(i);
        }
        System.out.println(arr.size()-max);
    }
}

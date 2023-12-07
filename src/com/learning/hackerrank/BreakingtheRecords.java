package com.learning.hackerrank;

import java.util.*;

public class BreakingtheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));
        List<Integer> result = new ArrayList<>();
        int maxCount = 0, minCount = 0, max = scores.get(0), min = scores.get(0);;
        for(int i=1;i<scores.size();i++){
            System.out.print(scores.get(i)+" ");
            if(max<scores.get(i)) {
                max = scores.get(i);
                maxCount++;
            }
            if(min>scores.get(i)) {
                min = scores.get(i);
                minCount++;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        System.out.println(result);
    }
}

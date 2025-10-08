package com.learning.hackerrank;

import java.util.*;

public class GradingStudents {
    public static void main() {
        List<Integer> grades = new ArrayList<>(List.of(73,67,38,33));
        List<Integer> result = new ArrayList<>();
        for(int i:grades){
            int round = i+3;
            if(i%5==0 || round<40){
                result.add(i);
            }else {
                boolean found = false;
                for (int j = i+1; j <round; j++) {
                    if (j % 5 == 0) {
                        result.add(j);
                        found = true;
                        break;
                    }
                }
                if(!found){
                    result.add(i);
                }
            }
        }

        System.out.println(result);
    }
}

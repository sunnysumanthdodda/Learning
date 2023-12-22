package com.learning.leetcode;

import java.util.*;

public class CommonTwo {
    public static void main(String[] args) {
        String[] a = {"a", "a", "b", "b", "c"};
        String[] b = {"b", "b", "b", "x"};
        Set<String> setA = new HashSet<>(List.of(a));
        Set<String> setB = new HashSet<>(List.of(b));
        int count = 0;
        String[] min, max;
        if(a.length>b.length) {
            min = setB.toArray(new String[0]); max = setA.toArray(new String[0]);
        }
        else{
            min = setA.toArray(new String[0]) ; max = setB.toArray(new String[0]);
        }
        for(int i=0;i<min.length;i++){
            for(int j=0;j<max.length;j++){
                if(min[i].equals(max[j])) count++;
            }
        }
        System.out.println(setA+","+setB);
        System.out.println(Arrays.toString(min)+","+Arrays.toString(max));
        System.out.println(count);
    }
}

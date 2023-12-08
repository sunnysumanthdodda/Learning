package com.learning.hackerrank;

import java.util.*;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4,4,4,4,4));
        List<Integer> result = new ArrayList<>();
        int diff=0;
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(Objects.equals(a.get(i), a.get(j))) {
                    diff = Math.abs(i-j);
                    result.add(diff);
                }
            }
        }
        if(diff==0) System.out.print(-1);
        else {
            Collections.sort(result);
            System.out.print(result.get(0));
        }
    }
}

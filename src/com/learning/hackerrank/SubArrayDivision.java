package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        int[] s = new int[]{2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
        List<List<Integer>> result = new ArrayList<>();
        int d = 18, m = 7;
        for(int i=0;i<(s.length-m+1);i++){
            int sum = 0;
            List<Integer> result1 = new ArrayList<>();
            for(int j=i;j<m+i;j++){
                sum+=s[j];
                result1.add(s[j]);
            }
            if(sum==d){
                result.add(result1);
            }
        }
        System.out.println(result.size());
    }
}

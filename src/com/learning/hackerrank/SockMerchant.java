package com.learning.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,1,2,1,3,2};
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            result.put(ar[i],result.getOrDefault(ar[i],0)+1);
        }
        System.out.println(result);
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            int count = entry.getValue();
            System.out.print(count+" ");
            sum+=(count/2);
        }
        System.out.println(sum);
    }
}

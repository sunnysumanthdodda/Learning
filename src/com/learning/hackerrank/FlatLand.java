package com.learning.hackerrank;

import java.util.*;

public class FlatLand {
    public static void main(String[] args) {
        int n = 6;
        int[] c = new int[]{1,2,3,4,5};
        Arrays.sort(c);
        int maxDistance = Math.max(c[0],n-1-c[c.length-1]);
        for(int i=1;i<c.length;i++){
            int distance = (c[i] - c[i-1])/2;
            if(distance>maxDistance) maxDistance = distance;
        }
        System.out.println(maxDistance);
    }
}

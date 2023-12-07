package com.learning.hackerrank;

import java.util.Arrays;

public class MigratoryBirds {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,4,3,2,1,3,4};
//        int[] arr = new int[]{1,3,3,3,5,5,5,5,4};
        int[] result = new int[5];
        int maxFrequency = 0, number = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) result[0]++;
            if(arr[i]==2) result[1]++;
            if(arr[i]==3) result[2]++;
            if(arr[i]==4) result[3]++;
            if(arr[i]==5) result[4]++;
        }
        System.out.println(Arrays.toString(result));
        for(int j=0;j<result.length;j++){
            int type = j+1;
            int frequency = result[j];
            if(frequency > maxFrequency || (frequency==maxFrequency && type<number)){
                maxFrequency = type;
                number = frequency;
            }
        }
        System.out.println(maxFrequency);
    }
}

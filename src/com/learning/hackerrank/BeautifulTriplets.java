package com.learning.hackerrank;

import java.util.*;

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int d = scanner.nextInt();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7, 8, 10));
        int count = 0;
        for(int i=0;i<arr.size();i++){
            int first = arr.get(i);
            if(arr.contains(first+d) && arr.contains(first+(2*d))) count++;
        }
        System.out.print(count);
    }
}

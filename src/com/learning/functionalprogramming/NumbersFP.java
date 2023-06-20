package com.learning.functionalprogramming;

import java.util.List;
import java.util.Scanner;

public class NumbersFP {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        printNum(list);
    }

    private static void printNum(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required number : ");
        int num = sc.nextInt();
        list
                .stream()
                .filter(element -> element%2==num)
                .forEach(element -> System.out.print(element+" "));
    }
}

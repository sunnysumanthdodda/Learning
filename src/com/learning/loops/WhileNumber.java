package com.learning.loops;

import java.util.Scanner;

public class WhileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int num = sc.nextInt();
        System.out.print("Sqaure of numbers within Limit " + num + " are : ");
        int i = 1,j = 1;
        while (i * i < num) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
        System.out.print("Cube of numbers within Limit " + num + " are : ");
        while (j * j * j < num) {
            System.out.print(j * j * j + " ");
            j++;
        }
    }
}

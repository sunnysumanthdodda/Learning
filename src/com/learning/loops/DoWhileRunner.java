package com.learning.loops;

import java.util.Scanner;

public class DoWhileRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            if(number!=0) System.out.println("Cube is : "+(number*number*number));
            System.out.print("Enter the required number : ");
            number = sc.nextInt();
        } while(number>0); System.out.println("Thank you.. Have fun!");
    }
}

package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HowManyGames {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
//        System.out.print("p is : ");
//        int p = scanner.nextInt();
//        System.out.print("d is : ");
//        int d = scanner.nextInt();
//        System.out.print("m is : ");
//        int m = scanner.nextInt();
//        System.out.print("s is : ");
//        int s = scanner.nextInt();
        int p = 16, d = 2, m = 1, s = 9981, sum = 0, count = 0;
        while(p>=m){
            list.add(p);
            p-=d;
        }
        for(int j=0;j<=s;j++){
            list.add(m);
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            sum+=(list.get(i));
            if(sum<=s) count++;
        }
        System.out.print(count);
    }
}

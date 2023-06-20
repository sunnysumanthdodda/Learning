package com.learning.functionalprogramming;

import java.util.*;
import java.util.stream.IntStream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> names = List.of("Sunny","Sumanth","Dodda","Java","Training","Job","Requirement");
        IntStream.range(1,11).map(e->e*e).forEach(e->System.out.print(e+" "));
        System.out.println();
        IntStream.range(1,11).map(e->e*e*e).forEach(e->System.out.print(e+" "));
        System.out.println();
        System.out.println("Maximum number is : "+numbers.stream().max(Integer::compare).get());
        System.out.println("Minimum number is : "+numbers.stream().min(Integer::compare).get());
        System.out.println("Odd numbers are : "+numbers.stream().filter(e->e%2!=0).toList());
        System.out.println("Even numbers are : "+numbers.stream().filter(e->e%2==0).toList());
        System.out.println(names);
        names.stream().map(String::length).forEach(e->System.out.print(e+" "));
    }
}

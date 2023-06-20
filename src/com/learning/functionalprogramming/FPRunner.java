package com.learning.functionalprogramming;

import java.util.List;

public class FPRunner {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printFP(list);
        printFPwithFilter(list);
    }

    private static void printFP(List<String> list){
        list
                .forEach(element -> System.out.print(element+" "));
        System.out.println();
    }
    private static void printFPwithFilter(List<String> list){
        list
                .stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.print(element+" "));
    }
}
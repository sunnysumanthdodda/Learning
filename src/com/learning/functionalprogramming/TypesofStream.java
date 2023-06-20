package com.learning.functionalprogramming;

import java.util.List;
public class TypesofStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,7,3,5,83,4567,83,10,14,17,17,25,26);
        printSortedNumbers(numbers);
        System.out.println();
        printDistinctUniqueNumbers(numbers);
        System.out.println();
        printSquare(numbers);
    }

    private static void printDistinctUniqueNumbers(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(e->System.out.print(e+" "));
    }

    private static void printSortedNumbers(List<Integer> numbers){
        numbers.stream().sorted().forEach(ele -> System.out.print(ele+" "));
    }
    private static void printSquare(List<Integer> numbers) {
        numbers.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.print(e + " "));
    }
}
package com.learning.functionalprogramming;

import java.util.*;

public class TypesofStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
        for(int i=1;i<=20;i++){
            numbers.add(new Random().nextInt(100));
        }
        printSortedNumbers(numbers);
        System.out.println();
        printDistinctUniqueNumbers(numbers);
        System.out.println();
        printSquare(numbers);
        System.out.println();
        parallelstream();
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

    private static void parallelstream(){
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for(int i=1;i<=10000;i++){
            nums.add(random.nextInt(100));
        }
        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream().filter(n->n%2==0).reduce(0,Integer::sum);
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream().filter(n->n%2==0).reduce(0,Integer::sum);
        long endPara = System.currentTimeMillis();

        System.out.println(sum1+" "+sum2);
        System.out.println("Execution time with stream : "+(endSeq-startSeq));
        System.out.println("Execution time with parallel stream : "+(endPara-startPara));
    }
}
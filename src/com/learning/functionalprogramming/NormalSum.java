package com.learning.functionalprogramming;

import java.util.List;

public class NormalSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,7,10,15,17,18,20,24,29);
        System.out.print("Sum of Odd Numbers is : "+fpOddSum(numbers));
    }

    private static int fpOddSum(List<Integer> numbers) {
        return numbers.stream().filter(element->element%2!=0)
                .reduce(0 , Integer::sum);
    }
}
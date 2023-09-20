package com.learning.sample;

public class Sample {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        // Check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Iterate through the character array in reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed+= charArray[i]; // Append the character to the reversed string
        }

        return reversed;
    }
}
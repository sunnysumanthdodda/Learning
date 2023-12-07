package com.learning.hackerrank;

public class PageCount {
    public static int pageCount(int n, int p) {
        // Calculate front turns
        int frontTurns = p / 2;

        // Calculate back turns
        int backTurns = (n / 2) - (p / 2);

        // Return the minimum of the two
        return Math.min(frontTurns, backTurns);
    }

    public static void main(String[] args) {
        int n = 6; // Total number of pages in the book
        int p = 2; // The page number to turn to
        System.out.println(pageCount(n, p)); // Expected output: 1
    }
}

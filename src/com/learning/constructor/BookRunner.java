package com.learning.constructor;

public class BookRunner {
    public static void main(String[] args) {

        Book jkrolling = new Book(50);

        Book shakespeare = new Book(75);

        Book howtolearncoding = new Book(200);

        System.out.println("No of copies of J.K.Rolling books are: " + jkrolling.getCopies());
        System.out.println("No of copies of William Shakespeare books are: " + shakespeare.getCopies());
        System.out.println("No of copies of Coding books are: " + howtolearncoding.getCopies());
    }
}

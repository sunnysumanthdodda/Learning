package com.learning.constructor;

public class BookRunner {
    public static void main(String[] args) {

        Book jkrolling = new Book(50);

        Book shakespeare = new Book();

        System.out.println("No of copies of J.K.Rolling books are: " + jkrolling.getCopies());

        System.out.println("No of copies of William Shakespeare books are: " + shakespeare.getCopies());
    }
}

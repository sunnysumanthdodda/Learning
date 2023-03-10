package com.learning.constructor;

public class Book {

    private final int copies;


    // This keyword used to call other constructor
    Book(){
        this(75);
    }

    // Constructor class
    Book(int copies){
        this.copies = copies;
    }

    public int getCopies() {
        return copies;
    }

}

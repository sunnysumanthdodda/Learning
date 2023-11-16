package com.learning.interfaces.exercise4;

public class Software {
    public static void main(String[] args) {

        Desktop desktop = new Desktop();
        Laptop laptop = new Laptop();

        Developer developer = new Developer();
        developer.show(desktop);
    }
}

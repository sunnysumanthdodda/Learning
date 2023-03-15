package com.learning.interfaces.exercise3;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyables = {new Bird(), new Aeroplane()};
        for(Flyable object:flyables){
            object.fly();
        }
    }
}
package com.learning.abstraction.exercise2;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for(Animal animal:animals){
            animal.bark();
        }
    }
}

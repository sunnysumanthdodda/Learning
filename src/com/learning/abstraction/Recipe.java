package com.learning.abstraction;

public class Recipe extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Select the recipe");
    }

    @Override
    void dotheDish() {
        System.out.println("Start cooking");
        System.out.println("Add the required materials into the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Garnsih the dish");
        System.out.println("Cleanup the utensils");
    }
}

package com.learning.abstraction;

public abstract class AbstractRecipe {

    public void execute(){
        getReady();
        dotheDish();
        cleanUp();
    }

    abstract void getReady();
    abstract void dotheDish();
    abstract void cleanUp();
}

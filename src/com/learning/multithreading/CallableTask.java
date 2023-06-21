package com.learning.multithreading;

import java.util.concurrent.Callable;

class CallableTask implements Callable<String> {

    private final String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        //Thread.sleep(1000);
        return "Hello " + name;
    }
}

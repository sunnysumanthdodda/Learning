package com.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new ThreadBasicsRunner.Task1());
        executorService.execute(new Thread(new ThreadBasicsRunner.Task2()));
        executorService.shutdown();
    }
}

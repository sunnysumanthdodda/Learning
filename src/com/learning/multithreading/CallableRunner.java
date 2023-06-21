package com.learning.multithreading;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = newSingleThreadExecutor();
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Sunny Sumanth"));
        System.out.print("Executed \n");
        System.out.println(welcomeFuture.get());
        System.out.println("Main method completed");
        executorService.shutdown();
    }
}

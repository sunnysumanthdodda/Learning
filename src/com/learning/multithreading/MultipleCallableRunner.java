package com.learning.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("Sunny")
                ,new CallableTask("Sumanth")
                ,new CallableTask("Dodda"));
        List<Future<String>> results = executorService.invokeAll(tasks);
        for(Future<String> result:results){
            Thread.sleep(500);
            System.out.println(result.get());
        }
        String result = executorService.invokeAny(tasks);
        System.out.println(result);
        executorService.shutdown();
    }
}

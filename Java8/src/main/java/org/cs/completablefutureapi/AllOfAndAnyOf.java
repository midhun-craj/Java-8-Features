package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class AllOfAndAnyOf {
    public static void main(String[] args) {

        // allOf()
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> System.out.println("Task 1 completed.")),
                CompletableFuture.runAsync(() -> System.out.println("Task 2 completed.")),
                CompletableFuture.runAsync(() -> System.out.println("Task 3 completed."))
        );
        allFutures.join();
        System.out.println("All tasks completed.");

        // anyOf()
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            return "Task1 completed.";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            return "Task2 completed.";
        });

        CompletableFuture<Object> result = CompletableFuture.anyOf(future1, future2);
        System.out.println(result.join());
    }
}

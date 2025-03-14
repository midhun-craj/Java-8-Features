package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class HandlingResults {
    public static void main(String[] args) {
        // thenApply()
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10)
                .thenApply(n -> n * 2);
        System.out.println(future1.join());

        // thenAccept()
        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenAccept(r -> System.out.println("Result: " + r));
        future2.join();

        //thenRun()
        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> "Task completed")
                .thenRun(() -> System.out.println("Execution completed"));
        future3.join();
    }
}

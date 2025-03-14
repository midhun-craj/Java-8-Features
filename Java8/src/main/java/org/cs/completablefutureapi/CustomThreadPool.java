package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Hello from custom thread pool.";
        }, executor);

        System.out.println(future.join());
        executor.shutdown();
    }
}

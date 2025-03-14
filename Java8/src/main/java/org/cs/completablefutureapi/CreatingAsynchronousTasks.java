package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class CreatingAsynchronousTasks {
    public static void main(String[] args) {

        // supplyAsync()
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            return "Asynchronous task completed.";
        });

        System.out.println(future.join());

        // runAsync()
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Running asynchronously.");
        });

        future1.join();
    }
}

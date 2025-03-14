package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class HandlingErrors {
    public static void main(String[] args) {

        // exceptionally()
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            if(true) throw new RuntimeException("Unknown Exception!");
            return 0;
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return 10;
        });
        System.out.println(future1.join());

        // handle()
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            if(true) throw new RuntimeException("Error!");
            return 10;
        }).handle((result, ex) -> {
            if(ex != null) {
                System.out.println("Exception: " + ex.getMessage());
                return 0;
            }
            return result;
        });
        System.out.println(future2.join());
    }
}

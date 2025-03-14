package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class CombiningCompletableFutures {
    public static void main(String[] args) {

        // thenCombine()
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, Integer::sum);
        System.out.println(combinedFuture.join());

        // thenCompose()
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenCompose(n -> CompletableFuture.supplyAsync(() -> n * 2));
        System.out.println(future.join());
    }
}

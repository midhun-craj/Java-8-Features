package org.cs.completablefutureapi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ListOfCompletableFuture {
    public static void main(String[] args) {
        List<CompletableFuture<Integer>> futures = Arrays.asList(
                CompletableFuture.supplyAsync(() -> 10),
                CompletableFuture.supplyAsync(() -> 20),
                CompletableFuture.supplyAsync(() -> 30),
                CompletableFuture.supplyAsync(() -> 40)
        );

        CompletableFuture<List<Integer>> future = CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenApply(v -> futures.stream()
                        .map(CompletableFuture::join)
                        .collect(Collectors.toList()));
        System.out.println(future.join());
    }
}

package org.cs.completablefutureapi;

import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        future.complete("This is explicitly completing the task");

        System.out.println(future.join());
    }
}

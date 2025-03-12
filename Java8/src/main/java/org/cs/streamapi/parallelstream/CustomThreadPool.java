package org.cs.streamapi.parallelstream;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class CustomThreadPool {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        forkJoinPool.submit(() ->
                IntStream.range(1, 11)
                        .parallel()
                        .forEachOrdered(i -> System.out.println(Thread.currentThread().getName() + " - " + i))
        ).join();

        forkJoinPool.shutdown();
    }
}

package org.cs.streamapi.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .parallel()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

        numbers.parallelStream()
                .forEachOrdered(n -> System.out.println(Thread.currentThread().getName() + " - " + n));
    }
}

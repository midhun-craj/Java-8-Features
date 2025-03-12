package org.cs.streamapi.terminaloperations;

import java.util.List;
import java.util.Optional;

public class MaxMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        max.ifPresent(System.out::println);
    }
}

package org.cs.streamapi.terminaloperations;

import java.util.List;
import java.util.Optional;

public class MinMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 2, 5, 4);
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        min.ifPresent(System.out::println);
    }
}

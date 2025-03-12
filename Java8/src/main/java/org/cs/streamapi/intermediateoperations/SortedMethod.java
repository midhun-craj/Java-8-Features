package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 2, 5, 4, 9, 8, 6, 7);
        List<Integer> list = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

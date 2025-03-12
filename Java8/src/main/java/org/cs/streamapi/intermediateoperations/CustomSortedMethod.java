package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class CustomSortedMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9, 8, 7, 6, 1, 3, 2, 4, 5);
        List<Integer> list = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

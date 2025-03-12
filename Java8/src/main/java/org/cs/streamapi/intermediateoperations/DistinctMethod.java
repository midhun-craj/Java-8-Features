package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 3, 4, 5, 5, 5, 6);
        List<Integer> list = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

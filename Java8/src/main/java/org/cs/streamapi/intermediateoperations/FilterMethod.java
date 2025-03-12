package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Integer> collected = integers.stream()
                .filter(n -> n % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}

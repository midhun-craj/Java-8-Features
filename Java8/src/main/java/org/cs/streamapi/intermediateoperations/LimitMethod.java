package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> list = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

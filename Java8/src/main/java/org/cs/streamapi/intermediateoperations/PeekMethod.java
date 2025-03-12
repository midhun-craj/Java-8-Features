package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class PeekMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> list = numbers.stream()
                .peek(n -> System.out.println("Before filtering " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filtering " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After mapping " + n ))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> list = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

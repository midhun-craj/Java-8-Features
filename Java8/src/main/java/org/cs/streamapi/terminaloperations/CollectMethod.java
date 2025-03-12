package org.cs.streamapi.terminaloperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}

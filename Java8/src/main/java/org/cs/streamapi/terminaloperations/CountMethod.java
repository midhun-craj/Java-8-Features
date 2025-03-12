package org.cs.streamapi.terminaloperations;

import java.util.List;

public class CountMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long count = numbers.stream()
                .count();
        System.out.println(count);
    }
}

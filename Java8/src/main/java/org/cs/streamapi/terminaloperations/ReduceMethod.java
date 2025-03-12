package org.cs.streamapi.terminaloperations;

import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        List<String> names = List.of("Sam", "Britney", "Josh", "Katy");
        String reduce = names.stream().
                reduce("", (a, b) -> a + " " + b);
        System.out.println(reduce);
    }
}

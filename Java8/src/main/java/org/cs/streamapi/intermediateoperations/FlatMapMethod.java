package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {
    public static void main(String[] args) {
        List<List<String>> lists = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        System.out.println(lists);
        List<String> collected = lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}

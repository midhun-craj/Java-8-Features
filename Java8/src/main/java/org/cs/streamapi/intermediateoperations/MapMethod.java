package org.cs.streamapi.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        List<String> names = List.of("Sam", "John", "Amanda", "Catherine");
        List<String> collected = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}

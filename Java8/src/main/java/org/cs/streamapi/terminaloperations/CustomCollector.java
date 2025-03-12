package org.cs.streamapi.terminaloperations;

import java.util.List;
import java.util.stream.Collectors;

public class CustomCollector {
    public static void main(String[] args) {
        List<String> alphabets = List.of("A", "B", "C", "D");

        String collect = alphabets.stream()
                .collect(Collectors.joining(" ", "{", "}"));
        System.out.println(collect);

    }
}

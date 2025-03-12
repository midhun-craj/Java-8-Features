package org.cs.streamapi.terminaloperations;

import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String> names = List.of("Midhun", "Malu", "Devu");
        names.stream()
                .forEach(System.out::println);
    }
}

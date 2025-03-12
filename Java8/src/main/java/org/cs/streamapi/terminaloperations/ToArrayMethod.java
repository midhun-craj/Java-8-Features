package org.cs.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<String> names = List.of("Midhun", "Malu");
        System.out.println(names);
        String[] array = names.stream()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}

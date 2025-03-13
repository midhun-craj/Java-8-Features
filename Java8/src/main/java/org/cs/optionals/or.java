package org.cs.optionals;

import java.util.Optional;

public class or {
    public static void main(String[] args) {
        // or() instead of orElse()
        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional1 = Optional.of("Fast API");

        String result = optional.or(() -> optional1).orElse("Unknown");
        System.out.println(result);
    }
}

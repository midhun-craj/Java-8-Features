package org.cs.optionals;

import java.util.Optional;

public class OptionalChecks {
    public static void main(String[] args) {
        // isPresent()
        Optional<String> optional = Optional.of("Midhun");
        System.out.println(optional.isPresent());

        // isPresent(Consumer)
        Optional<String> optional1 = Optional.of("Midhun");
        optional1.ifPresent(System.out::println);
    }
}

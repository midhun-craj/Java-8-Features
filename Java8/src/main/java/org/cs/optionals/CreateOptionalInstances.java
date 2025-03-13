package org.cs.optionals;

import java.util.Optional;

public class CreateOptionalInstances {
    public static void main(String[] args) {
        // empty optional
        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent());

        // No-Null value
        Optional<String> optional1 = Optional.of("Midhun");
        System.out.println(optional1.isPresent());

        // Nullable value
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.isPresent());
    }
}

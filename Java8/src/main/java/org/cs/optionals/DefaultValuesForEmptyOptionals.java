package org.cs.optionals;

import java.util.Optional;

public class DefaultValuesForEmptyOptionals {
    public static void main(String[] args) {
        // orElse(defaultValue)
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Unknown"));

        // orElseGet(Supplier)
        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.orElseGet(() -> "Unknown"));

        // orElseThrow(Supplier<Exception>)
        String name = (String) Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException("value is not present"));
        System.out.println(name);
    }
}

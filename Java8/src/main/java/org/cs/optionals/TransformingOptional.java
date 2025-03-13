package org.cs.optionals;

import java.util.Optional;

public class TransformingOptional {
    public static void main(String[] args) {
        // map(Function)
        Optional<String> optional = Optional.of("midhun");
        Optional<String> optional1 = optional.map(String::toUpperCase);
        System.out.println(optional1.get());

        // flatMap(Function<Optional>)
        Optional<Optional<String>> optional2 = Optional.of(Optional.of("value"));
        System.out.println(optional2.get());
        Optional<String> optional3 = optional2.flatMap(o -> o);
        System.out.println(optional3.get());
    }
}

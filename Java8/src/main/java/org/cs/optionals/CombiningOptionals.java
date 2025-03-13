package org.cs.optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class CombiningOptionals {
    public static void main(String[] args) {
        Optional<String> p1 = Optional.of("a");
        Optional<String> p2 = Optional.of("b");
        Optional<String> p3 = Optional.of("c");

        Optional<String> first = Stream.of(p1, p2, p3)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(first.get());
    }
}

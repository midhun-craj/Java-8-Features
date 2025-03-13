package org.cs.optionals;

import java.util.Optional;

public class FilterOptionals {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(10);
        Optional<Integer> optional1 = optional.filter(n -> n % 2 == 0);
        System.out.println(optional1.isPresent());
        Optional<Integer> optional2 = optional.filter(n -> n % 2 != 0);
        System.out.println(optional2.isPresent());
    }
}

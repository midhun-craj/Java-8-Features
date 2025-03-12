package org.cs.streamapi.terminaloperations;

import java.util.List;

public class AnyAllNoneMatchMethod {
    public static void main(String[] args) {
        List<String> names = List.of("Sam", "Alexa", "Phoebe", "Turner", "Spring");
        boolean any = names.stream()
                .anyMatch(name -> name.equalsIgnoreCase("Sam"));
        System.out.println(any);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean all = numbers.stream()
                .allMatch(num -> num % 2 == 0);
        System.out.println(all);

        boolean none = names.stream()
                .noneMatch(name -> name.equalsIgnoreCase("David"));
        System.out.println(none);
    }
}

package org.cs.streamapi.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Sam", "John", "Max");

        Stream<String> stream = names.stream();
        names.forEach(System.out::println);

        int[] arrayNumbers = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arrayNumbers);
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("Avengers", "Mad Max", "Superman", "Batman");
        stream2.forEach(System.out::println);
    }
}
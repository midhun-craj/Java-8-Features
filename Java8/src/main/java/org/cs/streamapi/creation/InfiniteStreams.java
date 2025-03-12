package org.cs.streamapi.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {
        List<Double> randNumbers = Stream.generate(Math::random).limit(10)
                .collect(Collectors.toList());
        System.out.println(randNumbers);

        List<Integer> sequence = Stream.iterate(0, n -> n + 1).limit(10)
                .collect(Collectors.toList());
        System.out.println(sequence);
    }
}

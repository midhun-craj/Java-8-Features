package org.cs.optionals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOptional {
    public static void main(String[] args) {
        List<Optional<String>> optional = List.of(Optional.of("java"),
                Optional.empty(),
                Optional.of("html"),
                Optional.empty(),
                Optional.of("javascript"));
        System.out.println(optional);

        List<String> flattenedList = optional.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}

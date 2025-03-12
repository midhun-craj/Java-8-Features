package org.cs.streamapi.parallelstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingPartitioning {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

        List<String> names = List.of("Sam", "Tim", "George", "Sandy", "Tyler", "Washington", "Philip", "Samantha");

        Map<Integer, List<String>> collect1 = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);
    }
}

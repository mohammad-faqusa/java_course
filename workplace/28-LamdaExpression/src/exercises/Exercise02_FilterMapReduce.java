package exercises;

// Exercise 02 – Filter, Map, Reduce with Streams and Lambdas
// -----------------------------------------------------------
// Tasks:
// 1) Given a list of words, filter out empty strings.
// 2) Map remaining words to their lengths.
// 3) Reduce (sum) the lengths to get total number of characters.
// 4) Print intermediate results to verify each step.
//
// Bonus:
// - Use method references where appropriate.
// - Create a predicate that checks if a string length is >= 4, then count how many words match.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise02_FilterMapReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "", "lambda", "api", "", "stream", "core");

        // TODO Step 1: filter out empty strings (Java 8):
        // List<String> nonEmpty = words.stream()
        //         .filter(s -> !s.isEmpty())
        //         .collect(Collectors.toList());

        // TODO Step 2: map remaining words to their lengths
        // List<Integer> lengths = nonEmpty.stream()
        //         .map(String::length)
        //         .collect(Collectors.toList());

        // TODO Step 3: reduce to sum of lengths
        // int totalChars = lengths.stream()
        //         .mapToInt(Integer::intValue)
        //         .sum();

        // TODO Step 4: print results
        // System.out.println("Non-empty: " + nonEmpty);
        // System.out.println("Lengths: " + lengths);
        // System.out.println("Total chars: " + totalChars);

        // Bonus TODOs
        // Predicate<String> lengthAtLeast4 = s -> s.length() >= 4;
        // long count = nonEmpty.stream().filter(lengthAtLeast4).count();
        // System.out.println("Words with length >= 4: " + count);

        // Guidance print
        System.out.println("TODOs: Implement filter/map/reduce with streams, plus bonus predicate.");
    }
}

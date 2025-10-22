package dev.lpa;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .map(Character::toUpperCase)
                .distinct()
//                .dropWhile(i -> Character.toUpperCase(i) <= 'E')
//                .takeWhile(i -> i < 'a')
//                .skip(5)
//                .filter(i -> Character.toUpperCase(i) > 'E')
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
        Random random = new Random();

        Stream.generate(() -> random.nextInt((int)'A', (int)'Z' + 1))
                .limit(50)
//                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
//        int maxSeats = 100;
//        int seatsInRow = 10;

//        var stream =
//                Stream.iterate(0, i -> i < maxSeats, i -> i + 1)
//                        .map(i -> new Seat((char) ('A' + i / seatsInRow), i % seatsInRow + 1))
//                        .skip(5)
//                        .limit(30)
//                        .peek(s -> System.out.println("--> " + s))
//                        .sorted(Comparator.comparingDouble(Seat::price)    // if price() returns double
//                                .thenComparing(Object::toString))
//                        .mapToDouble(Seat::price)
//                        .boxed()
//                        .map(d -> String.format("%.2f", d));               // Java 11 compatible
//
//        stream.forEach(System.out::println);

        int maxSeats = 100;
        int seatsInRow = 15;
        var stream = Stream.iterate(0, i -> i < maxSeats , i -> i + 1)
                .map(i -> new Seat((char)('A' + i/seatsInRow) , i % seatsInRow))
                .sorted(
                        Comparator
                                .comparingDouble((Seat s) -> {
                                    return s.price();   // extract the seat's price for comparison
                                })
                                .thenComparing((Seat s) -> {
                                    return s.toString(); // if two seats have same price, compare by their string form
                                }))
                .mapToDouble(Seat::price)
                .boxed()
                .map(d -> String.format("%.2f", d));

        stream.forEach(System.out::println);

    }
}

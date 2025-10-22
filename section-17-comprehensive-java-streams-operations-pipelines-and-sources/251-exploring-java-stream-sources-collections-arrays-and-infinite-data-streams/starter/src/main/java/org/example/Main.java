package org.example;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<String> balls = new ArrayList<>();

        int starter = 1;
        for(char c : "BINGO".toCharArray()) {
            for(int i = starter ; i < starter + 15 ; i++) {
                balls.add("" + c + i);
            }
            starter +=15;
        }

//        balls.forEach(System.out::println);

        System.out.println("--------------------------------------------");
        Collections.shuffle(balls);

//        List<String> firstOnes = balls.subList(0,15);
        List<String> firstOnes = new ArrayList<>(balls.subList(0,15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if(s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                return s.charAt(0)+ "-" + s.substring(1);
//                System.out.print(updated + " ");
            }
            return s;
        });
        firstOnes.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("---------------------------------------------");
        balls.subList(0,15).forEach(System.out::println);
        System.out.println("---------------------------------------------");

        var tempStream = balls.stream()
                .limit(15)
                .filter(s-> s.startsWith("O") || s.startsWith("G"))
                .map(s ->  s.charAt(0) + "-" + s.substring(1))
                .sorted();
//                .forEach(s -> System.out.print(s + " "));

        tempStream.forEach(s -> System.out.print(s + " "));
        System.out.println("----------------------------------------------");
//        tempStream.forEach(s -> System.out.print(s.toLowerCase() + " "));

        String[] numArr = {"One", "Two", "Three"};
        var firstStream = Arrays.stream(numArr)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

        var secondStream = Stream.of("Six", "Five", "Four")
                .map(String::toUpperCase);
//                .forEach(System.out::println);

        Stream.concat(secondStream, firstStream)
                .map(s -> s.charAt(0) + " - " + s)
                .forEach(System.out::println);

        Map<Character, int[]> mapArrays = new LinkedHashMap<>();
        int loopIndex  = 1;

        for(char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int labelNum = loopIndex;
            Arrays.setAll(numbers, i -> i + labelNum);
            mapArrays.put(c, numbers);
            loopIndex += 15;
        }
        System.out.println("--------------------------------------------------");
        mapArrays.entrySet().stream()
                .map(s -> "The numbers range of " + s.getKey() + " is " + s.getValue()[0] + " to " + s.getValue()[s.getValue().length - 1])
                .forEach(System.out::println);


        System.out.println("---------------------------------------------------");
        Random rand = new Random();
        Stream.generate(() -> rand.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------------------");

        IntStream.iterate(1, n -> n + 1)
                .filter(Main::isPrime)
                .limit(20)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------------------");

        IntStream.iterate(1, n -> n <= 100 , n -> n + 1)
                .filter(Main::isPrime)
//                .limit(20)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------------------");

        IntStream.range(1, 100)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("-----------------------------------------------------");

        IntStream.rangeClosed(1, 100)
                .filter(Main::isPrime)
                .forEach(s -> System.out.print(s + " "));

    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2)
            return wholeNumber == 2;

        for (int divisor = 2 ; divisor < wholeNumber ; divisor++) {
            if(wholeNumber % divisor == 0) return  false;
        }
        return true;
    }
}
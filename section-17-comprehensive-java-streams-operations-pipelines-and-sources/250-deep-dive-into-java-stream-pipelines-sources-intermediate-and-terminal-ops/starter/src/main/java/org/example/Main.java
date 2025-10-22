package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        var firsSream = balls.stream()
                .limit(15)
                .filter(s-> s.startsWith("O") || s.startsWith("G"))
                .map(s ->  s.charAt(0) + "-" + s.substring(1))
                .sorted();
//                .forEach(s -> System.out.print(s + " "));

        firsSream.forEach(s -> System.out.print(s + " "));
        System.out.println("----------------------------------------------");
//        firsSream.forEach(s -> System.out.print(s.toLowerCase() + " "));

    }
}
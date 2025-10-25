package dev.lpa;

public class Main {

    public static void main(String[] args) {
//        int maxMinusFive  = Integer.MAX_VALUE - 5;
//        for (int j = 0, id = maxMinusFive ; j < 10 ;id = Math.incrementExact(id), j++) {
//            System.out.println("Assigning id %,d%n".formatted(id));
//
//        }

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println(Math.abs((long)Integer.MIN_VALUE));

        System.out.println("Max = " + Math.max(-10, 10));
        System.out.println("Min = " + Math.min(10.00000002, 10.0001f));

        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round up = " + Math.round(10.8));
        System.out.println("Round ? = " + Math.round(10.5));
        System.out.println("Floor = " + Math.floor(10.5));
        System.out.println("Ceil = " + Math.ceil(10.5));

        // power

        // sqrt



    }
}

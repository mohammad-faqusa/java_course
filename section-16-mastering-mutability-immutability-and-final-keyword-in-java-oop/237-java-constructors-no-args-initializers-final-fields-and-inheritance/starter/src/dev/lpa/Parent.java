package dev.lpa;

import java.util.Random;

public class Parent {


    private final String name;
    private final String dob ;

    protected final int siblings;

    {
        System.out.println("Parent : initializer");
    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("Parent : constructor");
    }

}

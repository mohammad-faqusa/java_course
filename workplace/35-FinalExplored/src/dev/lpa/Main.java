package dev.lpa;

import consumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;
import external.util.Logger;
import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("=--------------------------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("=--------------------------------------");


        System.out.println("=--------------------------------------");
        parent.recommendedStatic();
        System.out.println("=--------------------------------------");
        child.recommendedStatic();
        System.out.println("=--------------------------------------");
        childReferredToAsBase.recommendedStatic();

        System.out.println("=--------------------------------------");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArguments = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArguments);
        System.out.println("After method , xArguments: " + xArgument);
        System.out.println("After method , zArguments: " + zArguments);

//        Utils util = new Util();

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);
    }

    private static void doXYZ( String x, int y, final StringBuilder z ) {
        final String c = x + y;
        System.out.println(" c = " + c);
        x = c;
        z.append(y);
    }

}

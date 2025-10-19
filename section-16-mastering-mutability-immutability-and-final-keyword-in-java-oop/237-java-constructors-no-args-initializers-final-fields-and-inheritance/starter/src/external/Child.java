package external;

import dev.lpa.Parent;

import java.util.Random;

public class Child extends Parent {


    private final int childOrder;

    private final String childOrderString;

    {
        childOrder = getOrder();
    }

    {
        if(childOrder == 1) childOrderString = "1st";
        else if(childOrder == 2) childOrderString = "2nd";
        else if(childOrder == 3) childOrderString = "3rd";
        else childOrderString = "4th";
        System.out.println("Child : initializer");
    }

    public Child() {
        super("child" , "12/12/2020", 4);
        System.out.println("Child : constructor");

    }

    public int getOrder() {
        if(siblings == 0) return 1;
        return new Random().nextInt(1, siblings + 2);
    }
}

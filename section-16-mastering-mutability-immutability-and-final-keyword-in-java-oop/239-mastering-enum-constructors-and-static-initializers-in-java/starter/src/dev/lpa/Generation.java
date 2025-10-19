package dev.lpa;

public enum Generation {

    CHILD {
        {
            System.out.println("this is child " + this);
        }
    },
    YOUNG("Young", "two") {
        {
            System.out.println("this is young " );
        }
    },
    ADULT("adult", "three"),
    OLD("old", "four");

    private final String name;
    private final String order;

    Generation() {
        this("Unknown", "Unknown");
    }

    Generation(String name, String order) {
        this.name = name;
        this.order = order;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +", order='" + order+ '\'';
    }
}


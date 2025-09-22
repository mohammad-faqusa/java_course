package dev.lpa;

public class Main {

    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        jim.setName("Joe");
//
//        Person john = new Person();
//        john.setName("John");
//        john.setDob("30/5/2002");
//        john.setKids(new Person[]{jane, jim, joe});
//        System.out.println(john);
//
//        john.setName("Jacob");
//        john.setKids(new Person[] {new Person(), new Person()});
//        System.out.println(john);

        Person jane = new Person("Jane", "30/5/2002");
        Person jim = new Person("Jim", "30/5/2002");
        Person joe = new Person("Joe", "30/5/2002");

        Person[] johnKids = new Person[]{jane, jim, joe};
        Person john = new Person("John", "30/5/2002");

        System.out.println(john);

        john.setKids(new Person[] {new Person("Ann", "30/5/2002")});

        Person[] kids = john.getKids();
        kids[0]=jim;
        System.out.println(john);

        kids = null;
        System.out.println(john);

        john.setKids(kids);
        System.out.println(john);

    }
}

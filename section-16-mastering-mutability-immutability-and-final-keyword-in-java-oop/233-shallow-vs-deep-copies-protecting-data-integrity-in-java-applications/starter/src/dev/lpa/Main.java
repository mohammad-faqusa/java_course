package dev.lpa;

import java.util.Arrays;

record Person(String name, String dob, Person[] kids){

    public Person(Person person) {
        this(person.name(), person.dob(), person.kids() == null ? null : Arrays.copyOf(person.kids(), person.kids().length));
    }
    @Override
    public String toString() {
        StringBuilder strKids = new StringBuilder();
        if(kids != null) {
            String[] kidsNames = new String[kids.length];
            Arrays.setAll(kidsNames, i -> kids[i].name());
            strKids.append(String.join(", ", kidsNames));
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                 (strKids.isEmpty() ?  "" : (", kids=" + strKids.toString())) + '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Person ahmad = new Person("ahmad", "2025-01-01", null );
        Person mohammad = new Person("mohammad", "2002-01-01", null);
        Person ali = new Person("ali", "2000-01-01", new Person[]{ahmad, mohammad});
        Person sami = new Person("sami", "2022-01-01", null );
        Person jim = new Person("jim", "2003-01-01", new Person[]{sami});

        Person[] people = {ahmad, mohammad, ali, sami, jim};
//        Person[] peopleCopy = Arrays.copyOf(people, people.length);

        Person[] peopleCopy = new Person[people.length];
//        for (int i = 0; i < peopleCopy.length; i++) {

//            var current = people[i];
//            var kids = current.kids();
//            peopleCopy[i] = new Person(current.name(), current.dob(), kids == null ? null : Arrays.copyOf(kids, kids.length));
//        }

        Arrays.setAll(peopleCopy, i -> new Person(people[i]));
//        peopleCopy = people.clone(); // shallow copy


        var aliKids = people[2].kids();
        aliKids[0] = jim;

        for (int i = 0; i < peopleCopy.length; i++) {
            if(people[i] == peopleCopy[i])
                System.out.println("Equal --------------- " + people[i]);
        }
    }
}

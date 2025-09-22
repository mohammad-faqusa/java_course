package dev.external;

import dev.hacker.PersonOfInterest;
import dev.lpa.Person;
import dev.lpa.PersonImmutable;

import java.util.Arrays;

public class MainImmutable {

    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("Jane", "30/5/2002");
        PersonImmutable jim = new PersonImmutable("Jim", "30/5/2002");
        PersonImmutable joe = new PersonImmutable("Joe", "30/5/2002");

        PersonImmutable[] johnKids = new PersonImmutable[]{jane, jim, joe};
        PersonImmutable john = new PersonImmutable("John", "30/5/2002", johnKids);

        System.out.println(john);


        PersonImmutable[] kids = john.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Ann", "33/3/2002");
        System.out.println(john);

        johnKids[0] = new PersonImmutable("Ann", "33/3/2002");
        System.out.println(john);

        LivingPerson johnLiving = new LivingPerson(john.getName(), john.getKids());
        System.out.println(johnLiving);

        LivingPerson anne = new LivingPerson("Ann", null);
        johnLiving.addKid(anne);
        System.out.println(johnLiving);

        PersonOfInterest johnCopy = new PersonOfInterest(john);
        System.out.println(johnCopy);

        kids = johnCopy.getKids();
        kids[1] = anne;
        System.out.println(johnCopy);
        System.out.println(john);
    }
}

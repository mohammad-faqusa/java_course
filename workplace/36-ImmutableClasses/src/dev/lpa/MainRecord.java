package dev.lpa;

public class MainRecord {

    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("Jane", "30/5/2002");
        PersonRecord jim = new PersonRecord("Jim", "30/5/2002");
        PersonRecord joe = new PersonRecord("Joe", "30/5/2002");

        PersonRecord[] johnKids = new PersonRecord[]{jane, jim, joe};
        PersonRecord john = new PersonRecord("John", "30/5/2002", johnKids);

        System.out.println(john);

        PersonRecord johnCopy = new PersonRecord("John", "30/5/2002");
        System.out.println(johnCopy);

        PersonRecord[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann", "33/3/2002");
        System.out.println(johnCopy);

        johnKids[0] = new PersonRecord("Ann", "33/3/2002");
        System.out.println(john);
    }
}

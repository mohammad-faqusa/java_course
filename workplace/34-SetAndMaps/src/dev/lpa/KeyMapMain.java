package dev.lpa;

import java.util.*;

public class KeyMapMain {

    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        phones.forEach(s -> contacts.put(s.getName(), s));
        emails.forEach(s -> contacts.put(s.getName(), s));

        Set<String> contactNames = contacts.keySet();
        System.out.println("-".repeat(90));
        System.out.println("conatct names set : ");
        System.out.println(contactNames);
        System.out.println("-".repeat(90));
        System.out.println("contact names tree set : ");
        Set<String> contactsNamesTree = new TreeSet<>(contacts.keySet());
        System.out.println(contactsNamesTree);

    }
}

package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        List<Contact> fullList = new ArrayList<>(emails);
        fullList.addAll(phones);


        System.out.println("========================================");
        System.out.println("The full list: ");
        System.out.println("========================================");
        fullList.forEach(System.out::println);


        Map<String, Contact> contacts = new HashMap<>();

        for(Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }

        contacts.forEach((s, v) -> System.out.println("key : " + s + " value : " + v));


        System.out.println("-".repeat(90));

//        System.out.println(contacts.get("Charlie Brown"));

        Contact defaultContact = new Contact("Chuck brown");

        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(90));

        contacts.clear();
        for(Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null) {
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((s ,v ) -> System.out.println("key=" + s + " value=" + v));

        System.out.println("-".repeat(90));
        contacts.clear();

        for(Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if(duplicate != null ) {
                System.out.println("duplicate="+duplicate);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((s ,v ) -> System.out.println("key=" + s + " value=" + v));

        contacts.clear();

        System.out.println("-".repeat(90));
        fullList.forEach(s -> contacts.merge(s.getName(), s,
                Contact::mergeContactData
                ));
        contacts.forEach((s ,v ) -> System.out.println("key=" + s + " value=" + v));

        System.out.println("-".repeat(90));

        for(String name : new String[]{"Daffy Duck", "Ahmad Faqusa", "Ali Faqusa"}){
//            contacts.compute(name,(k , v) -> new Contact(k) );
//            contacts.computeIfAbsent(name,k-> new Contact(k) );
            contacts.computeIfPresent(name,(k, v) -> new Contact(v.getName() + " Computed") );
        }
        contacts.forEach((s ,v ) -> System.out.println("key=" + s + " value=" + v));
        System.out.println("-".repeat(90));
    }
}

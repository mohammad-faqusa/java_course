import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        printContacts(phones);
        printContacts(emails);

        Set<Contact> contactEmails = new HashSet<>(emails);
        Set<Contact> contactPhones = new HashSet<>(phones);

        printContacts(contactEmails);
        printContacts(contactPhones);

        List<Contact> contactList = new ArrayList<>(contactEmails);
        contactList.get(0).addEmail("Google");
        contactList.get(0).addEmail("Google");



    }

    public static void printContacts(Collection<Contact> contacts){
        contacts.forEach(System.out::println);
    }
} 
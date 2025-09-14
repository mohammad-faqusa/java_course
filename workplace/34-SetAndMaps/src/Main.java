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
        contactList.get(0).addEmail("Facebook");
        contactList.get(0).addEmail("Yahoo");
        contactList.get(0).addEmail("Gmail");
        contactList.get(0).addEmail("Amazon");



        Set<String> setA = new HashSet<>(Arrays.asList("Mohammad", "Ahmad", "Ali", "Hammam", "Sina"));
        Set<String> setB = new HashSet<>(Arrays.asList("Hasan", "Mohammad", "Ayman", "Amjad"));



        // union
        Set<String> setAandB = new HashSet<>(setA);
        setAandB.addAll(setB);

        System.out.println("Set A union B" + setAandB);

        // overlap
        Set<String> setAoverlapC = new HashSet<>(setA);
        setAoverlapC.retainAll(setB);
        System.out.println("Set A overlap B" + setAoverlapC);

        // difference
        Set<String> symmetricDifference = new HashSet<>(setAandB);
        symmetricDifference.removeAll(setAoverlapC);
        System.out.println("Set A difference B" + setAoverlapC);

    }

    public static void printContacts(Collection<Contact> contacts){
        contacts.forEach(System.out::println);
    }
} 
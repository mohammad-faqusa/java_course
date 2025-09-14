import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        printContacts(phones);
        printContacts(emails);

    }

    public static void printContacts(Collection<Contact> contacts){
        contacts.forEach(System.out::println);
    }
} 
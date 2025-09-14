import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {

    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this.name = name;
    }

    public  Contact (String name, String email) {
        this.name = name;
        if(email != null) {
            emails.add(email);
        }
    }

    public  Contact (String name, long phone) {
        this.name = name;
        String strPhone = String.valueOf(phone);
        String formattedPhone = "(%s) %s %s".formatted(strPhone.substring(0,3), strPhone.substring(3,6), strPhone.substring(6));
        phones.add(formattedPhone);
    }

    public Contact (String name, String email, long phone) {
        this.name = name;
        if(email != null) {
            emails.add(email);
        }
        String strPhone = String.valueOf(phone);
        String formattedPhone = "(%s) %s %s".formatted(strPhone.substring(0,3), strPhone.substring(3,6), strPhone.substring(6));
        phones.add(formattedPhone);
    }

    public Contact mergeContactData(Contact contact) {
        Contact newContact = new Contact(name);

        newContact.emails = new HashSet<String>(this.emails);
        newContact.phones = new HashSet<String>(this.phones);

        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);

        return newContact;
    }

    @Override
    public String toString() {
        return "%s : emails: %s  phones: %s".formatted(name, emails, phones);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(emails, contact.emails) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, emails, phones);
    }

    public void addEmail(String companyName) {
        String [] names = name.split(" ");

        String email = "%c%s@%s.com".formatted(names[0].charAt(0), names[names.length -1], companyName.replaceAll(" ", "").toLowerCase());

        if(!emails.add(email)) {
            System.out.println("Email already in use");
        } else {
            System.out.println("the email " + email + " is added successfully ");
        }
    }
}
## Coding Exercise 44: Mobile Phone Contacts: Managing a List of Names & Calls

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null) return false;
        if (findContact(contact.getName()) >= 0) return false; // requires Contact.equals
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (oldContact == null || newContact == null) return false;

        int idx = myContacts.indexOf(oldContact);
        if (idx < 0) return false;

        // optional: avoid duplicates if newContact already exists
        if (myContacts.contains(newContact) && !Objects.equals(oldContact, newContact)) {
            return false;
        }

        myContacts.set(idx, newContact); // replace in place to preserve order
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (contact == null) return false;
        return myContacts.remove(contact); // returns true if removed
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        if (name == null) return -1;
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            if (name.equals(c.getName())) { // remove the stray semicolon; put return inside
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int idx = findContact(name);

        return (idx >= 0) ? myContacts.get(idx) : null;
    }

    public void printContacts() {
        int count = 1;
        System.out.println("Contact List:");
        for(Contact c : myContacts) {
            System.out.println(count++ + ". "+ c.getName() + " -> " + c.getPhoneNumber());
        }
    }
}

```
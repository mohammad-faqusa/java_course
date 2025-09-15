import javax.smartcardio.Card;
import java.util.*;

public class TreeChallenge {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        Comparator<Contact> sortByName = Comparator.comparing(Contact::getName);

        NavigableSet<Contact> mySorted = new TreeSet<Contact>(sortByName);
        mySorted.addAll(phones);
        mySorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        emails.forEach(s -> justNames.add(s.getName()));
        System.out.println(justNames);

        NavigableSet<Contact> fullSet = new TreeSet<>(emails);
        fullSet.addAll(phones);



        List<Contact> fullList = new ArrayList<>();
        fullList.addAll(emails);
        fullList.sort(mySorted.comparator());
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullList , mySorted.comparator());
        Contact max = Collections.max(fullList , mySorted.comparator());

        System.out.println(min);
        System.out.println(max);

        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println(first);
        System.out.println(last);

        NavigableSet<Contact> copiesSet = new TreeSet<>(fullSet);
        System.out.println(copiesSet);
        System.out.println("Remove last element : " + copiesSet.pollLast());
        System.out.println("Remove First element : " + copiesSet.pollFirst());
        System.out.println(copiesSet);

        Contact mohammad = new Contact("mohammad");
        Contact ali = new Contact("ali");
        Contact ahmad = new Contact("ahmad");
        Contact hasan = new Contact("hasan");
        Contact ehsan = new Contact("ehsan");

        for(Contact contact : List.of(mohammad, ali, ahmad, hasan, ehsan)) {
            System.out.printf("ceiling(%s)=%s%n", contact.getName(), fullSet.ceiling(contact));
            System.out.printf("higher(%s)=%s%n", contact.getName(), fullSet.higher(contact));
        }

        for(Contact contact : List.of(mohammad, ali, ahmad, hasan, ehsan)) {
            System.out.printf("ceiling(%s)=%s%n", contact.getName(), fullSet.floor(contact));
            System.out.printf("higher(%s)=%s%n", contact.getName(), fullSet.lower(contact));
        }


    }
}

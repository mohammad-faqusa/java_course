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
        fullSet.addAll(emails);



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

    }
}

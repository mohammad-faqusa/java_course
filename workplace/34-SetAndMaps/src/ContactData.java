import java.util.*;

public class ContactData {

    private static final String phones = """
    Mohammad Faqusa , 599870267
    Ahmad Faqusa , 568661281
    Sina Faqusa , 568661281
""";

    private static final String emails = """
            Mohammad Faqusa , mohammad@gmail.com
            Mohammad Faqusa , mohammad@gmail.com
            Ahmad Faqusa , ahmad@gmail.com
            Sina Faqusa , sina@gmail.com
            """;

    public static List<Contact> getData(String type) {

        List<Contact> contacts = new ArrayList<>();

        Scanner scanner = new Scanner(type == "phone" ? phones : emails);
        while(scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type == "phone") {
                contacts.add(new Contact(data[0], Long.parseLong(data[1])));
            } else if (type == "email") {
                contacts.add(new Contact(data[0], data[1]));
            }
        }

        return contacts;
    }
}

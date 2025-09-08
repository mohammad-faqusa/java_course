import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();

        String[] names = {"Mohammad", "Khaled" , "Hasan" , "Faqusa"};

        list.addAll(List.of(names));

        System.out.println(list);

        list.add("Ali");

        list.addAll(List.of("Ahmad" , "Odai" , "Ismail"));

        System.out.println(list);

        list.removeIf(s -> s.charAt(0) == 'A');

        System.out.println(list);

//        list.sort()
    }
}
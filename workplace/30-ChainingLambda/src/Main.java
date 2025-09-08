import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String firstName = "Mohammad";

        Function<String, String> uCase = String::toUpperCase;

        uCase.apply("Mohammad");

        Function<String,String> lastName = s -> s.concat(" FAQUSA");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(firstName));

        System.out.println(uCase.andThen(lastName).apply("Mohammad"));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply("Mohammad"));

        Function<String, String> f0 = uCase
                .andThen(s -> s.split(" "))
                .andThen(Arrays::asList)
                .andThen(ArrayList::new)
                .andThen(s -> {Collections.reverse(s); return s;})
                .andThen(list -> String.join(" ", list));

        System.out.println(f0.apply("Mohammad Khaled Hasan Faqusa"));

        Predicate<String> p0 = s -> s.equals("Mohammad");
        Predicate<String> p1 = s -> s.equalsIgnoreCase("Mohammad");
        Predicate<String> p2 = s -> s.startsWith("M");
        Predicate<String> p3 = s -> s.endsWith("d");

        Predicate<String> combined1  = p1.or(p2);
        System.out.println(combined1.test("Mohammad"));

        Predicate<String> combined2  = p2.and(p3);
        System.out.println(combined2.test("Mohammad"));

        Predicate<String> combined3  = p2.and(p3).negate();
        System.out.println(combined3.test("Mohammad"));



    }
}
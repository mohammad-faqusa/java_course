import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        double result = operation((a , b) -> (a + b) , 10.5 , 5.5);

        var coords = Arrays.asList(
                new Double[] {1.0, 1.0, 3.0},
                new Double[] {4.0, 5.0, 6.0},
                new Double[] {7.0, 8.0, 9.0}
        );

        coords.forEach((s) -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> cons = (Double a , Double b) -> System.out.println("this is long : " + a + ", this is lat : " + b);

        processPoint(cons, coords.get(0)[0], coords.get(0)[1]);
        processPoint((Double a , Double b) -> System.out.println("this is long : " + a + ", this is lat : " + b), coords.get(0)[0], coords.get(0)[1]);


        coords.forEach((s) -> processPoint(cons, s[0], s[1]));

        BiPredicate predicateLambda = (a, b) -> Objects.equals(a, b);

        if(predicateProcess(predicateLambda, 5.0 , 5.0)) {
            System.out.println("the values are equal");
        } else {
            System.out.println("the values are not equal");
        }

//        coords.removeIf(s -> Objects.equals(s[0], s[1]));

//        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        var names = new ArrayList<String>(List.of("Mohammad", "Ahmad", "Khaled"));

        names.replaceAll(s -> s.charAt(0) + " - " + s );
        System.out.println(names);

        Function<Integer, String> functionLambda = (a) -> "This is the argument : " + a;
        System.out.println(functionLambda.apply(5));

        Consumer<String> consLambda = (a) -> System.out.println("This is the argument : " + a);
        consLambda.accept("hi");

        System.out.println(((Function<Integer, String>)((a) -> "This is the argument : " + a)).apply(10));

    }

    public static <T> T operation(Calculator<T> operator, T a , T b) {

        T result = operator.apply(a, b);
        System.out.println("Result: " + result);
        return result;
    }

    public static <T> void processPoint(BiConsumer<T, T> consumer, T a , T b) {
        consumer.accept(a, b);
        System.out.println("consumed process function");
    }

    public static <T> boolean predicateProcess(BiPredicate<T, T> predicate, T a, T b) {
        return predicate.test(a, b);
    }
}

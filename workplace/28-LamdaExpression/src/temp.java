import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.*;

public class temp {
    public static void main(String[] args) {
        List<Double[]> coords = new ArrayList<>(Arrays.asList(
                new Double[]{1.0, 1.0, 3.0},
                new Double[]{4.0, 5.0, 6.0},
                new Double[]{7.0, 8.0, 9.0}
        ));

        BiPredicate<Double, Double> predicateLambda = (Double a, Double b) ->  Objects.equals(a, b);


        coords.removeIf(s -> predicateProcess(predicateLambda , s[0], s[1])); // or Double.compare(s[0], s[1]) == 0

        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        // -> [4.0, 5.0, 6.0]
        // -> [7.0, 8.0, 9.0]
    }

    public static <T> boolean predicateProcess(BiPredicate<T, T> predicate, T a, T b) {
        return predicate.test(a, b);
    }
}

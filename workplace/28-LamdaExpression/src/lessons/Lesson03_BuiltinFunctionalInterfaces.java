package lessons;

// Lesson 03 – Built-in Functional Interfaces
// ------------------------------------------
// java.util.function provides a rich set of functional interfaces:
// - Supplier<T>: T get()
// - Consumer<T>: void accept(T t)
// - Function<T,R>: R apply(T t)
// - Predicate<T>: boolean test(T t)
// - BiFunction<T,U,R>: R apply(T t, U u)
// - UnaryOperator<T>: T apply(T t) (a Function where input == output)
// - BinaryOperator<T>: T apply(T a, T b) (a BiFunction where both inputs and output are the same type)
// Plus primitive specializations: IntSupplier, IntPredicate, IntUnaryOperator, etc.

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Lesson03_BuiltinFunctionalInterfaces {
    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        System.out.println("Supplier: " + supplier.get());

        Consumer<String> printer = s -> System.out.println("Consumed: " + s);
        printer.accept("Hello Consumer");

        Function<String, Integer> length = String::length; // method reference
        System.out.println("Function length: " + length.apply("abcd"));

        Predicate<String> nonEmpty = s -> s != null && !s.isEmpty();
        System.out.println("Predicate nonEmpty('x'): " + nonEmpty.test("x"));
        System.out.println("Predicate nonEmpty(''): " + nonEmpty.test(""));

        BiFunction<Integer, Integer, Integer> max = Integer::max;
        System.out.println("BiFunction max: " + max.apply(10, 20));

        UnaryOperator<String> shout = s -> s.toUpperCase() + "!";
        System.out.println("UnaryOperator: " + shout.apply("go"));

        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println("BinaryOperator sum: " + sum.apply(7, 8));

        // Small stream example using predicates and functions
        List<String> words = Arrays.asList("java", "", "lambda", "api", "", "stream");
        long nonEmptyCount = words.stream()
                .filter(nonEmpty)
                .map(shout)
                .count();
        System.out.println("Non-empty count (after map): " + nonEmptyCount);
    }
}

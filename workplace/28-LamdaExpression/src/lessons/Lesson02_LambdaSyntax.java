package lessons;

// Lesson 02 – Lambda Syntax and Variations
// ----------------------------------------
// Syntax patterns:
// 1) (a, b) -> a + b                      // expression body (implicit return)
// 2) (a, b) -> { return a + b; }          // block body (explicit return)
// 3) a -> a * a                           // single parameter can omit parentheses if type is inferred
// 4) (int a, int b) -> a + b              // explicit parameter types (rarely needed)
// 5) () -> 42                              // no parameters
//
// Notes:
// - Type inference: the target functional interface determines parameter and return types.
// - Local variables used inside lambdas must be effectively final.

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lesson02_LambdaSyntax {
    public static void main(String[] args) {
        // Expression vs block bodies
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> addBlock = (a, b) -> { return a + b; };
        System.out.println("add: " + add.apply(2, 3));
        System.out.println("addBlock: " + addBlock.apply(2, 3));

        // Single-parameter lambda (square)
        Function<Integer, Integer> square = x -> x * x; // parentheses omitted
        System.out.println("square(6): " + square.apply(6));

        // Explicit parameter types (usually not necessary)
        BiFunction<Integer, Integer, Integer> subtract = (Integer a, Integer b) -> a - b;
        System.out.println("subtract: " + subtract.apply(10, 4));

        // No-arg lambda (Supplier)
        Supplier<Double> random = () -> Math.random();
        System.out.println("random: " + random.get());

        // Effectively final example
        String greeting = "Hello"; // effectively final (not modified later)
        Function<String, String> greeter = name -> greeting + ", " + name; // OK
        System.out.println(greeter.apply("Lambda"));

        // The following would NOT compile if uncommented because it tries to mutate a captured variable:
        // int base = 10;
        // Function<Integer, Integer> f = n -> { base++; return base + n; }; // error: base must be effectively final
    }
}

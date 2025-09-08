package lessons;

// Lesson 04 – Method References
// -----------------------------
// Four common forms:
// 1) Static method:           TypeName::staticMethod
// 2) Instance method (object): instanceRef::instanceMethod
// 3) Instance method (type):   TypeName::instanceMethod
// 4) Constructor:             TypeName::new
//
// Notes:
// - Overloaded methods can cause ambiguity. Use an explicit target type (cast) to disambiguate.

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lesson04_MethodReferences {
    static int staticAdd(int a, int b) { return a + b; }

    public static void main(String[] args) {
        // 1) Static method reference
        BiFunction<Integer, Integer, Integer> add1 = Lesson04_MethodReferences::staticAdd;
        System.out.println("Static ref add: " + add1.apply(2, 3));

        // 2) Instance method on a specific instance
        String prefix = "Hello, ";
        Function<String, String> prepend = prefix::concat;
        System.out.println(prepend.apply("lambda"));

        // 3) Instance method on an arbitrary instance of a type
        Function<String, Integer> len = String::length;
        System.out.println("length(\"abc\"): " + len.apply("abc"));

        // 4) Constructor reference
        Supplier<StringBuilder> sbNew = StringBuilder::new;
        System.out.println("new StringBuilder().length(): " + sbNew.get().length());

        // Ambiguity example (overloads) – cast to pick the right functional interface
        BiFunction<Integer, Integer, Integer> max = (BiFunction<Integer, Integer, Integer>) Integer::max;
        System.out.println("max(10, 20): " + max.apply(10, 20));
    }
}

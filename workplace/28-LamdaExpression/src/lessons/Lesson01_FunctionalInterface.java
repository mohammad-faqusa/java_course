// Lesson 01 – Functional Interfaces: What and Why
// ------------------------------------------------
// In Java, a "functional interface" is an interface with exactly one abstract method.
// Lambdas can be assigned to functional interface types. This is the foundation of lambdas in Java.
//
// Examples of functional interfaces:
// - java.lang.Runnable (void run())
// - java.util.function.Function<T, R> (R apply(T t))
// - java.util.function.Predicate<T> (boolean test(T t))
// - java.util.function.Supplier<T> (T get())
// - java.util.function.Consumer<T> (void accept(T t))
//
// In this lesson, we'll compare anonymous inner classes vs. lambdas using our own Calculator interface.

package lessons;

public class Lesson01_FunctionalInterface {

    // A simple functional interface (you already have Calculator in this project too)
    @FunctionalInterface
    interface IntBinaryOp {
        int apply(int a, int b);
    }

    public static void main(String[] args) {
        // Anonymous inner class (pre-Java 8 style)
        IntBinaryOp addOld = new IntBinaryOp() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Anonymous class add: " + addOld.apply(3, 4));

        // Lambda expression (Java 8+)
        IntBinaryOp add = (a, b) -> a + b; // concise and readable
        System.out.println("Lambda add: " + add.apply(3, 4));

        // Lambdas can be passed as parameters where a functional interface is expected
        doOperation(5, 6, (x, y) -> x * y); // multiply

        // Statement block lambdas (use when you need more than one statement)
        IntBinaryOp safeDivide = (x, y) -> {
            if (y == 0) return 0; // avoid division by zero for demo purposes
            return x / y;
        };
        System.out.println("Safe divide: " + safeDivide.apply(12, 3));
    }

    private static void doOperation(int a, int b, IntBinaryOp op) {
        int result = op.apply(a, b);
        System.out.println("Result: " + result);
    }
}

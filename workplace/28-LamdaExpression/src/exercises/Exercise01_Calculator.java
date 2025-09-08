package exercises;

// Exercise 01 – Calculator Operations with Lambdas
// -------------------------------------------------
// Tasks:
// 1) Implement lambdas for add, subtract, multiply, and safeDivide using the functional interface defined below.
// 2) Pass each operation to the provided doOp method and print results.
// 3) Create a custom operation: max of two numbers.
//
// Note: This exercise defines its own functional interface `Calc` to avoid package coupling.

public class Exercise01_Calculator {

    @FunctionalInterface
    interface Calc { int apply(int a, int b); }

    public static void main(String[] args) {
        // TODO: define lambdas for add, subtract, multiply, safeDivide, and max.
        // Example:
        // Calc add = (a, b) -> a + b;

        // TODO: call doOp for each operation and print results for inputs (10, 5) and (7, 0)
        // Example:
        // doOp(10, 5, add);

        // Remove the following guidance print once done
        System.out.println("TODOs: Implement Calc lambdas (add, subtract, multiply, safeDivide, max) and call doOp.");
    }

    private static void doOp(int a, int b, Calc op) {
        int result = op.apply(a, b);
        System.out.println("Result(" + a + "," + b + "): " + result);
    }
}

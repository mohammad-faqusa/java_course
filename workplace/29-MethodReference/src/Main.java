import java.util.function.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class PlainOld {

    private static int IDCOUNTER = 1;

    private int id ;

    public PlainOld() {

        id = IDCOUNTER++;
        System.out.println("This is a plain old object with id : "  + id);
    }
}
public class Main {
    public static void main(String[] args) {

        calculator(Integer::sum, 5 , 4);
        calculator(Double::sum, 5.5 , 4.9);

        Supplier<PlainOld> supplyOld = PlainOld::new;
        System.out.println(supplyOld.get());

        createPlainArray(PlainOld::new, 10);

        calculator(String::concat, "hello" , "world");

        BinaryOperator<String> strlamda = (str1, str2) -> str1 + str2;
        System.out.println(strlamda.apply("hello", "world"));

        BiFunction<String, String, String> str3lambda = String::concat;
        System.out.println(str3lambda.apply("hello", "world"));

        UnaryOperator<String> unaryLambda = String::toUpperCase;
        System.out.println(unaryLambda.apply("hello"));

        String transfomred = "hello".transform(unaryLambda);

        System.out.println(transfomred);

        Function<String, String> functionLambda = String::toUpperCase;

        String transformed2 = "Hello World".transform(functionLambda);

        Function<String, Boolean> functionLambda2 = String::isEmpty;
        System.out.println("".transform(functionLambda2));
        System.out.println("Hello".transform(functionLambda2));
    }

    private static <T> void calculator(BinaryOperator<T> binaryLambda , T a , T b) {

        T result =  binaryLambda.apply(a, b);
        System.out.println("The result is : " +result);
    }

    private static void createPlainArray(Supplier<PlainOld> supplyOld, int count) {
        PlainOld[]  array = new PlainOld[count];
        for (int i = 0; i < count; i++) {
            array[i] = supplyOld.get();
        }
    }
}
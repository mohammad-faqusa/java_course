import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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
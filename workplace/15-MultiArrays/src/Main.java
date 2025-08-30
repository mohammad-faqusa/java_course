import java.util.Arrays;
import java.lang.Object;

public class Main {

    public static void main(String[] args) {

        // previous code ...

        int[][] array2 = new int[3][];
        array2[0] = new int[] {10, 20, 30};
//        array2[0] = {10, 20, 30}; // can't use array anonymous initializer;
        array2[1] = new int[] {40, 50, 60};
        array2[2] = new int[] {70, 80, 90};

        System.out.println(Arrays.deepToString(array2));

        Object[] multiArray = new Object[3];
        multiArray[0] = new Dog[3];
        multiArray[1] = new Dog[3][];
        multiArray[2] = new Dog[3][][];

        Object [] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String [] {"a", "b", "c"};

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };

        anyArray[2] = new int[2][2][2];

//        anyArray[2] = "mohammad";

        System.out.println(Arrays.deepToString(anyArray));

        for(Object obj : anyArray) {
            System.out.println("Element Type = " + obj.getClass().getName());
            System.out.println("Element toString = " + obj.toString());
            System.out.println(Arrays.deepToString( (Object[]) obj ));
        }
    }
}
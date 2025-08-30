

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // declare another reference to the same memory

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray[1] = 20;
        modifyArray(anotherArray);

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[2] = 5;
    }
}
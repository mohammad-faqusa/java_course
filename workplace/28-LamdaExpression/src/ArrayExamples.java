import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        String[] emptyStrings = new String[10];
        emptyStrings[0] = "a";

        Arrays.fill(emptyStrings, ",");

        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, i -> i + ". " + switch(i) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            default -> "unknown";
        });

        System.out.println(Arrays.toString(emptyStrings));
    }
}

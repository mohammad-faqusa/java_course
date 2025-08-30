import java.util.Arrays;

public class MethodArgs {

    public static void main(String... args) {
        System.out.println("Hello world again");

        String splitStrings = Arrays.toString("hello world again".split(" "));
        printText(splitStrings);
        printText(splitStrings);

        System.out.println("_".repeat(20));
//        when using printText(String... textList)
        printText("Hello"); // this is a single string
        printText("Hello", "World", "again"); // this is a single string

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));


    }



    private static void printText(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }
}
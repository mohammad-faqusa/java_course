public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and goodbye"); // it will not assign to original variable
//        StringBuilder helloWorldBuilder = "hello world"; // error , use new keyword
        StringBuilder helloWorldBuilder = new StringBuilder("hello" + " world");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("hello" + " world");
        builderPlus.append(" and goodbye");

        builderPlus.deleteCharAt(builderPlus.indexOf("g"));
        printInformation(builderPlus);
        builderPlus.reverse().setLength(7);
        printInformation(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public static void printInformation(StringBuilder string) {
        System.out.println("StringBuilder = " + string);
        System.out.println("length = " + string.length());
        System.out.println("Capacity = " + string.capacity()); // by defualt StringBuilder initialize with capacity of 16

    }
}

public class Main {

    public static void main(String[] args) {
        printInformation("Hello World!");
        printInformation("");
        printInformation("\t        \n");

        System.out.printf("Index of World is = %d%n", "Hello World!".indexOf("World"));
        System.out.printf("Index of l is = %d%n", "Hello World!".indexOf("l"));
        System.out.printf("last Index of l is = %d%n", "Hello World!".lastIndexOf("l"));
        System.out.printf("Index of l is = %d%n", "Hello World!".indexOf("l",3 ));
        System.out.printf("last Index of l is = %d%n", "Helllo World!".lastIndexOf("l", 8));

        String str1 = "hello world";
        String str2 = "Hello World";

        System.out.println(str1.equals(str2) ? "They are equal" : "They are not equal");
        System.out.println(str1.equalsIgnoreCase(str2)? "They are equal if ignored" : "They are not equal if ignored");

        if(str1.startsWith(str2)){

        }
    }

    public static void printInformation(String info) {

        int length = info.length();
        System.out.printf("Your String length is %d%n", length);
        if(info.isEmpty()) return;

        if(info.isBlank()){
            System.out.println("String is balnk");
        }

        System.out.printf("First char = %c %n", info.charAt(0));
        System.out.printf("Last char = %c %n", info.charAt(info.length()-1));

    }
}

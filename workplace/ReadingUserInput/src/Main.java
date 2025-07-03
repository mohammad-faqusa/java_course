public class Main {
    public static void main(String[] args) {
        {
            int currentYear = 2022;
            String userDataOfBirth = "1999";

            int dateOfBirth = Integer.parseInt(userDataOfBirth);

            System.out.println("Age = " + (currentYear - dateOfBirth));
        }
        {
            int currentYear = 2022;
            System.out.println(getInputFromConsole(currentYear));
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hello, " + name + "!");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}

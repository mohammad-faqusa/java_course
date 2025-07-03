import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int currentYear = 2022;
            String userDataOfBirth = "1999";


            int dateOfBirth = Integer.parseInt(userDataOfBirth);

            System.out.println("Age = " + (currentYear - dateOfBirth));
        }
        try{
            int currentYear = 2022;
//            System.out.println(getInputFromConsole(currentYear));
            System.out.println(getInputFromScanner(currentYear));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hello, " + name + "!");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("enter your age");
        int age = Integer.parseInt(scanner.nextLine());

        return "Your name is "+ name + " Your age is " + age;
    }
}

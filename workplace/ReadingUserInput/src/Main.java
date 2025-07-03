import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int currentYear = 2022;
            String userDataOfBirth = "1999";


            int dateOfBirth = Integer.parseInt(userDataOfBirth);

            System.out.println("Age = " + (currentYear - dateOfBirth));
        }
        boolean isValidDob = false;
        do {
            System.out.println("Please enter your data of birth: ");
            try{
                Scanner input = new Scanner(System.in);
                int age = checkData(2025, input.nextLine());
                if(age > 0 ) {
                    isValidDob = true;

                } else {
                    continue;
                }
                System.out.println("Age = " + (age));

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid data of birth");
            }
        }while(!isValidDob);
        try{
            int currentYear = 2025;
//            System.out.println(getInputFromConsole(currentYear));

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

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);

        if(dob > currentYear ||  dob < currentYear - 125 )
            return -1 ;
        return currentYear - dob;
    }
}

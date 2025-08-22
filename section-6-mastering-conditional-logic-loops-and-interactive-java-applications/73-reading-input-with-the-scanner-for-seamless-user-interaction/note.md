## 73. Reading Input With The Scanner For Seamless User Interaction

### the process 
* write validation methods 
  * data type 
  * negative values 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        getInputFromScanner(2025);
    }

    public static String getInputFromConsole(int currentYear) { // run the method form command line, it is not supported in ide

        String name = System.console().readLine("Hi, What's your Name?");
        System.out.println("Thanks " + name);
        return name;

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name ? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for takign the course");

        System.out.println("What year were you born?");


        boolean validDOB = false;
        int age = 0 ;

        do {
            System.out.println("Enter a year of birth : ");
            try{
                age  = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;

                if(validDOB)
                    System.out.println("age = " + age);

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }


        } while (!validDOB);


        return "So you are " + age + " years old";
    }

    public static int checkData (int currentYear , String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear  - 125;

        if((dob< minimumYear || (dob > currentYear))) {
            return -1;
        }

        return (currentYear - dob);
    }
}
```
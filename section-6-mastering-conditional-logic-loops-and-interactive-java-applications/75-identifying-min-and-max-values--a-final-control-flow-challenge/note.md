## 75. Identifying Min And Max Values – A Final Control Flow Challenge

### Min and Max Challenge 
* prompt user to enter number or any character to quit 
* validate the entered number
* if the user data is not a number , quit the loop 
* keep track of minimum entered number 
* keep track of maximum entered number 
* when quit, display the min and max numbers 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max  = Integer.MIN_VALUE;
        boolean atLeastOneTry = false;
        do {
            System.out.println("Enter number #");
            try{

                int number = Integer.parseInt(scanner.nextLine());
                min = number < min ? number : min;
                max = number > max ? number : max;
                atLeastOneTry = true;

            } catch(NumberFormatException e) {
                System.out.println("Invalid Input number ");
                if(atLeastOneTry) {
                    System.out.println("This is the min " + min);
                    System.out.println("This is the max " + max);
                }
                break;
            }
        } while(true);
        
    }
}
```

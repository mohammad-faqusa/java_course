## 74. Hands-On Reading User Input Challenge For Practical Mastery

### Reading User Input Challenge 
* read 5 valid numbers 
* print the sum of numbers
* check if entered are valid integers 
  * else : print out : invalid number 
* prompt user with message `Enter number #x`

* hint : 
  * use do while , or while 
  * use string 
  * use scanner 
  * use Integer.parse


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1 ;
        int sum = 0;
        do {
            System.out.println("Enter number #" + count);
            try{

                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                count++;

            } catch(NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        } while(count <= 5);

        System.out.println("Here is the sum : "  + sum );

    }
}
```
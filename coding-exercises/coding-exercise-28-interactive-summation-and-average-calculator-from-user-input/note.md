## Coding Exercise 28: Interactive Summation And Average Calculator From User Input

```java
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        do {
            try {
                int number = Integer.parseInt(sc.nextLine());
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                average = Math.round((double) sum / count);
                System.out.println("SUM = " + sum + " AVG = " +  average);
                break;
            }
        } while(true);
    }
}

```
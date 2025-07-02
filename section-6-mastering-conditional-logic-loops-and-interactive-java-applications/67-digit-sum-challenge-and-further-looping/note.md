## digit sum challenge 

```java
public class SumDigit {
    public static void main(String [] args) {
        int number = 1234;
        System.out.println("this is the sum digit of number " + number + " " + sumDigits(number));
    }

    public static int sumDigits(int number) {
        int sum = 0 ;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;

        }
        return sum;

    }
}

```

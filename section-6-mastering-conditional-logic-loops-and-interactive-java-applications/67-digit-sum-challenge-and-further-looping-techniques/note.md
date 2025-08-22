## 67. Digit Sum Challenge And Further Looping Techniques

#### Digit sum challenge 

```java

public class Main {

    public static void main(String[] args) {

        int number = 1234566;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            System.out.println(digit);
            sum += digit;
        }
    }
}
}
```
## Coding Exercise 22: Deriving The Greatest Common Divisor (GCD) Efficiently
```java
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }

        return first; // or second (they are equal here)
    }
}

```
## Coding Exercise 20: Evaluating The Last Digit For Multiple Integer Comparisons

```java
public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if(!isValid(num1));
        if(!isValid(num2));
        if(!isValid(num3));
        
        int lastDigit1 = num1 % 10; 
        int lastDigit2 = num2 % 10; 
        int lastDigit3 = num3 % 10; 
        
        int count = 0; 
        
        if(lastDigit1 == lastDigit2) count++; 
        if(lastDigit1 == lastDigit3) count++; 
        if(lastDigit2 == lastDigit3) count++; 
        
        return count >= 2; 
        
        
    }
    
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }
}
```
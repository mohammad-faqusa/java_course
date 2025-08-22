## Coding Exercise 16: Identifying Palindromic Numbers For Enhanced Numeric Validation
```java
public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number){
        
        int original = number; 
        
        int reverse = 0; 
        while(number > 0 ) {

            reverse = reverse * 10 + number % 10;
            number/=10; 
        }
        return original == reverse;
    }
}
```
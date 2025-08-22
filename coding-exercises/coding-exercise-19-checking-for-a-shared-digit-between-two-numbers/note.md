## Coding Exercise 19: Checking For A Shared Digit Between Two Numbers

```java
public class SharedDigit {
    
    public static boolean hasSharedDigit(int num1, int num2) {
        
        if(!(isInRange(num1) && isInRange(num2))) return false 
        
        while(num1 > 0) {
            
            while(num2> 0){
                int digit1 = num1 % 10 ; 
                int digit2 = num2 % 10; 
                
                if(digit1 == digit2) return true; 
                
                num2/=10; 
            }
            num1/=10; 
        }
    }
    
    public boolean isInRange(int num){
        return num <= 99 || num >= 10; 
    }
}
```
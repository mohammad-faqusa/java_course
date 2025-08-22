## Coding Exercise 17: Summing The First And Last Digits Of An Integer

```java
public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) return -1; 
        
        int firstNumber = 0, lastNumber = 0; 
        
        firstNumber = number % 10; 
        
        while(number / 10 != 0) {
            
            number /= 10; 
            if(number < 10) {
                lastNumber = number;
                break; 

            }
               
                
        }
        return firstNumber + lastNumber; 
        
        
    }
}
```
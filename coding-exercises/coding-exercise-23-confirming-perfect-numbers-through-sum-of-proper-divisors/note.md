## Coding Exercise 23: Confirming Perfect Numbers Through Sum Of Proper Divisors

```java

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number <= 0 ) 
            return false ;
        
        int sum = 0; 
        
        for(int i = 1; i < number ; i++) {
            if(number % i == 0) 
                sum += i; 
        }
        
        if(sum == number) return true ;
        return false;
    }
}
```
## Coding Exercise 21: Listing All Factors Of A Given Number
```java
public class FactorPrinter { 
    
    public static void printFactors(int number) {
        
        if(number < 1){
            System.out.print("Invalid Value");
            return;
        }
        
        for(int i = 2 ; i < number ; i++) {
            if(number % i == 0)
                System.out.print(i + " ");
        }
            
    }
}
```
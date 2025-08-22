## 62. Comprehensive for Loop Challenge To Strengthen Iteration Skills

### The for statement challenge exercise 
* view the prime number example website at this [link](https://www.mathsisfun.com/prime_numbers.html) 

```java
public class Main {

    public static void main(String[] args) {

        for (int number = 1; number < 20; number++) {
            System.out.println("The number " + number + (isPrime(number) ? " is Prime " : " is not Prime"));
        }
        
    }
    
    public static boolean isPrime(int wholeNumber) {
        
        if(wholeNumber <= 2)
            return (wholeNumber ==2); 
        
        for (int divisor = 2; divison < wholeNumber / 2; divison++ ) {
            if(wholeNumber % divisor == 0)
                return false; 
        }
        
        return true; 
    }
}
```

#### the for loop challenge 
* create prime number counter 
* max number = 1000 
* using prime number method 
```jshelllanguage
int count = 0; 
for (int number = 1; number < 50; number++) {
    System.out.println("The number " + number + (isPrime(number) ? " is Prime " : " is not Prime"));
    if(isPrime(number))
        count++; 
}
System.out.println("the number of prime numbers : " + count);
```
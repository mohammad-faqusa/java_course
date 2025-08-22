## 61. Mastering The for Statement For Repetitive Task Automation

### Looping 
* for statement 


### three loop statements 
| Statements | Explanation                                                                                             |
|------------|---------------------------------------------------------------------------------------------------------|
| for        | The for loop is more complex to set up but is commonly used when you are iterating over a set of values |
| while      | the while loop executes until a specified condition becomes false                                       |
| do while   | the do while loop always executed at least one and continues until a specified condition become false   |

#### the for statement 
* loops something until condition is satisfied 
* given number of times, or condition specified 
```jshelllanguage
for (int i = 0; i < 5 ; i++) {
    
    // block of statements 
}
```
* `int i = 0` the initialization section 
* `i < 5` : expression section, once it becomes false, the loop terminate 
* `i++`: increment section, or any bounded operation 

```java
public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0  ; rate++) {
            System.out.println("10000 at " + rate +  " interest = " + calculateInterest(10000, rate));
        }

        double amount = 100; 
        for (double rate = 7.5; rate <= 10  ; rate += 0.25) {
            System.out.println(amount + " at " + rate +  " interest = " + calculateInterest(amount, rate));
        }

    }
    
    public static double calculateInterest(double amount, double interestRate) {
        
        return (amount * (interestRate / 100)); 
    }
}
```

mini challenge : 
* call the interest methdo with amount of 100
* interest rate is between 7.5 and 10, increment by quarter , += .25; 
```jshelllanguage
double amount = 100;
for (double rate = 7.5; rate <= 10; rate += 0.25) {
    System.out.println(amount + " at " + rate + " interest = " + calculateInterest(amount, rate));
}
```
##### break statement 
* used to terminate the loop at specific condition 


## 36. Advanced Conditional Logic: Implementing the Logical AND Operator in Java Code

### The process 

1. increase the tab coding size:  double click on class name window above 
2. lets add some code : 

```java
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Mohammad");
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false); {
            System.out.println("It is not an alien!");

        }
        
        int topScore = 100;
        if(topScore == 100) { // should return true 
            System.out.println("you got the high score!");
        }

        if(topScore != 100) { // should return false 
            System.out.println("you got the high score!");
        }
        
        // try other operators  : > , < ...
        // try other values : 80 , 120 
        
        
        int secondTopScore = 60; 
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
        // change top score to 81
        
    }

}
```

#### Operators :
* `&&`: and operator , `&` bitwise and 
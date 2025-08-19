## 44. Harnessing Code Blocks And The If-Then-Else Statement In Java

### introduction 
* express code blocks in if then statements 

### the process code
```java
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("your score is greater than 1000 and less than 5000");
        } else if (score < 1000) {
            System.out.println("yoru ");
        } else {
            System.out.println("Got here");
        }
    }
}
```

#### if then statement 
```jshelllanguage
if(condition) {
    
}
```
```jshelllanguage
if (score == 5000) {
    System.out.println("Your score was 5000");
}
```


#### if with else 
```jshelllanguage
if(condition) {
    
} else { 
    
}
```

example : 
```jshelllanguage
//int score = 5000; 
// int score = 1000; 
if (score < 5000) {
    System.out.println("your score is less than 5000");
} else {
    System.out.println("got here");
}
```

#### if with an else if and else block 
```jshelllanguage
if(firstCondition) {
    
} else if (secondCondition) {
    
} else {
    
}
```
##### exmaple : 
```jshelllanguage
//int score = 4000;
int score = 800;

if (score < 5000 && score > 1000) {
    System.out.println("your score is greater than 1000 and less than 5000");
} else if (score < 1000) {
    System.out.println("your score less than 1000");
} else {
    System.out.println("Got here");
}
```
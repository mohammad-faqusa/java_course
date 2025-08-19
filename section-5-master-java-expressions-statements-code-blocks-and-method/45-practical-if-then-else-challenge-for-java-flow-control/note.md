## 45. Practical If-Then-Else Challenge For Java Flow Control

### the process
1. copy and paste the Main class to name `MainChallenge`
```java
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score ;
        
        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
```
#### if then else challenge 
* set `score` = 10000
* set `levelcompelte` to 8 
* set `bonus` to 200
* if game over is true, then perform and get `finalScore`

```jshelllanguage
boolean gameOver = true;
int score = 1000;
int levelCompleted = 8;
int bonus = 200;

int finalScore = score ;

if(gameOver) {
    finalScore += (levelCompleted * bonus);
    System.out.println("Your final score was " + finalScore);
}
```

#### using the code multiple times 
* copy and paste : bad approach 
  * new variables names 
  * keep, but comment previous
  * disadvantages  
  keep data values as permanent 
* use methods (recommended) 
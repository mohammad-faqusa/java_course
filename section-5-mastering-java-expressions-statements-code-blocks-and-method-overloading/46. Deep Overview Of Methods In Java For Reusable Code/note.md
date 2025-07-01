## the method

```java
public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 8;
        int bonus  = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}
```

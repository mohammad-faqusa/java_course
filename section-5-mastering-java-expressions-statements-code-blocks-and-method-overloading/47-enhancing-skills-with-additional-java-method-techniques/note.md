```java
public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score: " + finalScore);
        score = 1000;
        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score: " + finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}
```

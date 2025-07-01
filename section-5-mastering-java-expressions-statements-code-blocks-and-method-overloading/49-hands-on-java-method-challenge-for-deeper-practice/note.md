## challenge

create two methods

**displayHighScorePosition :**

    parameters  : player name, player position in high score list

**calculateHighScorePoistion**

    parameter : player score

```java
public class MethodChallenge {
    public static void main(String[] args) {

        int highscorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("mohammad" ,highscorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + "managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else return 4;
    }
}
```

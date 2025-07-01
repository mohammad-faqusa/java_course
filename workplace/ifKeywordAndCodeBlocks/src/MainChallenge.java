public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

    }
}

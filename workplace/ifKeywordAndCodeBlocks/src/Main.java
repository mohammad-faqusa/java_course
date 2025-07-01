public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000) {
            System.out.println("Your score greater than 1000");
        } else if  (score < 1000 ) {
            System.out.println("Your score less than 1000");
        } else {
            System.out.println("Got here");
        }

    }
}

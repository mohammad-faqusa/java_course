public class Main {
    public static void main(String [] args){
        int finalScore = calculateScore("Mohammad", 100);
        System.out.println("This is the final score : " + finalScore);
        finalScore = calculateScore(44);
        System.out.println("This is the final score of player : " + finalScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player " + " scored " + score + " points");
        return score * 1000;
    }
}

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

        int newValue = 50;
        if (newValue = 50) {
            System.out.println("this is an error ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test"); // the print command is also statement

        System.out.println("This is" +
                " another" +
                " still more"); // the three lines are 1 statement

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable); // three statements with three semicolons


        if (myVariable == 0) {
            System.out.println("myVariable = 0");
        }
    }
}

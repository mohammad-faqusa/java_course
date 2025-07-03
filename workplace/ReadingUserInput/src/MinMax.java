import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int loopCount = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter a number : ");
            try {
                int number = Integer.parseInt(input.nextLine());
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                System.out.println("Exit from program");
                break;
            }
        } while (true);
        if (loopCount == 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }

    }
}

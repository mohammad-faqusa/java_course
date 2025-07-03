import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0 ;
        do {

            System.out.print("Enter number " + (count + 1) + ": ");
            try {
                int number = checkData(input.nextLine());
                count++ ;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }

        } while (count < 5);
        System.out.println("Sum = " + sum);
    }

    public static int checkData(String number) {
        return Integer.parseInt(number);
    }
}

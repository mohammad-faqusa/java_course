import java.util.Scanner;

public class InputCalculator {
    // write code here


    public static void inputThenPrintSumAndAverage(){

        int sum = 0; 
        int count = 0 ; 
        int average = 0 ; 
        Scanner input = new Scanner(System.in); 
        do{
            try{
                int number = Integer.parseInt(input.nextLine()); 
                sum += number; 
                count++; 

            }catch(NumberFormatException e){
                break; 
            }

        }while(true);

        average = (int)(Math.round((double)(sum)/count)); 

        System.out.print("SUM = " + sum + " AVG = " + average);

    }
}
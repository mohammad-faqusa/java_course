public class FactorPrinter {
    // write code here
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return; 
        }

        System.out.print("1");

        for(int i = 2 ; i <= number ; i++ ){
            if(number % i == 0)
                System.out.print(" " + i);
        }

    }
}
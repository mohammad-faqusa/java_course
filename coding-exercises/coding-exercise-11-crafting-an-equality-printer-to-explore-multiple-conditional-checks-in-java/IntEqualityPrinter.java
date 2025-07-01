public class IntEqualityPrinter {
    // write code here
    public static void printEqual(int num1, int num2, int num3) {
        if(num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int count = 0; 

        if(num1 == num2) 
            count++;
        if(num3 == num2)
            count++; 
        if(num1 == num3)
            count++; 
        
        if(count == 3){
            System.out.println("All numbers are equal");
            return; 
        }
        if(count == 1){
            System.out.println("Neither all are equal or different");
            return; 
        }
        System.out.print("All numbers are different");
        
    }
}
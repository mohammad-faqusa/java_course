public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int number) {

        if(number < 0 )
            return -1; 

        if(number == 0 )
            return 0; 
        

        int a = number % 10 ; 
        int b = 0 ; 
        while(number != 0){
            
            if(number <= 9){
                b = number; 
                break; 
            }
            number /= 10; 
        }   
        return a + b; 
    }
}
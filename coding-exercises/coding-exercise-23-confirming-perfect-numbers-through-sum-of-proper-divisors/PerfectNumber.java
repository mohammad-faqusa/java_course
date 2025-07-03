public class PerfectNumber {
    // write code here

    public static boolean isPerfectNumber(int number){
        if(number < 1)
            return false; 
        
        int sum = 1 ; 

        for(int i = 2 ; i < number ; i++ ){
            if(number % i == 0) sum += i; 
            if(sum > number ) return false;
        }

        return sum == number; 
    }
}
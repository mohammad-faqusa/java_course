public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number){

        if(number < 2)
            return -1; 

        int max = -1; 

        for(int i = 2 ; i <= number ; i++){
            
            if(number % i != 0 )
                continue; 
                
            boolean isPrime = true; 
            for(int j = 2 ; j < i ; j++ ){
                if(i % j == 0){
                    isPrime = false; 
                    break; 
                }
                 
            }
            if(isPrime) max = i; 
        }
        return max;

    }
}
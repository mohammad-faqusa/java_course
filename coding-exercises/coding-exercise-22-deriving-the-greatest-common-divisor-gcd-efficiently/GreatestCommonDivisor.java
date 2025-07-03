public class GreatestCommonDivisor {
    // write code here

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10)
            return -1; 
        
        int max = -1 ; 

        for(int i = 2 ; i <= first ; i++ ){
            if(first % i != 0 )
                continue; 
            for(int j = 2; j <= second ; j++ ){
                if(second % j != 0 )
                    continue; 
                if(i == j) max = i ; 
            }
        }
        
        return max; 
    }
    
}
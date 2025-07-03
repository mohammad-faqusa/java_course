public class FlourPacker {
    // write code here
    public static boolean canPack(int bigCount, int smallCount, int number) {

        if(number < 0)
            return false; 

        if(number <= smallCount && bigCount == 0)
            return true; 
        
        if(number <= bigCount * 5 + smallCount){
            int countedBig = 0 ; 
            
            int temp = number ; 

            while(temp >= 5) {
                temp-= 5; 
                countedBig++; 
            }

            return countedBig * 5 + smallCount >= number; 


        }
        return false; 
    }

}
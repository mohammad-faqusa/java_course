public class BarkingDog {
     // write code here
     public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0) return false; 

        if(isBarking){
            if(hourOfDay < 8 || hourOfDay > 22) return true; 
        }
        
        return false; 
     }
}
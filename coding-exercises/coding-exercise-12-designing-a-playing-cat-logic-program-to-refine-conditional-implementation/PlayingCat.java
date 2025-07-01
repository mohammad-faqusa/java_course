public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean isSummer, int temperature){
    
        return isSummer ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <= 35; 
    }
   
}
public class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit(int a , int b, int c) {
        
        if(!isValid(a)) return false; 
        if(!isValid(b)) return false; 
        if(!isValid(c)) return false; 

        if (a%10 == b%10) return true; 
        if (a%10 == c%10) return true; 
        if (b%10 == c%10) return true; 

        return false; 
        
    }

    public static boolean isValid(int num){
        return num >= 10 && num <=1000;
    }
}
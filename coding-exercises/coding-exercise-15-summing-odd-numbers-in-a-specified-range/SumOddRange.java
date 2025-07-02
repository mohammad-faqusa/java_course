public class SumOddRange {
    // write code here
    public static boolean isOdd(int number){
        if(number < 0)
            return false; 
        return number % 2 != 0; 
    }
    public static int sumOdd(int a , int b){
        if(a < 0 || b < 0 || a > b)
            return -1; 
        int sum = 0 ; 
        for (int i = a ; i <= b ; i++ ){
            sum += isOdd(i) ? i : 0 ; 
        }

        return sum; 
    }
}
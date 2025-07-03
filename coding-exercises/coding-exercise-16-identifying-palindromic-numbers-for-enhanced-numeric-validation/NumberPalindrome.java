public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number){

        number = Math.abs(number);

        String str = ""; 
        while(number != 0){

            str += number % 10; 
            number /= 10; 
            

        }

        for(int i = 0 , j = str.length() - 1 ; i < str.length()/2 ; i++ , j--){
            if(str.charAt(i) != str.charAt(j))
                return false; 
            
        }

        return true; 
    }


}
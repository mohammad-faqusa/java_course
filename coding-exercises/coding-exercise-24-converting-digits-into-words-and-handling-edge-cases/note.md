## Coding Exercise 24: Converting Digits Into Words And Handling Edge Cases

```java

public class NumberToWords {
    
    public static void numberToWords(int number) {
        
        if(number < 0) {
            System.out.print("Invalid Value");
            return; 
        }
        
        int digitCountNumber = getDigitCount(number);
        int reverse = reverse(number);
        int digitCountReverse = getDigitCount(reverse);
        
        int zerosCount = digitCountNumber - digitCountReverse; 
        
        while(reverse > 0) {
            int currentDigit  = reverse % 10; 
            String currentWord = switch(currentDigit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid Number"; 
            };
            System.out.println(currentWord);
            reverse /= 10;
        }
        
        while(zerosCount > 0) {
            System.out.println("Zero");
            zerosCount--; 
        }
    }
    
    public static int getDigitCount(int number) {
        if(number < 0)
            return -1; 
        
        if(number == 0)
            return 1; 
        
        int count = 0 ; 
        while(number > 0) {
            number /= 10; 
            count++;
        }
        
        return count;
    }
    
    public static int reverse(int number) {
        
        if (number  < 0) return -1; 
        
        int reverse = 0;
        
        while(number > 0) {
            int lastDigit = number % 10; 
            reverse = reverse * 10 + lastDigit; 
            number /= 10; 
        }
        return reverse;
    }
}
```
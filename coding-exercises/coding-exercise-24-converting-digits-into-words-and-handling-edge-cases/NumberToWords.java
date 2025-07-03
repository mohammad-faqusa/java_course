public class NumberToWords {
    // write code here

    public static void main(String[] args){
        System.out.println("");
        System.out.println(reverse(1234));

        numberToWords(1234);

        System.out.println("");
        System.out.println(reverse(10));
        numberToWords(10);
        System.out.println("");
        System.out.println("counted " + 123400 + " " + getDigitCount(123400));
        System.out.println("");
        numberToWords(0);

        System.out.println("");
        System.out.println("reverse " + (-2521) + " " + reverse(-2521));
    }

    
    public static void numberToWords(int number) {
        if(number < 0 ){
            System.out.print("Invalid Value");
            return; 
        }

        int temp = reverse(number); 

        if(temp == 0 ){
            System.out.print("Zero");
            return; 
        }

        int count = 0 ; 

        while(temp != 0 || count < getDigitCount(number)){
            count++; 
            if(temp == 0){
                System.out.print(" Zero");
                continue; 
            }
            int digit = temp % 10 ; 
            temp /= 10; 
            switch (digit) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
            if(temp != 0)
                System.out.print(" ");
        }
    }

    public static int reverse(int number){
        int reverse = 0;

        if(number == 0)
            return 0; 
        
        int sign = number/Math.abs(number); 
    
        int temp = Math.abs(number);
        while(temp > 9) {
            reverse += temp % 10 ; 
            temp /= 10; 
            reverse *= 10; 
        }
        reverse += temp; 

        return sign * Math.abs(reverse); 
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1; 

        int count = 0;

        if(number == 0)
            return 1; 
        

        while(number != 0){
            number /= 10; 
            count ++; 
        }

        return count ; 
    }
}
public class NumberOfDaysInMonth {
    // write code here
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false; 

        if(year % 4 == 0 ){
            if(year % 100 == 0){
                if(year % 400 == 0) return true;
                return false; 
            } else {
                return true;
            }
        }
        return false; 
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 0 || month > 12 ) return -1; 
        if (year < 0 || year > 9999) return -1; 
        
        int day = switch(month){
            case 1 , 3  , 5 , 7 , 8, 10 , 12 -> 31;
            case 4, 6, 9, 11 -> 30; 
            case 2 -> isLeapYear(year) ? 29 : 28; 
            default -> -1; 
        };
        return day; 
    }

}
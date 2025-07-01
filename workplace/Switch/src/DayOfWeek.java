public class DayOfWeek {
    public static void main(String[] args) {
        printDayOfWeek(7);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(2);
        printWeekDay(1);
        printWeekDay(0);
        printWeekDay(-1);

        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(2);
        printDayOfWeek(1);
        printDayOfWeek(0);
        printDayOfWeek(-1);
    }

    public static void  printDayOfWeek(int indx){
        String strDay = switch(indx){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String badResponse = indx + " has no valid day";
                yield badResponse;
            }
        };
        System.out.println(strDay);
    }

    public static void printWeekDay(int indx) {
        if (indx > 6 || indx < 0) {
            System.out.println("Invalid day");
            return;
        }
        if(indx == 0){
            System.out.println("Sunday");
            return;
        }
        if(indx == 1){
            System.out.println("Monday");
            return;
        }
        if(indx == 2){
            System.out.println("Tuesday");
            return;
        }
        if(indx == 3){
            System.out.println("Wednesday");
            return;
        }
        if(indx == 4){
            System.out.println("Thursday");
            return;
        }
        if(indx == 5){
            System.out.println("Friday");
            return;
        }
        if(indx == 6){
            System.out.println("Saturday");
            return;
        }
    }
}

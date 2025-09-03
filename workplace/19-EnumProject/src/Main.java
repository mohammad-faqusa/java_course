import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUE;
        System.out.println(weekDay);

        for(int i = 0 ; i < 10 ; i++ ) {
//            weekDay = getRandomDay();
//            System.out.printf("name is %s, original value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a friday!");
//            }

            for(Toppings topping : Toppings.values()) {
                System.out.println(topping.name() + " " + topping.getPrice( ));
            }
        }

    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
## 148. Enums (Part 2): Switch Expressions & Custom Methods in Enums

```java
import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUE;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
//            weekDay = getRandomDay();
//            System.out.printf("name is %s, original value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a friday!");
//            }
            
            switchDayOfWeek(weekDay); 
            
        }

    }

    public static void switchDayOfWeek(DayOfWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday" + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase());
        }
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
```

2. create enum Topping 

```java
public enum Topping {
    
    MUSTARD,
    PICKLES,
    CHEDDAR,
    TOMATO; // you hve to add semicolon if you want to customize methods 
    
    public double getPrice() {
        return switch(this) {
            case   MUSTARD -> 1.5; 
            case   PICKLES ->  2; 
            case   CHEDDAR -> 2.5; 
            case   TOMATO -> 0.5 ; 
        }; 
    }
}
```

3. back to main method 
```jshelllanguage

    public static void main(String[] args) {
        
    //.. previous 
        
        for(Topping t : toppings) {
            System.out.println("this is " + t.name() + " : " + topping.getPrice());
        }
    }
```
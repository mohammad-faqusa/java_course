## 147. Enums Demystified: Declaring & Using Predefined Constants

### enum definition 

### enum type : 
* predefined constants, all known and not changable 
* it is like a class, 

```java
public enum DayOfTheWeek {
    SUNDAY, MONDAY , ....
}
```

* is used to declare set of constants 
  * months of year 
  * directions 
  * .... 

### the code process 
1. create enum project 
2. on src , create new java class, select type enum (dev.lpa.DayOfTheWeek)

```java
public enum DayOfTheWeek {
    
    SUN, MON, TUES, WED, THURS, FRI, SAT // it is not a statement 
}
```

in main method :

```java
import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {

        DayOfWeek weekDay = DayOfWeek.TUES;
        System.out.println(weekDay);
        
        for(i = 0 ; i < 10 ; i++ ) {
            weekDay = getRandomDay();
            System.out.printf("name is %s, original value = %d%n", weekDay.name(), weekDay.ordinal());
        
            if(weekDay == DayOfWeek.FRI) {
                System.out.println("Found a friday!");
            }
        }

    }
    
    public static DayOfTheWeek getRandomDay() {
        
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values(); 
        return allDays[randomInteger]; 
    }
}
```
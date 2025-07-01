## seconds and minutes challenge

takes time to represetnt to seconds

then to hours

by using overloaded methods

create two methods with same name : **getDurationString**

first method parameter : seconds

second methdo parameters : munites, seconds

return string format : 'XXh YYm ZZs'

## at validation

use valudation to verify the boundary for each parameter (minuts)

## solution

```java
public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(600, 44));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Input";
        int hours =  seconds/3600;
        seconds =  seconds % 3600 ;
        int minutes = seconds/60;
        seconds = seconds % 60;

        return "'"+hours+"h "+minutes+"m "+seconds+"s'";
    }

    public static String getDurationString(int minutes, int seconds) {
        if(seconds < 0 || seconds > 60) return "Invalid Input";
        return getDurationString(minutes * 60 + seconds);
    }
}
```

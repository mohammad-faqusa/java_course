## 55. Detailed Bonus Challenge Solution And Key Insights

### Seconds and minutes challenge bonus 
we'll add validation to the methods as a bonus 
* for the first methdo 
  * the seconds parameter shouble be >= 0
* for second method 
  * minutes >= 0
    * seconds parameter : seconds >= 0 and <= 59

```java
public class MethodChallenge {

    public static String getDurationString(int seconds) {
        int hours ;
        int minutes;

        if(seconds < 0)
            return "Invalid input: negative seconds";
        
        hours = seconds / 3600;
        seconds %= 3600;

        minutes = seconds / 60;
        seconds %= 60;


        return hours+"h " + getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes , int seconds) {

        if(minutes >= 60 || minutes < 0 || seconds >= 60  || seconds < 0)
            return "invalid input minutes or seconds"; 
        return minutes + "m " + seconds +"s";
    }
}
```
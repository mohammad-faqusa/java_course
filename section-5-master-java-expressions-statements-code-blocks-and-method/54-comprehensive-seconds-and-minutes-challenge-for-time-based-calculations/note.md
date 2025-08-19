## 54. Comprehensive Seconds-And-Minutes Challenge For Time-Based Calculations

### Seconds And Minutes Challenge 
* create method that 
  * takes time in seconds 
  * transform to hours 
  * remaining to minutes and seconds 
  * String type 
  * do this in two steps that allows overloaded methdos 

* so , create two methods of name `getDurationString`
  * first method 
    * has two parameters (minutes and seconds) both are ints 
    * return String in format "XXh YYm ZZs"
    * should call the second method to return its results 

```java
public class MethodChallenge {

    public static String getDurationString(int seconds) {
        int hours ;
        int minutes;

        if(seconds < 0)
            return "";


        hours = seconds / 3600;
        seconds %= 3600;

        minutes = seconds / 60;
        seconds %= 60;


        return hours+"h " + getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes , int seconds) {

        return minutes + "m " + seconds +"s";
    }
}
```
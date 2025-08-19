## Coding Exercise 2: Implementing A Speed Converter To Practice Basic Java Arithmetic And Output


```java
public class SpeedConverter {
    // write code here
    
    public static long toMilesPerHour(double kilometersPerHour){
        
        if(kilometersPerHour < 0)
            return -1; 
        
        return Math.round(kilometersPerHour); 
    }
    
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            System.out.print(kilometersPerHour +" km/h = " + toMilesPerHour(kilometersPerHour)  + " mi/h");
        }
    }
    
}
```
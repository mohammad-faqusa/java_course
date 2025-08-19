## Coding Exercise 10: Implementing A Minutes-To-Years-And-Days Calculator For Advanced Time Conversions

```java
public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.print("Invalid Value");
            return;
        }
        int years = (int)(minutes / (365 * 24 * 60 )); 
        int days = (int)(minutes % (365 * 24 * 60 ))/(24 * 60);

        System.out.print(minutes + " min = " + years+" y and " + days + " d"  );

    }
}
```


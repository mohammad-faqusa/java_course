## links :

[feets to centimeters](https://www.metric-conversions.org/length/feet-to-centimeters.htm)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int feets, int inches) {
        return convertToCentimeters(12 * feets + inches);
    }

    public static double convertToCentimeters(int inches) {
        return Math.round(inches * 2.54 * 100)/100d;
    }
}

```

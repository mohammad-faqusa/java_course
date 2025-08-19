## 53. Practical Method Overloading Challenge To Strengthen Java Expertise

### Overload Method Challenge Instructions 
* create two methods with the same name 
  * first method  :
    * type int 
    * convert inches to centimeters 
    * return double 
  * second method 
    * two parameters of type int (height in feet, remaining hight in inches)
    * calculate to inches 
    * pass the inches to previous method 
* 1 inch = 2.54 cm 
* foot = 12 inches 

* [metric-conversion](https://www.metric-conversions.org/length/feet-to-centimeters.htm)

```java
public class MethodChallenge {
    
    public static double inchesToCentimeters(double inches) {
        
        return inches * 2.54; 
    }
    
    public static double feetsAndInchesToCentimeters(int feets, int inches) {
        return inchesToCentimeters(feets* 12 + inches); 
    }
}
```
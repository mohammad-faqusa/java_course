## 22. Working with Float and Double: Precision in Floating Point Numbers

### Floating-point Numbers 
* unlike the whole numbers, floading-oint numbers have fractional parts that we express with a decimal point 
* in this table, you can see some examples of floating point numbers and whole nubers 

| Whole number example | flaoting point example |
|----------------------|------------------------|
| 3                    | 3.124234               |
| 10000                | 10.0                   |
| -1212323432          | -0.066666666666667     |

* floating point numbers are also known **real numbers** 

### Floating-point Number Data types 
* we use floating point number when we need more precision 
* there are two primitive types in java , for expressing floating point numbers :  
float , double 


#### Single and Double Precision 
* Precision refers to the format and amount of space occupied by the relevant type 
* this table shows the width of each floating type, and ranges 

| data type | width | min value | max value    |
|-----------|-------|-----------|--------------|
| float     | 32    | 1.4E-45   | 3.4028235E38 |
| double    | 64    | 4.9E-324  | 1.79..E308   |    

* scientific notations : E-45  , E38 ... 

#### Java Scientific Notion: 
* can be translated intor more familiar terms :  
by replacing 'E' in the number , with the phrase : `times 10 to the power of`
* `1.4E-45` same as `1.4 * 10 ^ -45` 

* why using scientific notation ?  
imagine writing the min value of double, that would be many zeros to write after the zero 

```java
System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " +Float.MAX_VALUE + ") " );
System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " +Double.MAX_VALUE + ") " );
```



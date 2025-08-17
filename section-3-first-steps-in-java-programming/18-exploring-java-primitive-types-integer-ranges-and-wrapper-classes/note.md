## 18. Exploring Java Primitive Types: Integer Ranges and Wrapper Classes

### Introduction 
* we have been working on **int** 
* we also introduces the `wrapper class`, a special category of data type, which offers additional functionality that primitive types don't 

#### Java Primitive Types 
| whole number                    | real number (floating point or decimal) |
|---------------------------------|-----------------------------------------|
| byte<br/>short<br/>int<br/>long | float<br/>double                        |
| single character                | boolean value                           |
| char                            | boolean                                 |

* these types are building blocks of **data manipulation** 
* remember that **primitive data types** are simply placeholders in memory for a value 

```java
int myValue = 1000; 

```

##### What actually is an integer : 
an integer as a whole number, meaning it does'nt contain a fractional element, or a decimal 

##### What values can we store into Integer
* not infinite , defined in min and max 
```java
int myMinIntValue = Integer.MIN_VALUE; 
int myMaxIntValue = Integer.MAX_VALUE;
System.out.println("Integer Minumum Value = " + myMinIntValue);
System.out.println("Integer Minumum Value = " + Integer.MIN_VALUE);
System.out.println("Integer Range :  " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
System.out.print(
        "Integer Value Range ("
        +
        Integer.MIN_VALUE
        +
        " to "
        +
        Integer.MAX_VALUE
        +
        ")"
);
```

* `Integer` is a wrapper class 
* int vs Integer  
int is premitive type, that give us only option to set the variable  
Integer : is wrapper class 

#### Classes 
* is a building block for OOP, that allows us to build custom datatypes 
* Java uses the concept of **wrapper class** for all of its eight primtive datatypes  
provides simple operations , as well as some basic information which cannot be stored in primitive datatype 

| primitive | wrapper class |
|-----------|---------------|
| byte      | Byte          |
| short     | Short         |
| char      | Character     |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| boolean   | Boolean       |

#### The integer wrapper class 
* we have used `min` and `max`
```java
int myMinIntValue = Integer.MIN_VALUE; 
int myMaxIntValue = Integer.MAX_VALUE;
```
* lets add some values to these boundaries 
```java
System.out.println("Busted Max Value = "  + Integer.MAX_VALUE + 1);
System.out.println("Busted Min Value = "  + Integer.MIN_VALUE - 1);
```

output : 
```jshelllanguage
jshell> System.out.println("Busted Max Value = "  + (Integer.MAX_VALUE + 1));
Busted Max Value = -2147483648

jshell> System.out.println("Busted Min Value = "  + (Integer.MIN_VALUE - 1));
Busted Min Value = 2147483647
```

#### Overflow and Underflow in Java 
* the max value when overflows , wraps around to the min value 
* and vice versa for min value 
```jshelllanguage
jshell> int myMinIntValue = Integer.MIN_VALUE;
myMinIntValue ==> -2147483648

jshell> int myMaxIntValue = Integer.MAX_VALUE;
myMaxIntValue ==> 2147483647
```
* notice that min value ends with **8**  
and max value ends with **7**  

lets try to assign with more that max value by one 
```java
int testMaxValue = 2147483648
```
output : 
```jshelllanguage
jshell> int testMaxValue = 2147483648
|  Error:
|  integer number too large
|  int testMaxValue = 2147483648;
|
```

#### When will you get an overflow? when will you get an error ? 
* An integer wraparound event, either an overflow or underflow, can occur in java when you are using expressions that are **not a simple literal value** 
* the java **compiler does not attempt** to evaluate the expression to determine its value, so it DOES not give you an error 
* but if you assign numeric literal to data type that is outside of the range, the **compiler** DOES give you an **error** 

#### What does an underscore mean in a numeric literal 
* for exmaple this is not valid syntax :  
`int myMaxIntTest = 2,147,343,222`
* this is valid one :  
`int myMaxIntTest = 2_147_343_222`
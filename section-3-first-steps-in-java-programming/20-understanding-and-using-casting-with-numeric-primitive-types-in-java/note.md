## 20. Understanding and Using Casting with Numeric Primitive Types in Java

### Introduction 
* in the last video, we have introduced three data types :  
byte, short, and long 
* in this video, we will use additional types in some basic arithmetic 
* we will finish the video talking about **casting**  
why casting is necassary 


#### JShell process 
```java
short myMinShortvalue = Short.MIN_VALUE; int myMinValue = Integer.MIN_VALUE; 
byte myMinByteValue = Byte.MIN_VALUE, myMaxByte = Byte.MAX_VALUE;
int myMinIntValue = Integer.MIN_VALUE, myMaxInt = Integer.MAX_VALUE;
```
* you cannot declare of different datatypes in single statement 
* if you declare with the same datatype,  
you must specify data type only once before any variable names 

lets try to break the rule : 
```jshelllanguage
jshell> byte myMinByteValue = Byte.MIN_VALUE, byte myMaxByte = Byte.MAX_VALUE;
|  Error:
    |  <identifier> expected
|  byte myMinByteValue = Byte.MIN_VALUE, byte myMaxByte = Byte.MAX_VALUE;
|
```

```java
int myTotal = (myMinIntValue/2)
byte myNewByte = (myMinIntValue/2)

```
* try to assign it to byte : 
```jshelllanguage
jshell> byte myNewByte = (myMinIntValue/2)
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte myNewByte = (myMinIntValue/2);
|
```

#### Assigning expressions to variables with data types that don't match 
* the java compiler does not attempt to evaluate the value, in a variable when it is used in calculation  
`byte myNewByte = (myMinByteValue/2)`
* but it can figure it out, when using just literal values :  
`byte myNewByte = (-128/2)`
* we cannot assign literal suffix 'B' to the end of value 

#### Casting in Java
Casting means to treat or convert a number, from one type to another. We put the type we want the number to be, in parentheses like this:  
`(byte) (myMinByteValue / 2);`  
Other languages have casting too, this is common practice and not just a Java thing 

_this is mistake to declare a byte expression without casting :_ 
```jshelllanguage
jshell> byte myNewByte = (myMinByteValue/2)
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte myNewByte = (myMinByteValue/2);
|
```

the correct : 
```jshelllanguage
jshell> byte myNewByte = (byte) (myMinByteValue/2);
myNewByte ==> -64
```

#### What does it mean when Java defaults the data type to an int? 
when assigning expression value numbers, the default value before assigning is `int`  
for example :  `byte myNewByte = (myMinByte/2) // error `, the value is int not byte, because compiler did not figure it out
otherwise when the value is literal `byte myNewByte = (-128/2)`, the value is `byte` , becaues the compiler has figured it out 
so to solve the problem of expression values , we use `casting`
`byte myNewByte = (byte) (myMinByte/2)`
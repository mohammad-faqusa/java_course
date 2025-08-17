## 19. Understanding Byte, Short, and Long Data Types and Their Width in Java

### Introduction

* we saw that java has 8 primitive datatypes

#### byte, short, int, long

java has four int prmitive types

| whole number data type | wrapper class | what's noteworthy                          |
|------------------------|---------------|--------------------------------------------|
| byte                   | Byte          | has the smallest range                     |
| short                  | Short         |                                            |
| int                    | Integer       | Java's default data type for whole numbers |
| long                   | Long          | Has the largest range                      |

##### print range values :

```java
System.out.println("Integer Range :  "+Integer.MIN_VALUE +" to "+Integer.MAX_VALUE+")");
System.out.

println("Byte Range :  "+Byte.MIN_VALUE +" to "+Byte.MAX_VALUE+")");
System.out.

println("Short Range :  "+Short.MIN_VALUE +" to "+Short.MAX_VALUE+")");
```

```jshelllanguage
jshell > System.out.println("Byte Range :  " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
    Byte Range :-128to 127)

    jshell>System.out.println("Short Range :  "+Short.MIN_VALUE+" to "+Short.MAX_VALUE+")");
    Short Range:-32768to 32767)
```

#### byte and short overflow/underflow

has the same case with `int` datatype

#### Size of Primitive Types and Width

| data type | width | min value   | max value   |
|-----------|-------|-------------|-------------|
| byte      | 8     | -128        | 127         |
| short     | 16    | -32768      | 32767       |
| int       | 32    | -2147483648 | 2147483647) |

#### Long

```java
Long myLongValue = 100; // int value 
```

* the number 100 by default `int`
* if you want it `long` you should add certain numeric literal appeded to the value , to force a **different datatype**
  from the default type  
  for example : `Long myLongValue = 100L; // long value `
* you can assign `L` or `l`

* Long wrapper :

```java
System.out.println("A long has a width of "+Long.SIZE);
System.out.

println("Long Range :  "+Long.MIN_VALUE +" to "+Long.MAX_VALUE+")");
```

* output :

```jshelllanguage
jshell > System.out.println("A long has a width of " + Long.SIZE);
    A long has a width of 64

    jshell>System.out.println("Long Range :  "+Long.MIN_VALUE+" to "+Long.MAX_VALUE+")");
    Long Range:-9223372036854775808to 9223372036854775807)
```

| data type | width | min value            | max value            |
|-----------|-------|----------------------|----------------------|
| int       | 32    | -2147483648          | 2147483647)          |
| long      | 64    | -9223372036854775808 | 9223372036854775807) |

##### Lets assign a value to Long but without suffix 'L' or 'l'
```java
long bigLongLiteralValue = 2147483647; 
// increase by one 
bigLongLiteralValue = 2147483647123;
```
_output_ : 
```java

jshell> long bigLongLiteralValue = 2147483647;
bigLongLiteralValue ==> 2147483647

jshell> bigLongLiteralValue = 2147483647123;
|  Error:
|  integer number too large
|  bigLongLiteralValue = 2147483647123;
|

```
===> You must use 'L' suffix to make it ture 
```java
long bigLongLiteralValue = 2147483647L;
bigLongLiteralValue =2147483647123L;
```
_output :_ 
```jshelllanguage
jshell> long bigLongLiteralValue = 2147483647L;
bigLongLiteralValue ==> 2147483647

jshell> bigLongLiteralValue =2147483647123L;
bigLongLiteralValue ==> 2147483647123
```
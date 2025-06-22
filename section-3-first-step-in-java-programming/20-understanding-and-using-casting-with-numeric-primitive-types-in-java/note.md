## introduction

the previous lesson introduced to three new data types. The byte, the short, and the long.

in this lesson, we'll be using these additional types in some basic arithmetic

We've already done some math, using integers, but now , we'll be using these other data types

We'll finish the lesson with a discussion about casting, which is a way to get Java to treat a variable of one type like a different data type

I'll talk about when and why casint is sometimes necessary in Java code

## rules for declaring multiple variables in one statement

- you cannot declare variables with different data types in a single statement
- if you declare multiple variables of the same data type in single statement, you must specidfy the data type only once before any variable names
- ```bash
  jshell> byte firstByte = 1, secondByte = 2;
  firstByte ==> 1
  secondByte ==> 2
  ```

## assigning expressions to variables with data types that don't match

the java compiler does not attempt to evaluate the value, in a variable, when it's used in a calcualtion, so it doesn't know if thevlaue fits, and throws an error.

```java
byte myNewByteValue = (myMinByteValue / 2);
```

if you calculation uses literal values, Java can figure out the end result at compile time, and wheter it fits into the variable, and won't throw an error if it does.

```java
byte myNewByteValue = (-128/2);
```

in both examples, an int result is eing returned from the calculation, but in the second example, java knows the returned value can fit into a byte

## Casting in Java

Casting means to treat or convert a number, form one type ot another. We put the type we want the number to be, in parantheses like this:

```java
(byte) (myMinByteValue/2);
```

```java
byte myMinByteValue = Byte.MIN_VALUE;
byte myNewByteValue = (byte) myMinByteValue
```

result :

```bash
jshell> byte myMinByteValue = Byte.MIN_VALUE;
myMinByteValue ==> -128

jshell> byte myNewByteValue = (byte) myMinByteValue
myNewByteValue ==> -128
```

## what does it mean when java defualts the data type to an int?

So, what effect does int, being the default value, have on our code ?

Looking at the scnearios we just looked at in summary, we know the following:

This statement works because the result is an int, and assigning it to an int variable is fine.

```java
int myTotal = (myMinIntValue / 2);
```

This statement doesn't work, becuase the expression (myMinShortValue/2) is an int, and an int can't be assigned to a short, because the compiler won't guess the result

```java
short myNewShortValue = (myMinShortValue / 2);
```

This statement works, because the resutl of (-128/2) is an int, but when calcualtions use only literal values, the compiler can determine the reuslt immediately, and knows the value fits into a short

```java
short myNewShortValue = (-128/2);
```

And finally, this code works because we tell the compiler we knwo what we're doing by using this case, and the compiler doesn't give an error.

```java
shot myNewShortValue = (short) (myMinShortValue/2);
```

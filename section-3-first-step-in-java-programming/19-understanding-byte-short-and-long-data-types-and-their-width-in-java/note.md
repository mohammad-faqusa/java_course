## introduction

in this previous video, we saw that Java has eight primitve data types, and taht the wrapper classes give us extra options

of these primitive types, half are used to store whole numbers (nubmers without a fractional or decimal component), one of which we've explored already, the integer, or the int data type.)

in this video, we'll take a look at the other three whole-number primitve data types

---

## byte, short, int, long

We've previously said that Java has four primitive data types used to store whole numbers, these are the byte, the short, the int, and the long.

| whole number<br />data type | wrapper Class | What's noteworthy                          |
| --------------------------- | ------------- | ------------------------------------------ |
| byte                        | Byte          | Has the smallest range                     |
| short                       | Short         |                                            |
| int                         | Integer       | Java's default data tyep for whole numbers |
| long                        | Long          | Has the largest range                      |

They are listed here in this table, by the range of values the type will support, the byte supoorts the smallest range, and the long supports the largets range

```bash
jshell> System.out.print("Integer Value Range (" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE + ")")
Integer Value Range (-2147483648,2147483647)
jshell> System.out.print("Byte Value Range (" + Byte.MIN_VALUE + "," + Byte.MAX_    E + ")")
Byte Value Range (-128,127)
```

### the byte data type

the minimum value of a byte is -128

the maximum value of a byte is 127

Given its small range, you probably won't be using the byte data type much.

The byte wrapper class is the Byte with a capital B.

### the short data type

the minimum value of a short is -32768

the maximum value of a short is 32767

the short wrapper class is the Short with a capital S.

### byte and short overflow/underflow

both the byte and the short, have the same overflow and underlow issue as the int data type has, but obviosuly with their own range of numbers.

## size of primitive Types and Width

Size, or Width, is the amount of space that determiens (or limits) the range of vlaues we've been discussing:

| data type | width (in bits) | min value   | max vlaue  |
| --------- | --------------- | ----------- | ---------- |
| byte      | 8               | -128        | 127        |
| short     | 16              | -32768      | 32767      |
| int       | 32              | -2147483648 | 2147483647 |

a byte, can store 256 numbers and occupies eight bits, and has a width of 8.

a short, can store a large range of numbers and occupies 16 bits, and has a width of 16

An int, has uch larger range as we know, and occupies 32 bits, and has a width of 32

## using a numeric literal character suffix

The number 100, by default, is an int

Java allows certain nubermic literals to have a suffix appended to the value, to force it to be a different data type from the defualt type

The long is one of these types and it's suffix is an 'L'.

This is one of the few instances Java is not case sensitive, a lowercase 'l' or an uppercase 'L' at the end of a whole number mean the same thing - the number is a long

```
jshell> long myLongValue = 100;
myLongValue ==> 100

jshell> long myLongValue = 100l;
myLongValue ==> 100

jshell> long myLongValue = 100L;
myLongValue ==> 100

jshell> System.out.print("A long has a width of " + Long.SIZE);
A long has a width of 64

jshell> System.out.print("Long Value Range (" + Long.MIN_VALUE + "," + Long.M    ALUE + ")")
Long Value Range (-9223372036854775808,9223372036854775807)
jshell>
```

## The big differnece between an int and a long?

How big is the difference, is the range of vlaues that a long can store, compared to the int?

| data type | width (in bits) | min value            | max vlaue           |
| --------- | --------------- | -------------------- | ------------------- |
| int       | 32              | -2147483648          | 2147483647          |
| long      | 64              | -9223372036854775808 | 9223372036854775807 |

```
jshell> long bigLongLiteratureValue = 2_147_483_647;
bigLongLiteratureValue ==> 2147483647

jshell> bigLongLiteratureValue = 2_147_483_647_123;
|  Error:
|  integer number too large
|  bigLongLiteratureValue = 2_147_483_647_123;
|
```

### When is L required ?

A numberic literal that exceeds Integer.MAX_VALUE must use the 'L' suffix.

We cannot create a numeric literal in Java, that exceeds Integer.MAX_VALUE, without using the 'L', we'll always get teh error 'integer number too large'.

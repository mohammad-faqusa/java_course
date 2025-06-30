**Floating-point Numbers**

Unlike whole numbers, floating-point numbers have fractional parts that we express with a decimal point.

in this table, you can see some exmaples of both whole numbers and floating point numbers, in comparison

| Whole number<br />Examples | Floating point examples   |
| -------------------------- | ------------------------- |
| 4                          | 3.13163434                |
| 10000                      | 10.0                      |
| -21432443545L              | -0.6666666666666666666667 |

we use floating-point nubmer when we need more precision in calculations.

There are two primitve types in Jave for expressing floating-point numbers, the float and the double.

|                     Java's Data Types<br />Fot Floating Point Numbers                     |
| :---------------------------------------------------------------------------------------: |
| float<br />double<br />_the double is Java's defualt type for any decimal or real number_ |

## Single and Double Precesion

precision referes to the format and amount of space occupied by the relevant type.

This table shows the width of each of the floating point types and their ranges.

The ranges are shown in Java's scientific notaiotn, which we show below in blue color.

| Data Type | Width(in bits) | Min Value | Max Value |
| --------- | -------------- | --------- | --------- |
| float     | 32             | 1.4E-45   | 3.4E38    |
| double    | 64             | 4.9E-324  | 1.79E308  |

you can see the notation is followed by positive or negative number

## Java's Scientific Noation

Scneitific notation can be translated into more familiar terms, by replacing the 'E' in the number, with the pharse 'time 10 to the power of'

1.4e-45 is the same as 1.4 \* 10^-45

## FLOAT , DOUBLE RAGE

```bash
jshell> System.out.println("Float value range (" + Float.MIN_VALUE + "TO " + Float.MAX_VALUE + ")");
Float value range (1.4E-45TO 3.4028235E38)
```

```bash
jshell> System.out.println("Double value range (" + Double.MIN_VALUE + "TO " + Double.MAX_VALUE + ")");
Double value range (4.9E-324TO 1.7976931348623157E308)
```

## float and fouble and numberic literal suffixes

important: the double datat type is Java's defualt type for real numbers.

for exmaple : any number with a decimal is double

can be specified with suffix 'd' or 'D', but is optional use

the float are specified with suffix 'f', 'F'. this is used to specify the float number declared in float type variable

```bash
jshell> float myOtherFloatValue = 5.25
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myOtherFloatValue = 5.25;
|                            ^--^
```

## challenge :

how to remove the error of double to float

solution : casting

```bash
jshell> float myOtherFloatValue = (float) 5.25
myOtherFloatValue ==> 5.25

```

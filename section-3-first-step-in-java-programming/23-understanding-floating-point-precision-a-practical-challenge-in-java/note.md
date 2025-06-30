[https://www.google.com/search?q=200+pounds+in+kg&amp;rlz=1C1PRFI_enPH986PH986&amp;oq=200+pounds+in+kg&amp;aqs=chrome..69i57j0i22i30l9.1482j0j7&amp;sourceid=chrome&amp;ie=UTF-8](https://www.google.com/search?q=200+pounds+in+kg&rlz=1C1PRFI_enPH986PH986&oq=200+pounds+in+kg&aqs=chrome..69i57j0i22i30l9.1482j0j7&sourceid=chrome&ie=UTF-8)

```bash
jshell> int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

jshell> myIntValue = 5/2
myIntValue ==> 2

jshell> myFloatValue = 5f/2f
myFloatValue ==> 2.5

jshell> myDoubleValue = 5d/2d
myDoubleValue ==> 2.5

jshell> myDoubleValue = 5d/2d
myDoubleValue ==> 2.5

jshell> myIntValue = 5/3;
myIntValue ==> 1

jshell> myFloatValue = 5f/3f;
myFloatValue ==> 1.6666666

jshell> myDoubleValue = 5d/3d
myDoubleValue ==> 1.6666666666666667

jshell> myDoubleValue = 5.00 / 3.00
myDoubleValue ==> 1.6666666666666667

jshell> // java automatically consider it double

jshell> myDoubleValue = 5.00/3 ;
myDoubleValue ==> 1.6666666666666667

jshell> myFloatValue = 5.00/3f;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloatValue = 5.00/3f;
|                 ^-----^
```

## why double better than float

- faster , according to chip level deals with double
- java libraries operats on double
- double is more precise

## Challenge

convert the pounds to kilograms

```bash
jshell> pounds = 200
pounds ==> 200.0

jshell> kilograms = 0.45359237 * pounds
kilograms ==> 90.718474
```

## formatting floating points numbers :

```
jshell> double pi = 3.14159
pi ==> 3.14159

jshell> double anotherNumber = 3_000.4_544_890d
anotherNumber ==> 3000.454489
```

## Floating point numbers precise Tips

- in general, float and double are great for general flouting point operations
- but neither of them should be used when precise calcualtions are required - due to the limitaiton with how is stored

- Java has a class called **BigDecimal** that overcomes this

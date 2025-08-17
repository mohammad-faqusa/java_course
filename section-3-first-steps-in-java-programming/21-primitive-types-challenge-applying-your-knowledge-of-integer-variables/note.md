## 21. Primitive Types Challenge: Applying Your Knowledge of Integer Variables

### Primitive Types Challenge 
* create four new variables :  
a byte variable , set to any valid byte number  
a short variable  , // / // // ///  
an int variable . // // // // //  
* lastly create a type `long`, equalt to `50000 + 10 * (byte + short + int)`

```java
byte byteVariable = 100; 
short shorVariable = 1000; 
int intVariable = Integer.MAX_VALUE; 
long longVariable = 50000 + 10 *((long) byteVariable + shorVariable + intVariable)
```

_the solution_ 
```jshelllanguage
jshell> byte byteVariable = 100;
byteVariable ==> 100

jshell> short shorVariable = 1000;
shorVariable ==> 1000

jshell> int intVariable = Integer.MAX_VALUE;
intVariable ==> 2147483647

jshell> long longVariable = 50000 + 10 *((long) byteVariable + shorVariable + intVariable)
longVariable ==> 21474897470
```

_let's try short casting :_ 
```jshelllanguage
jshell> short shortTotal = (short) (50000 + 10 *((long) byteVariable + shorVariable + intVariable))
shortTotal ==> -4546
```


## 24. Exploring Character (char) and Boolean Primitive Data Types in Java

### JShell process

```jshelllanguage
jshell> char myChar = 'D';
myChar ==> 'D'
```

* char is different from string

#### String Literal Example ;

`System.out.println("Hello World");`

* we have printed string values, but still we haven't used String variable

#### Compare the char to the String

| char                                                                         | String                                                                  |
|------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| * holds one, and only one character <br/>* literal enclosed in Single Quotes | * Can hold multiple characters <br/>* Literal enclosed in Double Quotes |

```jshelllanguage
jshell> char myChar = 'DD';
|  Error:
|  unclosed character literal
|  char myChar = 'DD';
|
```

#### Why to use variable that store single character only ?

* one example is might **key pressed by user in game**
* loop programmatically
* `char` is much relevent in java

#### Char data type

* occupies : 16 bits, 2 byte number
* when you print the char, you see the `mapped` character not the represented number
* store char in single quotes better than typing its mapped value

#### Unicode

international encoding standard for use different languages and scripts
by which each letter, digit or symbol is assigned in unique numberic value

##### check unicode example

[symbl](https://symbl.cc/)

* find the unicode value of 'D' = '\u0044'

```jshelllanguage
jshell> char myCharValue = 65;
myCharValue ==> 'A'
```

#### Assigning values to a char variable :

| assignment type     | example code             |
|---------------------|--------------------------|
| a literal character | `char myChar = 'D'`      |
| a unicode value     | `char myChar = '\u0044'` |
| an integer value    | `char myChar = 68`       |

#### Challenge 
* create three char variables for question mark symbol 
  * mySimpleChar, myUnicodeChar, myDecimalChar
  * print the variables

```jshelllanguage
jshell> char myCharValue = 65;
myCharValue ==> 'A'

jshell> char mySimpleChar = '?';
mySimpleChar ==> '?'

jshell> char myUnicodeChar = '\u003F';
myUnicodeChar ==> '?'

jshell> char myDecimalChar = 63;
myDecimalChar ==> '?'
```

#### Why should you start your boolean variable name with the prefix 'is' ? 
* often used between developers 
* creates names seems to ask question, making code more readable 

* Boolean varaible name examples : 
  * isCustomerOverTwentyOne
  * isElibibleForDiscount
  * HasValidLicense
  * isMarried
  * hasChildren


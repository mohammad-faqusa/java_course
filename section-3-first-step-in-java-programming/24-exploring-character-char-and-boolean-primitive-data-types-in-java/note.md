## comparing char to String

| char                                                                      | String                                                          |
| ------------------------------------------------------------------------- | --------------------------------------------------------------- |
| holds one, and only one, character<br />literal enclosed in Single quots  | hold multiple characters<br />literal enclosed in double quots  |

## why is good to use char ?

store last key pressed in game

loop through letters in alphabet

## char datatype

- occcupies 16 bits
- is not just a single byte, is stored as a 2 bytes number similar to short
- when you print the char, you will see the mapped character not the representive number

## unicode

To represent the characters of all languages

see this link :**[https://symbl.cc/en/unicode-table/#ipa-extensions](https://symbl.cc/en/unicode-table/#ipa-extensions)**

```bash
jshell> char myChar = '\u0044'
myChar ==> 'D'
```

## assign values to char variable

a literal character 'D'

a unicode value '\u0044'

integer value 68

## char challenge

assign the '?' using the three ways

```bash
jshell> char mySimpleChar = '?', myUnicodeChar = '\u003f' , myDecimalChar = 63
mySimpleChar ==> '?'
myUnicodeChar ==> '?'
myDecimalChar ==> '?'
```

## boolean

allows for two opposite choices

the wrapper : Boolean

```bash
jshell> boolean myTrueBooleanValue = true;
myTrueBooleanValue ==> true

jshell> boolean myFalseBooleanValue = false;
myFalseBooleanValue ==> false
```

## why would you start your boolean variable name with the prefix 'is' ?

this create the variable name seems to ask question, which makes reading the code more intuitive

example

- isCustomerOverTwentyOne
- isEligibleForDiscount
- hasValidLicense
- isMarried
- hasChildren

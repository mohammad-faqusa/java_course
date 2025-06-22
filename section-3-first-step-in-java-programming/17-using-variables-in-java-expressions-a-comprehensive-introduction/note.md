## Starting out with Expressions

In this video, we'll be continuing what we were working on in the last video, but here, we'll be using variables in expressions.
Remember the expression is the code segment that is on the right side of the equals sign in an assignment or declaration statement.
This code can be a simple literal value, like the number 5, or it can be a complex mathematical equation using multiple literal values and mathematical operators.
In this video, we'll talk about how to use variables to replace literal values.

## Review

Up until now, we've only used literal values in our expressions, and we've also used several operators, such as in the example we used in the last video – see above.

## Challenge

Your challenge is to create two additional variables in JShell.
Here's what we need:
One variable called mySecondNumber, which is an int, with a value of 12.
And another variable called myThirdNumber, also of type int, with a value of 6.

```bash
jshell> myFirstNumber = 10;
myFirstNumber ==> 10

jshell> int mySecondNumber = 12;
mySecondNumber ==> 12

jshell> int myThirdNumber = 13;
myThirdNumber ==> 13
```

```bash
jshell> /var
|    int myFirstNumber = 10
|    int mySecondNumber = 12
|    int myThirdNumber = 13

```

```
jshell> int totlaNumber = myFirstNumber + mySecondNumber + myThirdNumber;
totlaNumber ==> 35
```

First, create a new variable and call it myLastOne:
Its data type should be int.
It should be set to the value of 1000, minus (or less than) the value in the myTotal variable, which we've just talked about in our previous code segment.
Next, print out the value of the myLastOne variable on the line after you declare it.
Hint: We need to use another operator that we haven't used in code before, but if you think about this, it should be easy to figure out which operator you need to use.

```bash
jshell> int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 35

jshell> int myLastOne = 1000 - myT
myThirdNumber   myTotal
jshell> int myLastOne = 1000 - myTotal
myLastOne ==> 965

jshell> System.out.println(myLastOne)
965
```

## Java code is case sensitive

Java code is case sensitive.
This includes not only keywords and language syntax, but variable names and data types as well.
myLastOne is not the same variable as MyLastOne with a capital M.
int in lowercase, is not the same as Int with the first letter capitalized, or INT, all in uppercase, etc.

Keywords need to be in lowercase.
And variables will always be exactly as you declare them, including capitalization.
Remember that case matters in Java code!
The /vars command in JShell can help you identify any misspellings you may have made.

## Recap

In this video:
We used expressions to assign values to our variables, and we used variables we created, in expressions.
For now though, in our expressions, we've looked at only one data type so far, which is the type, int.
In the next video, we'll be looking at and discussing some additional data types.

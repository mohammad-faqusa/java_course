## keywords

link : [https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)

## Variables

In the previous video, we saw how to write our first code in Java. It was pretty basic to say the least, printing out some text on the screen, but it was a good place to start.
In this video, I want to talk about variables and keywords.

## Keywords

A keyword **is any one of a number of reserved words, that have a predefined meaning in the Java language.**
In Java syntax, all code is **case-sensitive**, and this includes keywords. As we'll soon see, an int, all in lowercase, is not the same as Int, with a capital I. Here, an int, (all in lowercase) is a keyword in Java.

## Variables

So what are variables?
Well, variables are a way to **store** information in our computer.
Variables that we define in a program, can be accessed by a name we give them, and the computer does the hard work, of figuring out where they get stored, in the computer's random access memory, or RAM.

## Data type

There are lots of different types of data, that we can define for our variables, some of which I've shown you in the keyword list previously.
Collectively, these are known as data types.
As you may have guessed, some data types are keywords in Java. When we get to the Object Oriented features of Java, you will see that we have a lot of flexibility for creating our own data types, but in the next couple of videos, we'll explore primitive data types, which are built into the Java language.

## Declaration Statement

A declaration statement is used to define a variable by indicating the data type, and the name, then optionally to set the variable to a specific value.

## Expressions

So what is an expression?
An expression is a coding construct, that evaluates to a single value.

## Variable Challenge 1

Your challenge is to look at creating a new System.out.print below the declaration for myFirstNumber, and to see if you can figure out how to print out the value of the myFirstNumber variable.

```bash
jshell> System.out.println(myFirstNumber)
5
```

## Variable Challenge 2

Here's your challenge – Change the value of our existing variable from ten to one thousand, and print the new value out using the System.out.print method as we've done previously.

```bash
jshell> myFirstNumber = 10;
myFirstNumber ==> 10
```

## Variable Declarations in JShell

By declaring a variable again, we are effectively re-declaring a variable, and in normal Java programming, that would not be allowed, and would throw an error.
Due to its interactive nature, JShell “holds our hand”, and **allows the redeclaration** to occur without throwing an error.
For now, just follow along, knowing that re-declaring a variable for a second, or subsequent time, is not allowed, and later in the course, when we switch to a full editor, you'll see what happens when we try and do that.
Note that we can assign a value to a variable multiple times in Java, but it’s the declaration (which includes the data type) that cannot normally be done a second time for the same variable.

## Operators

Java operators, or just operators, perform an operation (hence the term) on a variable or value.
Addition, Subtraction, Division, and Multiplication are four common ones that I feel sure you're familiar with, but there are lots more operators you will work with as we go through the course.

## Getting Started

In this video, we're going to print some things to the screen, to get our first real taste of programming.

The Java Shell Tool, or JShell as it's referred to, is the tool we'llbe using to achieve this, and is the one I talked about in the previous video.

Be sure to watch that previous video if you need a recap, on how to access it for your operating system.

For best results for this course, make sure you follow along as closelyas you can, typing the code segments I'll be typing, into your own JShell session.

Nothing beats learning from your own mistakes, and figuring out how to get a line of code to work, when it wasn't working before.

This emulates real-world problem solving, and you'll find when you type in your own code, you'll be making all kinds of typos, or omitting or overlooking some characters that are required.

This is the best way to learn, and pick up all the nuances, of any programming language you're learning.

If you do encounter a mistake on your own, pause the video, try solving it on your own, and if that doesn't work – remember the working code segments, are always available in the resources section of every video.

All right – So let's get started. It's always been a tradition, when you're learning a new programming language, to create a simple program that outputs the text, "Hello World".
This lets us test all the parts that are necessary, to create a successful program, with very little investment of time, or knowledge of the language.

It's the first step, and honestly, even after many years of programming, I still get that first feeling of achievement, when I've accomplished this step in a new language.

If you can print "Hello World" to the screen, you're on your way to bigger, and better things.

```
System.out.println("hello world")
```

Lets do that now.

go to cmd

```bash
C:\Users\moham>jshell
|  Welcome to JShell -- Version 17.0.15
|  For an introduction type: /help intro

jshell> System.out.println("hello world");
hello world

jshell> System.out.println("hello world);
|  Error:
|  unclosed string literal
|  System.out.println("hello world);
|                     ^

jshell> System.out.println("hello world",
   ...> )
|  Error:
|  illegal start of expression
|  )
|  ^

jshell> System.out.println("hello world"
   ...> )
hello world

jshell>
```

---

## Statement

What we've typed above, is a command to print some information to the screen, using syntax provided by the Java language.

We specified what we wanted Java to print in the parentheses and double quotes – in this case, the text "Hello World" – effectively we're telling Java to print out the words, as we've specified them in the quotes – "Hello World".

After we press the enter key, the program executing the code should print that text to the screen – in this case, the output is printed on the very next line.

---

## Challenge

I've got a bit of a challenge for you here, and the challenge is to see whether you can modify the statement we typed below, so that instead of it printing out "Hello World", it prints, "Hello Tim".

Looking at this code, how do you think you'd go about achieving that?

Let's see if you can figure that out, and get that to run.

You have a few options here. You could just retype the entire line in from scratch, with the changed text to print out. But we want to modify the statement, not type a new line in.
To modify the existing line, press the up arrow key – remember that in JShell, you can see the history of the lines you've previously typed, using the up and down arrows.

```
System.out.println("hello tim")
```

Pressing the up arrow now, will display the code we first typed in – so make the change, and then press enter to see the result printed to the screen.

Congratulations if you managed to make that work! These are the first steps almost all programmers make, in almost every programming language, regardless of their experience.
If you had a problem getting it to work, don't worry, the more you work at this course, the easier things will be to understand – so hang in there!
Every video builds on some content in previous videos, and you'll have lots of opportunities to explore these concepts further, so you won't be left behind.
Next, let's look at some common errors you might get, when typing in Java code.

---

These were a few examples, of errors that might occur, when your coding in JShell. Let me encourage you to play with this line of code in JShell, in as many ways as you can think of, to see what kind of errors you might get, or what kind of output is produced.
This is the whole point of JShell – to provide you with a safe place to test code segments.
Remember that the key combination **'control c',** on windows, or **'control d'** on a mac or a linux machine, should cancel what you are in the middle of, and get you back to the JShell prompt.

Typing forward slash and the word '**exit**', or forward slash with the shortcut text ex, will end your JShell session, if you get stuck.
An example would be **/exit or /ex.**

## **primitive types challange**

your challenge is to create four new variables:

- a byte variable, set it to any valid byte number, it doesn't matter.
- A short variable, set it to any valid short number.
- An int variable, set it to nay valid integer number.
- lastly, create a varaible of type long. Make it equal to 50,000 plus 10 times the sum of the vlaues of the first 3 variables (your byte , your short and your int values). In other words, use the vairable names in your expression to calculate the sum

```bash
Ljshell> byte myByte = 100
myByte ==> 100

jshell> short myShort = 3000
myShort ==> 3000

jshell> int myInt = 7000
myInt ==> 7000

jshell> long myLong = 50_000L + 10L * (myByte + myShort + myInt);
myLong ==> 151000
```

```bash
jshell> short shortTotal = (short) (1000 + 10 * (myByte + myInt + myShort))
shortTotal ==> -29072
```

## Recap

so that's it, for bytes, shorts, integer and longs, which are the first four primitve tyeps in Java's list of available types.

We still have four left to go.

in the next video, we are going to start talking aobut deicmal numbers, because, of course, we've only been dealing with whole numbers up until now

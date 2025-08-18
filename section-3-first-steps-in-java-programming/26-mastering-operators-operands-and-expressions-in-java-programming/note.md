## 26. Mastering Operators, Operands, and Expressions in Java Programming

### what are operators ?
* java special symbol perform specific operations on onw, two, or three operands, and then return a result 

### what are operands ? 
* describe any object that is manipulated by the operator 

`int myVar = 15 + 12` :
* 15  and 12 are operands 
* `+` is operator 

### What are expression 
* an expression is formed by combining varirables, literals, method return values, which we haven't convered yet, and operators 
* `15 + 12` is expression 

### JShell process 
```java
int result = 1 + 2; // 1 + 2 = 3

```
* how many operators ?  
two : = , +  
operands : 1, 2 

### what is a comment 
* comments are ignored by computer 
* used for human read 
* starts after `//`
* can also used to temporarily disable the code 

```java
result = result - 1; // 3 - 1 = 2 
int previousResult = result; 
result = result - 1; 

```
`previousResult`, and `result` are independent 

#### The + Operator on character data types 
```java
char firstChar = 'A'; 
char SecondChar = 'B';
System.out.println(firstChar + SecondChar);
System.out.println("" + firstChar + SecondChar); // string concatenation
result = 2;
result = result * 10; // 2 * 10 = 20
result = result / 4; // 40/ 5 = 5; 


```

##### Remainder operator 
* `%`
* return the remained value in devision example 

| division result | remainder result | explanation                                                                                    |
|-----------------|------------------|------------------------------------------------------------------------------------------------|
| 10/5-2          | 10%5=0           | ten can be divided evenly by 5, so there is no remainder                                       |
| 10/2 = 5        | 10 & 2= 0        | ten can be divided evenly by 2, so there is no remainder                                       |
| 10/3=3          | 10%3=1           | ten cannot be devicied by 3, but we get 3 from the devision which gives us 9 with 1 remaining  | 




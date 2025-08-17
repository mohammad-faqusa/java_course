## 17. Using Variables in Java Expressions: A Comprehensive Introduction

### Starting out with expressions 
* we have defined an expression in previous video 
* can be just a value, or complex mathematical equation 
* in this video, we will look how to use **variable** to replace literal values 

#### Review 
```jshelllanguage
int myFirstNumber = (10 + 5) + (2 * 10); 

```
* now we only used literal values in our expression 

#### challenge 
* create two additional variables :  
`mySecondNumber` = 12 , `myThirdNumber` = 6
```jshelllanguage
int mySecondNumber = 12;
// mySecondNumber ==> 12

int myThirdNumber = 6 ;
// myThirdNumber ==> 6

int myTotal = myFirstNumber + mySecondNumber + myThirdNumber; 
// myTotal ==> 28
```

#### Challenge 
* create  new variable : `myLastOne`,  
data type : int  
value : 1000  
then add to **myTotal** 
* print `myLastOne`, `myTotal`

```jshelllanguage
jshell> myTotal += myLastOne
$8 ==> 1028
```

#### java code is case sensitive 

* spill the variable you have typed in jshell, by following command `/vars`: 
```jshelllanguage
jshell> /vars
|    int mySecondNumber = 12
|    int myThirdNumber = 6
|    int myFirstNumber = 10
|    int myTotal = 1028
|    int myLastOne = 1000
|    int $8 = 1028
```

### Recap 
* we used expressions to assign into varaibles 
* we looked into data type **int** 



## 37. Java's Logical OR Operator: Enhancing Conditional Statements for Flexible Code

### The process 
1. in `Hello` class, run the class 
2. use extra paranthesis to identify your needing 
_from this_ 
```jshelllanguage
int secondTopScore = 60;
if(topScore > secondTopScore && topScore < 100) {
    System.out.println("Greater than second top score and less than 100");
}
```
_to this_ 
```jshelllanguage
int secondTopScore = 60;
if((topScore > secondTopScore) && (topScore < 100)) {
    System.out.println("Greater than second top score and less than 100");
}
```

##### Logical or operator 
* works the same with and opeartors, but require at least one side to be ture 


```jshelllanguage
if((topScore > 90) || (topScore <= 90)) {
    System.out.println("Greater than second top score and less than 100");
}
```

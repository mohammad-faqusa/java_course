## 35. Mastering Java's if-then Statement: Conditional Logic for Program Flow Control

### if then statement 
* is most basic of control flow statement 
* conditional logic 

##### Condition logic 
* execute certain code, based on condition (expression) true or false 

```java
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Mohammad");
        
        boolean isAlien = false; 
        if(isAlien==false) {
            System.out.println("It is not an alien!"); 
        }

    }
}

```
##### operators : 
* `=`  
assign the value of an expression , to the variable to the left of the operator
* `==`  
equality operands : test if two operands are considered equal, and returns a boolean value

#### Experiment : 
##### _what happen if putting semicolon after if statement:_  
```java
if(isAlien==false); {
            System.out.println("It is not an alien!"); 
        }
```
* it runs normally , but the condition will not affect the statement 

##### change the isAlien to false 
* if the parenthesis is true, execute the block, else don't execute 



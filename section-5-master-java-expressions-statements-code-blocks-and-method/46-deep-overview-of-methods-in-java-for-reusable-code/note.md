## 46. Deep Overview Of Methods In Java For Reusable Code

### introduction 
* talking about `methods`

### methods 
* write once and reuse 
* can be invoked, passing a fixed number of values as arguments 


#### the benefits 
* reduce duplication 
* used many times with potential different results 

### the process 
```java
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore() ;

        
        
    }
    
    public static void calculateScore() {
        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
```

#### structure of method 
```jshelllanguage
public static void methodName () {
    // method statements from the method body 
}
```
* void : returns no data 
* public 
* static : directly from class name 
* body : `// method statements from the method body `

#### apply method on code 
* cut the code from main method to new created method `calculateScore` : 
```jshelllanguage
public static void calculateScore() {
    boolean gameOver = true;
    int score = 4000;
    int levelCompleted = 5;
    int bonus = 100;
    
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
}

```
* execute method as a statement : 
  * `calculateScore()`

#### method pass information : 
* method parameters

```jshelllanguage
public static void calculateScore(boolean gameOver, int  score, int levelCompleted, int bonus) {
    
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
}

public static void main(String[] args) {
    boolean gameOver = true;
    int score = 4000;
    int levelCompleted = 5;
    int bonus = 100;
     
    // passing arguments 
    calculateScore(true, 800, levelCompleted , bonus);
}
```
* removing variables that were inside the body : 
  * java will automatically create variables from the parameters 
##### parameter vs argument 
* parameter : data type definition 
* argument : the value passed 

##### argument : 
whether using variable name or literal value is ok  
`calculateScore(true, 800, levelCompleted , bonus);`
## 52. Delving Into Method Overloading In Java

### Method overloading 
* when class has multiple methods with the same name, but the methdos are declared with different parameters 
* java resolve the which methods it needs to executed based on the arguments being passed when method is called 

#### More on Method signature 
* consists of the name of the method, and the **uniqueness** of the declaration of its parameters. 
* is not part of signature : 
  * return type 
  * parameter name

#### Valid overloaded methods 
* the type, order and number of parameters, in conjunction with the name, make method signature unique 
* A unique method signature is the key for the java compiler to determine if a method is overloaded correctly 

```jshelllanguage
public static void doSomething(int parameterA) {
    // method body
}

public static void doSomething(float parameterA) {
    // method body
}

public static void doSomething(int parameterA, float parameterB) {
    // method body
}

public static void doSomething(int parameterA, float parameterB, float parameterC) {
    // method body
}
```

#### Invalid Overloaded Methods 
```java
public static void doSomething(int parameterA) {
    // method body
}

public static void doSomething(int parameterB) {
    // method body
}

public static int doSomething(int parameterA) {
    // method body
    
    return 0; 
}
```

#### Example codde 
```java

public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
    System.out.println("New score is " + newScore);

    calculateScore(500);
//    calculateScore(500, 100, 32); // invalid , 
    calculateScore(); 
public class Main {
    
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
    }

    public static int calculateScore(int score) {
        System.out.println(calculateScore("Anonymous", score));
    }
    
    public static void calculateScore(){
        System.out.println("No player name, no score");
    }
}
}
```
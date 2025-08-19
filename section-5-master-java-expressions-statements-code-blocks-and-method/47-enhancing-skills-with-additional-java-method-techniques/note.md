## 47. Enhancing Skills With Additional Java Method Techniques

### FROM THE PREVIOUS CODE 

```jshelllanguage

public static void main(String[] args) {
    boolean gameOver = true;
    int score = 4000;
    int levelCompleted = 5;
    int bonus = 100;

    // passing arguments 
    calculateScore(true, 800, levelCompleted , bonus);
    
    calculateScore(true, 800, 8 , 200);
}

public static void calculateScore(boolean gameOver, int  score, int levelCompleted, int bonus) {
    
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
}


```
* you can pass values directly and delete the variables :  
```jshelllanguage
calculateScore(true, 800, 6, 100);
calculateScore(true, 800, 8, 200);
```
* passing variables names :
```jshelllanguage
boolean gameOver = true;
int score = 4000;
int levelCompleted = 5;
int bonus = 100;
    
calculateScore(gameOver, score, levelCompleted, bonus);

int score = 1000;
int levelCompleted = 8;
int bonus = 100;
    
calculateScore(true, 800, 8, 200);
```

#### method structure with parameters and return type
```jshelllanguage
public static dataType methodName (p1type p1, p2type p2 , {more}){
//    method statements 
    return value ; 
}
```
###### example : 
```jshelllanguage
public static dataType calculateMyAge(int dateOfBirth){
//    method statements
    return (2023 - dateOfBirth) ;   
}
```

#### from previous code, change the datatype of method 
```jshelllanguage
public static int calculateScore(boolean gameOver, int  score, int levelCompleted, int bonus) {
    int finalScore = score; 
    
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
    
    return finalScore; 
}
```
* int require return statement `return finalScore; `
* when calling the method , assign to `highScore`: 
```jshelllanguage
boolean gameOver = true;
int score = 4000;
int levelCompleted = 5;
int bonus = 100;

// passing arguments 
int highScore = calculateScore(true, 800, levelCompleted , bonus);
```

#### called methods 
* methods with return value, can be used as **expression** 
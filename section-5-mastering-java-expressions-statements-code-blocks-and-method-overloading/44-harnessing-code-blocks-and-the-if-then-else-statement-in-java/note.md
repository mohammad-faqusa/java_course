## if statement

```java
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score ==5000) {
            System.out.println("Your socre was 5000");
        }
```

## if else

```java
        if(score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }
```

## if else if else

```java
        if(score < 5000 && score > 1000) {
            System.out.println("Your score greater than 1000");
        } else if  (score < 1000 ) {
            System.out.println("Your score less than 1000");
        } else {
            System.out.println("Got here");
        }
```

## 66. Practical while Loop Exercises And Challenges


#### the while loop challenge 
* isEvenNumber 


```java
public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishedNumber = 20;

        for (int i = number; i <= finishedNumber; i++) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

```

#### the while loop challenge step 2 
* break once 5 even numbers are found 
```jshelllanguage
int number = 4;
int finishedNumber = 20;


for (int i = number, count = 0; i <= finishedNumber; i++) {
    if (isEvenNumber(i)) {
        System.out.println(i);
        count++; 
    }
    
    if(count >=5 ) {
        break; 
    }
}

```
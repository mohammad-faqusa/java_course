## while loop challenge :

```java
public class WhileLoopChallenge {

    public static void main(String [] args) {

        int i = 5 ;

        while(true){
            System.out.println((isEvenNumber(i)? i + " is even number " : i + " is not even number"));
            i++;
            if(i > 20)
                break;

        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

```

## while loop

## do while

```java
 public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        int x = 0;
        boolean isReady = true;
        while (isReady) {
            x++;
            if (x > 5) {
                isReady = false;
            }
            System.out.println(x);
        }
//        isReady = true;

        do {
            x++;
            if (x > 5) {
                isReady = false;
            }
            System.out.println("this is do while");
            System.out.println(x);

        } while (isReady);

    }
}


```

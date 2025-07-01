## switch statement

traditional if statement :

```java
public class Main {
    public static void main(String[] args) {

        int value = 1;

        if (value == 1) {
            System.out.println("the number is one");
        }
        else if (value == 2) {
            System.out.println("the number is two");
        } else {
            System.out.println("neither one nor two");
        }
    }
}

```

### the switch code example :

```java
public class Main {
    public static void main(String[] args) {

        int value = 1;

        switch (value) {
            case 1:
                System.out.println("the number is one");
                break;
            case 2:
                System.out.println("the number is two");
                break;
            default:
                System.out.println("neither one nor two");
        }
    }
}
```

## valid value types

byte, short, int , char

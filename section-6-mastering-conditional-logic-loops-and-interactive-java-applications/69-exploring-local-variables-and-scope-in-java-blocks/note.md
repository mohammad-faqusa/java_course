```java
public class Main {
    public static void main(String[] args) {

        int x = 0 ;

        {
//            int x = 1; // error : is already defined
            int y = 5 ;
            System.out.println("this is x "+ x );
            System.out.println("this is y " + y);
        }
        System.out.println("this is x "+ x );
//        System.out.println("this is y " + y); error , not found in scope

        // switch is different
        int value = 4 ;
        switch(value){
            case 1:
                int i = 10;
                break ;
            default:
                i = value ;
                System.out.println("this is value " + i );
        }
        // i is accessed if it is called after cases
    }
}

```

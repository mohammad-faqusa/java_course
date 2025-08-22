## Coding Exercise 27: Constructing A Diagonal Star Pattern With Loops

```java
public class DiagonalStar {

    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.print("Invalid Value");
            return;
        }

        for(int i = 1 ; i <= number ; i++ ) {

            for (int j = 1; j <= number; j++) {
                if(i == 1 || i == number) {
                    System.out.print("*");

                }
                else if(j == 1 || j == number){
                    System.out.print("*");
                }
                else if(i == j || number - j == i - 1){
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
```
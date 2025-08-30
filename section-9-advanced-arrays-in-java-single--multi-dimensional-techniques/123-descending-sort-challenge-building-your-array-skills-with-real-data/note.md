## 123. Descending Sort Challenge: Building Your Array Skills with Real Data

### The Array Challenge 
* create array using arrays : 
  * sorts list of integers in descending order
* create randomly generated integers 
* print the array before and after sorting

```java
package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] myIntArray = getRandomArray(10);

        System.out.println(Arrays.toString(myIntArray));
        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        
        int[] secondArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            secondArray[i] = myIntArray[myIntArray.length - i - 1];
        }

        System.out.println(Arrays.toString(secondArray));
    }

    private static int[] getRandomArray(int len) {

        int [] newArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }
}

```
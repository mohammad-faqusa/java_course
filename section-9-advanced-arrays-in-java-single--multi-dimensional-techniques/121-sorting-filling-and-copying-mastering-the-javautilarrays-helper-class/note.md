## 121. Sorting, Filling, and Copying: Mastering the java.util.Arrays Helper Class

### Why use arrays? 
* manage many items of the same type 
* common behaviors : sorting, initializing values, copying the array and finding an element
* the behavior is not on instance itself, but we use java.util.Arrays class

#### Arrays 
* follow the [link](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html) 
* for example 
  * binarySearch method 

### the code process 
1. create a package `UsingArrays`
```java
package dev.lpa;

public class Main {

    public static void main(String[] args) {
        
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        
        int[] thirdArray = Arrays.copyOf(firstArray, 5);
        System.out.println(Arrays.toString(thirdArray));
        
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));
        
        int[] smallerArray = Arrays.copyOf(thirdArray, 3);
        System.out.println(Arrays.toString(smallerArray));
        
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
    }
    
    private static int[] getRandomArray(int len) {
        
        Random random = new Random(); 
        int[] newInt = new int[len]; 
        
        
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
```
* sort an array : `Arrays.sort(firstArray);`
* fill method : 
    ```jshelllanguage
    int[] thirdArray = Arrays.copyOf(firstArray, 5);
    ```
* copy of : 
```jshelllanguage
int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); // full copy 
System.out.println(Arrays.toString(fourthArray));

int[] thirdArray = getRandomArray(10);
System.out.println(Arrays.toString(thirdArray));
    
int[] smallerArray = Arrays.copyOf(thirdArray, 3); // smaller copy 
System.out.println(Arrays.toString(smallerArray));
```
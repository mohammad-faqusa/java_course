## Coding Exercise 43: Reverse an Array: Mastering In-Place Swaps for Efficient Reordering

```java
public class ReverseArray {
    // write code here
    private static void reverse(int[]arr) {

        int[] arrCopy = new int[arr.length]; 
        int maxIndex = arr.length - 1; 
        for(int el : arr) {
            arrCopy[maxIndex--] = el; 
        }
        
        System.out.print("Array = " + java.util.Arrays.toString(arr) + "Reversed array = " + java.util.Arrays.toString(arrCopy)); 
    }
}
```
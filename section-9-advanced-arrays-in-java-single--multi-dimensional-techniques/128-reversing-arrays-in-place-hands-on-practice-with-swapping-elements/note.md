## 128. Reversing Arrays In-Place: Hands-On Practice with Swapping Elements

### The reverse array challenge 
* reverse the given array 

```java
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("reversed copy : " + Arrays.toString(reverseCopy(arr)));

    }

    public static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }


    private static int[] reverseCopy(int[] arr) {
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reverseArray[maxIndex--] = el;
        }
    }
}
```
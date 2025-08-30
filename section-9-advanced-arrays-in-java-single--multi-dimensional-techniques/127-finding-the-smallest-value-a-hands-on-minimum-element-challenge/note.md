## 127. Finding the Smallest Value: A Hands-On Minimum Element Challenge

### Minimum element challenge 

* write methdo **readIntegers** that reals a comma delimited list of numbers entered by the user from the console, and return **array**
* write method findMin(arr) 

in main method : 
* method readIntegers 
* call findMin 
* print minimum value 

```java

public class Main {
    
    private static int[] readIntegers() {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter list of integers, seperated by commas");
        String input = scanner.nextLine(); 
        String[] numbers = input.split(",");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i].trim());
        }
        return arr;
    }
    
    private int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        int[] arr = readIntegers();
        int minValue = findMin(arr);
        System.out.println("min value is " + minValue);
    }
}
```
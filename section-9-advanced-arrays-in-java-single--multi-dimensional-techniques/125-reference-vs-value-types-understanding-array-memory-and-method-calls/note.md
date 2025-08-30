## 125. Reference vs. Value Types: Understanding Array Memory and Method Calls

### Reference Types vs. Value Types 
* when assigning an object to a variable, the variable becomes a reference to that object 
* this is true of arrays, 
  * but has yet another level of indirection if it's an array of objects
* this means every array element is also a reference 

### The code process 
1. create a project : ArrayReferences

```java
public class Main {

    public static void main(String[] args) {
        
        int [] myIntArray = new int[5]; 
        int[] anotherArray = myIntArray; // declare another reference to the same memory 

        System.out.println(Arrays.toString("myIntArray: ",myIntArray));
        System.out.println(Arrays.toString("anotherArray: ",anotherArray));

        anotherArray[1] = 20;
        modifyArray(anotherArray); 

        System.out.println(Arrays.toString("myIntArray: ",myIntArray));
        System.out.println(Arrays.toString("anotherArray: ",anotherArray));

    }
    
    private static void modifyArray(int[] array) {
        
        array[2] = 5; 
    }
}
```


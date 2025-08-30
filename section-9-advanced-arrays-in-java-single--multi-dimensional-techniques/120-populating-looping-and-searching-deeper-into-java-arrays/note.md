## 120. Populating, Looping, and Searching: Deeper into Java Arrays

### What is an array, really? 
* special **class** in java 
  * it is still a class 
  * like other classes inherit from `java.Object`

### The process code 
```java
public class Main {

    public static void main(String[] args) {
        
        // ... previous code 
        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " "); // print zeros 
        }

        int [] newArrayEnhanced;
        newArrayEnhanced = new int[5];
        for(int i : newArrayEnhanced){
            System.out.print( i + " " ); // print zeros 
        }

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));
        
    }
}
```
* back to the project 
* init array without assigning vlaues : 
  * it will print zeros 
```jshelllanguage
int [] newArray; 
newArray = new int[5];
for(int i = 0; i < newArray.length; i++){
    System.out.print( newArray[i] + " " ); // print zeros 
}
```

#### Array initialization and default elements values 

#### enhanced for loop 
```jshelllanguage
int [] newArray; 
newArray = new int[5];
for(int i : newArray){
    System.out.print( i + " " ); // print zeros 
}
```

#### try to print array valirable name 
```jshelllanguage
System.out.println(newArray); // java.lang.Object.toString() method 
```
* we have to **override** the `toString` method 
* but we **can't** **override** with the Array 
* solution : java provides helper class to configure the array 
  * `util.Arrays`

##### Java.util.Arrays
* helper class provide common functionality for common array operation 
* static methods not instance methods 

##### printing elements of the array using `Array.toString()`
```jshelllanguage
System.out.println(Arrays.toString(newArray)); 
Object objectVariable = newArray; 
if(objectVariable instanceof int[]){
    System.out.println("objectVariable is really an int array");
}

Object[] objectArray = new Object[3]; 
objectArray[0] = "Hello"; 
objectArray[1] = new StringBuilder("World");
objectArray[2] = newArray; 
System.out.println(Arrays.toString(objectArray));
```
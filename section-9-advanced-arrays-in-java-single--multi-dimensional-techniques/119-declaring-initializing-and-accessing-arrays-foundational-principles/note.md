## 119. Declaring, Initializing, and Accessing Arrays: Foundational Principles

### Arrays 
* indexed 0 

#### declaring an array 
```jshelllanguage
int[] arr;
String[] strArr; 
String courseList[]; 
```
* the most common way is the first one `int[] arr;`
* you can specify the brackets after the variable name : `String courseList[];`

#### Instantiating an Array

* Array creation : 
```java
int[] integerArray = new int[10]; 
```
* object creation 
```java
StringBuilder sb = new StringBuilder(); 
```
* array creation is similar to object creation , but 
  * square brackets  `[]`
  * can't use `()`

### The code process 
1. create project `ArrayProject`
```java
package dev.lpa; 

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
//        myIntArray[4] = "1"; // compiler error 
        
        double[] myDoubleArray = new double[10]; 
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);// call the third element
    
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        int arrayLength = firstTen.length;
        System.out.println("length of the array is : " + arrayLength);
//        System.out.println("last = " + firstTen[arrayLength]); // exception out of bound 
        System.out.println("last = " + firstTen[arrayLength - 1]); // exception out of bound 
        
        int[] newArray; 
        newArray = new int[]{1,2,4,7,3,5,6}; 
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
```

#### An Array is NOT resizable 
`int[] myIntArray = new int[10];`
* in this case this array will have **10 elements** 
* you can't change the **size** of the array 
* you can't **add** elements to the array 
* you can't **remove** elements from the array 

#### The array initializer 
```jshelllanguage
int[] firstFivePositives = new int[]{1,2,3,4,5}; 
```

#### the array initializer as an anonymous array 
```jshelllanguage
int[] firstFivePositives = {1,2,3,4,5};
String[] name={"John","Jane","Jill"};
```
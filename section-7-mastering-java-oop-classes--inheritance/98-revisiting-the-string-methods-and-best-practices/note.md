## 98. Revisiting the String: Methods and Best Practices

### The String

* has over 60 methods available
* String is sequence of characters ,
* are indexed, start from 0
* the last index = size - 1

### The purpose of String methods

we can split to three basic categories

* String inspection Methods
* Methods for Comparing String values
* String manipulation methods

#### String inspection Methods

| method                  | description                                                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| length                  | Return the number of character in the String                                                                                  |
| charAt                  | Returns the character at the index that's passed                                                                              |
| indexOf<br/>LastIndexOf | returns an integer, representing the index in the sequence where the String or character passed, can be located in the String |
| isEmpty                 | Returns true if length is zero                                                                                                |
| isBlank                 | Returns true if length is zero OR the string only contains whitespace character , added in JDK 11                             |  

```java

public class Main {

    public static void main(String[] args) {

        printInformation("hello world");
        printInformation("");
        printInformation("\t \n");
        
    }
    
    public static void printInformation(String string) {
        
        int length = string.length();
        System.out.printf("Length : %d %n ", length);
        
        if(string.isEmpty()) {
            System.out.println("String is Empty");
            return; 
        }
        if(string.isBlank()) {
            System.out.println("the string is blank");
            return; 
        }
        System.out.printf("first char = %c %n", string.charAt(0));

        System.out.printf("Last character = %c %n", string.charAt(length -1));
        
        String helloworld = "hello world";

        System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("index of r = %d %n", helloworld.lastIndexOf('r'));
        
    }
}
```

#### String Comparison methods 
| method           | description                                                                                                                                                                              |
|------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| contentEquals    | Returns a boolean if the String's value is equal to the value of the argument passed. This method allows for arguments other than String, for any type that that is a character sequence |
| equals           | return a boolean if the String's value is equal to the value of the argument passed                                                                                                      |
| equalsIgnoreCase | returns a boolean if the String's valud is equal (ingoring case), to the vlaue of the argument passed                                                                                    | 

#### String comparison methods 
| method               | description                                                                                                                     |
|----------------------|---------------------------------------------------------------------------------------------------------------------------------|
| contains             | returns a boolean if the String contains the argument passed                                                                    |
| endsWith, startsWith | there return a boolean, and are much like the contains method, but more specific to the placement of the argument in the String |
| regionMatches        | returns a boolean, if defined sub-regions are matches                                                                           |

```jshelllanguage
String helloWorld = "hello world";
String helloWorldLower = helloWorld.toLowerCase(); 
if(helloWorld.equals(helloWorldLower)){
    System.out.println("the string is in lower case");
}

if(helloWorld.startsWith("hello")){
    System.out.println("starts with hello");
}

if(helloWorld.endsWith("world")){
    System.out.println("ends with world");
}

if(helloWorld.contains("world")){
    System.out.println("ends with world");
}

if(helloWorld.contentEquals("Hello World")){
    System.out.println("Values match exactly");
}

```
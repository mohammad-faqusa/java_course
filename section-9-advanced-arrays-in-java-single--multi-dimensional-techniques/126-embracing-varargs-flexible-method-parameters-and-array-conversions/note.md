## 126. Embracing varargs: Flexible Method Parameters and Array Conversions

### Arrays as method parameters 

1. lets revisit the main method 
```java
public class Main {

    public static void main(String[] args) {
        
    }
}
```
* notice the parameter of the main method 
* you can pass array of strings 

#### Variable argumetns (varargs) 
* can be written in slightly different way 
* we can replace the brackets after the string type , which we know tells us this method take an array of String 
```jshelllanguage
public static void main(String... args) {
    
}
```
* replace with three periods (...)


* what is the difference ? 

#### back to main method 
```java
public class Main {

    public static void main(String... args) {
        System.out.println("Hello world again");
        
        String splitStrings = "hello world again".split(" "); 
        printText(splitStrings);

        System.out.println("_".repeat(20));
//        when using printText(String... textList) 
        printText("Hello"); // this is a single string 
        printText("Hello", "World", "again"); // this is a single string 
    
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }
    
    private static void printText(String[] textList) {
        
        for (String text : textList) {
            System.out.println(text);
        }
    }

    private static void printText(String... textList) {

        for (String text : textList) {
            System.out.println(text);
        }
    }
}
```
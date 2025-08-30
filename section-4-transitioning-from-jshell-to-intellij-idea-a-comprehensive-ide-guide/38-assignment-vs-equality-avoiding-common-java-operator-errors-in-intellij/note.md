## 38. Assignment vs. Equality: Avoiding Common Java Operator Errors in IntelliJ

### The process 
* add to Hello class : 
```java
public static void main(String[] args) {
    // ....
    int newValue = 50;
    if (newValue = 50) { // error assignement operator, not qual operator 
        System.out.println("this is an error ");
    }
    
    //
    boolean isCar = false; 
    if(isCard = true) {
        System.out.println("This is not supposed to happen");
    }
}
```
_then error happen :_ 
```bash
C:\java_course\workplace\01-HelloWorld\src\Hello.java:33:22
java: incompatible types: int cannot be converted to boolean
```

* `if(isCard = true)`  
this time intellij does not see any problem  
because it is boolean  

* you can simlify the statements : 
```jshelllanguage
if (isCard) {
    System.out.println("This is not supposed to happen");
}

if (!isCard) {
    System.out.println("This is not supposed to happen");
}
```

#### The not operator 
* is also known complement 
* 
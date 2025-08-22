## 85. Static vs. Instance Variables in Java

### Static variables 
* it is considered best practice to use the Class name and not a referecne variable to access a static variable 
```java
class Dog {
    
    private static String genus = "Canis"; 
    
    void printData() {
        
        Dog d = new Dog();
        System.out.println(d.genus); // confusing 
        System.out.println(Dog.genus); // clearer! 
    }
}
```
* an instance isn't required to exist to access the value of a **static varialbe** 

* static are not used very often, but sometimes can be useful : 
  * Storing counters
  * Generating unique IDs
  * Storing a constant value that doesn't change 
  * Creating and controlling access to a shared resources 

### Instance variables 
* we don't use static keyword 
* also known **member variables** 
* **instance variables** belong to a specific instance of a class 
* each instance has its own copy 
* can have different values 
```java
class Dog {
    
    private String name ; 
    
    public Dog(String name) {
        this.name = name; 
    }
    
}
```

```java
public class Main {

    public static void main(String[] args) {
        
        Dog rex = new Dog("rex"); 
        rex.printName();

        Dog fluffy = new Dog("fluffy");
        fluffy.printName();
    }
}
```


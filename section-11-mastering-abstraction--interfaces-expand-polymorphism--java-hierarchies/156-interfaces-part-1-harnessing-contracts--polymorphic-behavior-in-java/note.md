## 156. Interfaces (Part 1): Harnessing Contracts & Polymorphic Behavior in Java

### Interface vs abstract class 
* interface isn't class 

### delaring interface 
`public interface FlightEnabled {}`

#### using interface 

```java
public class Bird implements FlightEnabled {}
```

### the process 
1. create `interface` prject 
2. create animal class 
3. create interface FlightEnabled 
4. create Bird, implments FlightEnabled, Trackable 

```jshelllanguage
public static void main(String[] args) {
    
    Bird bird = new Bird(); 
    Animal animal  = bird; 
    FlightEnabled flier = bird; 
    Trackable tracked = bird; 
    
    
}
```

````java
public abstract class Animal {
    public abstract void move(); 
}
````

```java
interface FlightEnabled {
    public abstract void takeOff(); 
    abstract void land(); 
    void fly(); 
}
```
`void fly(); ` why allowed  ? 
* implicitly decleration as abstract 
* **protected access modifier** is not allowed in the interface 
* all members of interface are implicitly public 

back to Trackable interface 
```java
interface Trackable {
    
    void track(); 
//    void track(); {}
}
```
why interfaces are powerful even the methods don't have body 

#### back to code 
```java
public class Bird implements FlightEnabled, Trackable {}
```
* implements the method using IntelliJ 
* to make sure that the class implements all the methods in the interface 


## 159. Interfaces & JDK 8 Enhancements: Default/Static Methods for Compatibility

### whats happened to the interface since JDK 8 
* before jdk 8 , interface type could only have **public abstract methods** 
* jdk 8 introduced **default** and **public** static methods and JDK 9 introduced private methods, both static and non-static methdos 
* All of these new method types(on an interface) are concrete methods

### extension method 
* is defined by modifier **default** 
* this is concrete method

### the code process 
* add default method in interface 

#### create Test.java
* call the created method in main  method 

#### What if two interfaces provide the same default method?
```java
interface A {
    default void greet() { System.out.println("Hello from A"); }
}

interface B {
    default void greet() { System.out.println("Hello from B"); }
}

class C implements A, B {
    @Override
    public void greet() {
        // must resolve the conflict explicitly
        A.super.greet(); // or B.super.greet();
        System.out.println("Hello from C");
    }
}

```

#### the little icons in intellij 
* blue circle for the transition method 
* green circle indicated we're implementing an abstract method 

#### Overriding a default method choices 
* not override 
* override method and write code 
* write your own code, and invoke the method on the interface as part of your implementation, for example as following : 
```java
class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public void sleep() {
        Animal.super.sleep(); // invoke interface default method
        System.out.println("But cows sleep standing up!");
    }
}
```

### the code process 
1. create method in FlightStages 
```jshelllanguage
public FlightStages getNextStage() {
    FlightStages[] allStages = values();
    return allStages[(ordinal() + 1) % allStages.length]; 
}
```
2. create transition 
```jshelllanguage
public FlightStages transition(FlightStages stage) {
    
    FlightStages nextStage = stage.getNextStage();
    System.out.println("Transitioning from " + stage + " to " + nextStage);
    return FlightEnabled.super.transition(stage); 
}
```
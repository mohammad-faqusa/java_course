## 78. Getters, Encapsulation, and Object Access


### the process 
after writing car class, we call it in main calss 
```java
public class Main {

    public static void main(String[] args) {
        Car can = new Car(); 
        car.describeCar(); 
        
    }
}
```
* the output is null 
* why null 

#### null 
* is special keyword in java, meaning the variable or attribute has a type but no reference to an object
* fields with **primitive** data type are neven null 
  * string could be null, because it is an object not pure primitive 

#### default values for fields on classes 
| dat atype                                | default value |
|------------------------------------------|---------------|
| boolean                                  | false         |
| byte<br/>short<br/>int<br/>long<br/>char | 0             |
| double<br/>float                         | 0.0           |


#### in Car class 
```java

public class Car {
    
    private String make = "Tesla"; 
    private String model = "Model X";
    private String color = "White"; 
    private int doors = "2"; 
    private boolean convertable = false; 
    
    public void describeCar() {

        System.out.println(doors + "-Door" +
            color + "  " +
                make + "  " +
                model + "  " +
                convertable? "Convertable" : "non-convertable" 
        );
    }
    
    public String getMake() {
        return make; 
    }
    
    public void setMake (String make) {
        this.make = make; 
    }
    
    // other getters and setters 
}
```

#### what are getters and setters? Why should we use them ? 
* a getter is a method on a class that retrieves the value of a private field and returns it.
* a setter is a method on a class that sets the value of a private field 
* the purpose is to **control and protect** access to these **private fields**


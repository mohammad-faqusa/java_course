## 77. Deep Dive into Classes and Objects

### Introduction to Classes and Objects 
* object oriented programming ?  (OOP)
is a way to medel real-worl objects as software objects which contain both data and code  
* OOP : some times called `class-based programming`

### real world object exercise 
* a computer, keyboard, microphone ... 
* are example of real world objects 

Object has : 
* state
  * amount or ram
  * operating system
  * ...
* behaviour
  * booting up 
  * shutting down ... 

#### state and behaviour 

##### class
describe the data(fields), and behaviour (methods) 

* static field : stored in class 
* instance field : stored in object 

```java
public class Main {

    public static void main(String[] args) {
        
        
    }
}
```

#### creating class 
* on project panel 
* right click in `src`
* create `class`
* name `car`

```java
public class Car {
    
    
}
```

#### organizing classes : 
* group classes with package 
* in not specified, will look to default package 

#### Access modifiers for the class 
| access keyword | description                                                                                        |
|----------------|----------------------------------------------------------------------------------------------------|
| public         | public means any other class in any package can access this class                                  |
|                | when omitted, this means package access, the class only accessible for classes in the same package | 


#### Access modifiers for class members : 
| access keyword | description                                                                   |
|----------------|-------------------------------------------------------------------------------|
| public         | public means any other class in any package can access this class             |
| protected      | only subclasses in same or other package have access                          |
|                | when omitted, package access, mean the classes in the same package can access |
| private        | no other class can access to this member                                      |      

#### Encapsulation 
* usually has two meaning 
  * bundling **behaviour** and **attributes** on a single object
  * hiding fields and some methods from public access
* when we create a **private** field
  * we can create public method that allow access to this field with specific operations 

```java

public class Car {
    
    private String make; 
    private String model;
    private String color; 
    private int doors; 
    private boolean convertable; 
    
    public void describeCar() {

        System.out.println(doors + "-Door" +
            color + "  " +
                make + "  " +
                model + "  " +
                convertable? "Convertable" : "non-convertable" 
        );
    }
}
```

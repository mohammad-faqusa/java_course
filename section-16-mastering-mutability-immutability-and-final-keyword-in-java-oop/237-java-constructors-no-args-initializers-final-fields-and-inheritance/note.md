## 237. Java Constructors: No-args, Initializers, Final Fields, and Inheritance

### the process 
1. create Parent class 
2. create Child class 
3. in main 
   - create `parent` instance
   - create `child` instance
4. print the `child` and `parent`
5. create **code block** to assign the fields **isntasnce initializer** 
6. create **constructor** and init the fields //  (error final are assgined previously)
7. create **no args constructor**
    * the init block will run first 
8. use param constructor and delete the assigned fields in the init block 
9. update the child class constructor


#### Parent class
* fields 
  * name - final
  * dob - final 
* getters/setters 
* toString 

#### instance init ; 
* delcared directly in a class body 
```java
public class Parent {
    private final String name; 
    private final String dob;

    {
        name = "John"; 
        dob = "1990-01-01";
    }
    
    }
}
```
* executed when instance of class is created 
* are executed before any code in class constructors is exectued.
* you can have multi init block 
  * they will be executed in the order they are declared.

## 34. Understanding IntelliJ Code Structure: Classes, Methods, and Basic Java Syntaxn

### Introduction 
* we will focus on source code 

```java
public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

#### Access Modifiers
allows us to define which parts of our code, or even someone else's code, can access a particular element
* public 

#### keyword class

#### {} 
define the class block 
to group statements together 
has the class body 
* main method 
* class 

#### what is method : 
* is a collection of one or more statements used to perform an operation 
* we will use (main) method , that java looks when running the program 

#### keywords : 
public : access modifier 
public for method : also same thing 
static : in oop concepts explained 
void : indicate the method won't return any information

#### code structure 
() are important for method declaration , 
* inside 1 parameter defined (String [] args)

#### experiments on code 
* try to delete double quote :  
`System.out.println("Hello World);`  
we have error 


#### Challenge : 
* instead of printing `Hello World`, type `Hello Tim`
```java
public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello Tim");
    }
}
```

#### How to create a class in IntelliJ 
1. right click on `src`
2. create class 
3. name for example : `SecondClass`
4. copy and paste main method from `FirstClass` to `SecondClass`
5. create class `Hello`
```java
public class Hello {
    public static void main(String[] args) {
        System.out.print("Hello, Mohammad");
        System.out.print("Hello World");
    }
}
```
we want to print it in separate lines : 
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Mohammad");
        System.out.println("Hello World");
    }
}
```
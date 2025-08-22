## 81. Constructors Part 1: Object Initialization

### Constructor 
* is used in the creation of an object
* has the same name of the class, and does not return any values 
* you nevel include **return type** from a constructor 

```java
public class Account {
    
    public Account() { // this is constructor declaration , default constructor, if no constructors decalred in the calss 
        
    }
    
}
```


#### make use of the constructor in Main 
```java

public class Main {
    public static void main(String[] args) {
        
        Account bobsAccount = new Account(); // default constructor, if no constructors decalred in the calss 
    }
}
```

#### the default constructor 
* if class has no constructor declarations , then a default constructor is implicitly declared
* this constructor has no parameters , often called **no args** 
* if other constructors are declared, then a default constructor **is NOT implicitly declared** 

```java
public class Account {
    
    public Account() { // this is constructor declaration , default constructor, if no constructors decalred in the calss 
        System.out.println("Empty constructor called ");
    }
    
    public Account(String number, double balance, String customerName, String email, String phone) {

        System.out.println("Account constuctor with parameters called ");
        this.number = number; 
        this.balance = balance; 
        this.customerName = customerName; 
        customerEmail = email; 
        customerPhone = phone; 
    }
}
```

##### back to Main method 
```jshelllanguage

Account bobAccount = new Account("12345" , 1000,  "Bob brown" , "bob@gmail.com");
```

#### Constructor overloading 
* is declaring multiple constructors with different parameters 
* number of parameters can be different 
* also the type of parameters are different , if they have same number of parameters , or order of types 



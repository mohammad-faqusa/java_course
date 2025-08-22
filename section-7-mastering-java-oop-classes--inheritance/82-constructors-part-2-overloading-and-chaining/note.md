## 82. Constructors Part 2: Overloading and Chaining

### Constructor chaining with this() 
* constructor chaning is when one constructor explicitly calls another overloaded constructor
* you must use `this()` to execute another constructor 
* be sure to use `this()` at the first line of the constructor 
```java
public class Account {

    public Account() { // this is constructor declaration , default constructor, if no constructors decalred in the calss 
        this("12345" , 1000,  "Bob brown" , "bob@gmail.com");
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
* general rule of thumb : assign the fields directly in constructor 
  * don't use setters

#### IntelliJ generation tool 
* press alt + insert
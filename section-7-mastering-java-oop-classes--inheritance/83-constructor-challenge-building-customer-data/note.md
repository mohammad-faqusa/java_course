## 83. Constructor Challenge: Building Customer Data


### Constructor challenge exercise 
1. create new class , `Customer`
2. fields 
   * name
   * credit limit 
   * email address
3. create getter methods 
4. create three constructors 
   * for all fields 
   * no args 
   * name, email 

```java
public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("customer name" , 1000, "customer@gmail.com")
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 100, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

```

### in Main class 
```java
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("moahmmad" , 100, "mohammadfaqusa9@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
    }
}
```
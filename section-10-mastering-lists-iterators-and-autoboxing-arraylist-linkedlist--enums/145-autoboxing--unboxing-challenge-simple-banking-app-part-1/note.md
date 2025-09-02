## 145. Autoboxing & Unboxing Challenge: Simple Banking App (Part 1)

#### Autoboxing challenge with ArrayLists 
you need to create simple banking application with  
* customer , Bank type 
* customer : 
  * have a name 
  * have an **ArrayList** of transactions containing Double wrapper elements
  * transaction can be **credit** positive amount, **debit** negative amount 
* Bank 
  * name 
  * Array list of customers 
  * should **add a new customer** if they are not in the list 
  * the bank class should allow a customer to **add a transaction** to na existing Customer 
  * print statement : customer name, transaction amount, this method should use unboxing 

```java
record Customer(String name, ArrayList<Double> transactions) {
    
    public Customer(String name, double initialDeposit) {
        
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit); 
    }
}

public class Main {

    public static void main(String[] args) {
        Customer bob = new Customer ("bob" , 1000);
        System.out.println(bob);
        
    }
}

class Bank {
    
    private String name; 
    private ArrayList<Customer> customers = new ArrayList<>(5000); 
    
    public Bank(String name) {
        this.name = name; 
    }
    
    // getters / setters
    pirvate Customer getCustomer (String customerName) {
        
        for (Customer c : customers ) {
            if(c.name().equalsIgnoreCase(customerName)){
                return customer; 
            }
        }
        System.out.println("Customer (%s) wasn't found %n ", customerName);
    }
    
    public void addNewCustomer (String customerName, double initialDeposit) {
        if(getCustomer(customerName)== null) {
            Customer customer = new Customer(customerName, initialDeposit); 
            customers.add(customer);
            System.out.println("New cusotmer is added " + customer); 
            
        }
        
    }
}
```
## 146. Autoboxing & Unboxing Challenge: Bank & Customer Implementation (Part 2)

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
        
        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jave A", 500);

        System.out.println("Bank : " + bank.toString());
        
        bank.addTransaction("Jane A" , -10);
        bank.addTransaction("Jane A" , 123);
        bank.addTransaction("Jane A" , 55);
        
        bank.addNewCustomer("Bob s", 25); 
        bank.addTransaction("Bob S", 100);
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
    
    public void addTransaction(String name, double transactionAmount) {
        
        Customer customer = getCustomer(name); 
        if(customer != null) {
            customer.transactions().add(transactionAmount); 
        }
    }
    
    public void printStatement(String customerName) {
        
        Customer customer = getCustomer(customerName);
        if(customer == null ) {
            return; 
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer : " + customer.name());
        System.out.println("Transactions : " );
        for(double d : customer.transactions()) {
            // print the transaction , specify if dept 
        }
    }
}
```
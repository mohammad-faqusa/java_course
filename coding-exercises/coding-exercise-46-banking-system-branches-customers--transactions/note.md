## Coding Exercise 46: Banking System: Branches, Customers & Transactions


#### Bank 
```java
import java.util.ArrayList; 


public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches; 
    
    public Bank(String name) {
        this.name = name; 
        branches = new ArrayList<Branch>(); 
    }
    
    public boolean addBranch(String branchName) {
        Branch tempBranch = findBranch(branchName); 
        
        if(tempBranch != null )
            return false; 
        
        tempBranch = new Branch(branchName);
        branches.add(tempBranch); 
        return true; 
        
    }
    
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        
        Branch tempBranch = findBranch(branchName); 
        
        if(tempBranch == null) {
            return false; 
        }
        
        for(Customer c : tempBranch.getCustomers()) {
            if(c.getName().equalsIgnoreCase(customerName))
                return false; 
        }
        
        
        tempBranch.newCustomer(customerName, initialTransaction);
        return true; 
        
        
    }
    
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName); 
        
        if(tempBranch == null) 
            return false; 
            
        Customer tempCustomer = null ; 
        
        for(Customer c : tempBranch.getCustomers()) {
            if(c.getName().equals(customerName))
                tempCustomer = c; 
        }
        
        if(tempCustomer == null)
            return false; 
        
        tempCustomer.getTransactions().add(transaction); 
        return true; 
    }
    
    private  Branch findBranch(String branchName) {
        
        for(Branch b : branches) {
            if(b.getName().equals(branchName)) {
                return b; 
            }
        }
        return null; 
    }
    
    public boolean listCustomers(String branchName, boolean showTransactions) {
        
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
    
}
```


#### branch 
```java
import java.util.ArrayList; 

public class Branch {
    // write code here
    private String name; 
    private ArrayList <Customer> customers; 
    
    public Branch(String name) {
        this.name = name; 
        customers = new ArrayList<Customer>(); 
    }
    
    public String getName() {
        return name;
    }
    
    
    public ArrayList<Customer> getCustomers() {
        return customers; 
    }
    
    public boolean newCustomer(String customerName, double transaction) {
        
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName, transaction)); 
            return true; 
        }
        
        return false; 
        
    }
    
    public boolean addCustomerTransaction(String name, double transaction) {
        
        Customer tempCustomer = findCustomer(name); 
        
        if(tempCustomer == null )
            return false; 
        
        tempCustomer.addTransaction(transaction); 
        return true; 
    }
    
    private Customer findCustomer(String customerName) {
        
        for(Customer c : customers) {
            if(c.getName().equals(customerName))
                return c; 
        }
        return null; 
    }
}
```

```java
import java.util.ArrayList; 


public class Customer {
    // write code here
    private String name; 
    private ArrayList<Double> transactions; 
    
    public Customer(String name, double initialTransaction) {
        this.name = name; 
        transactions = new ArrayList<Double>(); 
        transactions.add(initialTransaction); 
    }
    
    public String getName() {
        return name; 
    }
    
    public ArrayList<Double> getTransactions() {
        return transactions; 
    }
    
    public void addTransaction(double transaction) {
        
        transactions.add(transaction); 
        
    }
    
    
    
    
}
```
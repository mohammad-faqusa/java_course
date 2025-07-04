public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;

    public Account() {
        this("32434234", 10000, "Default Name", "Default Email"); // must be called at first line
        System.out.println(this.toString());
        System.out.println("The constructor is called");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public Account(String customerName, String customerEmail) {
        this("9999", 100.5, customerName, customerEmail);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("Amount is negative");

        }
        if(amount > balance){
            System.out.println("Amount is greater than balance");

        }
        balance -= amount;
        System.out.println("The balance is : " + balance);
    }

    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("Amount is negative");
        } else {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;

    public int getAccountNumber() {
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

    public void setAccountNumber(int accountNumber) {
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

import java.util.ArrayList;

public class AutoBoxingChallenge {
    public static void main(String[] args) {


    }
}

class Customer {
    String name;
    ArrayList<Double> transactions;

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


}

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public void addTransaction(Customer customer, Double amount) {

    }
}

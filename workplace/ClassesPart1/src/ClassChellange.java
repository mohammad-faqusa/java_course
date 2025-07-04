public class ClassChellange {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Mohammad");
        bankAccount.setAccountNumber(1);
        bankAccount.setCustomerEmail("m@g.com");
        bankAccount.setBalance(500);
        bankAccount.deposit(500);
        bankAccount.withdraw(600);

        System.out.println(bankAccount.toString());

    }
}

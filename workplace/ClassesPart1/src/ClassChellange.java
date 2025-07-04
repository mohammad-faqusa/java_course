public class ClassChellange {
    public static void main(String[] args) {
        Account account = new Account();
        account.setCustomerName("Mohammad");
        account.setAccountNumber("1");
        account.setCustomerEmail("m@g.com");
        account.setBalance(500);
        account.deposit(500);
        account.withdraw(600);

        System.out.println(account.toString());

        Account mohammadsAccount = new Account("123", 1000, "Mohammad", "m@gmail.com");
        System.out.println(mohammadsAccount.toString());


    }
}

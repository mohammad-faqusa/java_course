package dev.lpa;

import dev.bank.Bank;
import dev.bank.BankAccount;
import dev.bank.BankCustomer;

public class Main {

    public static void main(String[] args) {

//        BankAccount account =
//                new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

//        BankCustomer joe = new BankCustomer("Joe", 500.00,
//                10000.00);
//        System.out.println(joe);

//        BankCustomer joe = null;
//        List<BankAccount> accounts = joe.getAccounts();
//        accounts.clear();
//        System.out.println(joe);

        Bank bank = new Bank(123456789);
        bank.addCustomer("Joe", 500.00, 10000.00);

        BankCustomer joe = bank.getCustomer("000000010000000");
//        System.out.println(joe);
//        List<BankAccount> accounts = joe.getAccounts();
//        accounts.clear();
        System.out.println(joe);

        if(bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, 35)) {
            System.out.println("Transaction successful");
            System.out.println(joe);
        }

        var transactions = joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions();
        transactions.forEach((k, v) -> System.out.println(k + ": " + v));
//        transactions.put(3L, new Transaction(123456789, 3L, 1, 100.00));

        transactions.clear();
//        for(var tx : transactions.values()) {
//            tx.setAmount(tx.getAmount() * 2 + 100000);
//            tx.setCustomerId(222);
//        }

        System.out.println(transactions);
        System.out.println("-----------------------------------------");
        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
package dev.lpa;

import dev.lpa.bank.BankAccount;
import dev.lpa.bank.BankCustomer;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankCustomer joe = null;
        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);
    }
}
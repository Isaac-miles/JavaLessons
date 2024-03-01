package dev.challenge1;

import dev.bank.BankAccount;
import dev.bank.BankCustomer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING,500);
//        System.out.println(account);
        BankCustomer joe = new BankCustomer("Joe",500.0,1000.0);
        System.out.println(joe);

        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);

    }
}

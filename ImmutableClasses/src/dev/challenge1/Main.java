package dev.challenge1;

import dev.bank.Bank;
import dev.bank.BankCustomer;

public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING,500);
//        System.out.println(account);
//        BankCustomer joe = new BankCustomer("Joe",500.0,1000.0);
//        System.out.println(joe);
        Bank fidelityBank = new Bank(65606002);
        fidelityBank.addCustomer("Joe",500.0,2000.0);

         BankCustomer joe = fidelityBank.getCustomer("000000010000000");
        System.out.println(joe);


    }
}

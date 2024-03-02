package dev.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public final int routingNumber;
    private long lastTransactionId = 1;
    private final Map<String, BankCustomer> customers;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        customers = new HashMap<>();
    }
    public BankCustomer getCustomer(String id){
        return customers.get(id);
    }

    public void addCustomer (String name, double checkingInitialDeposit,double savingsInitialDeposit){
        BankCustomer customer = new BankCustomer(name,checkingInitialDeposit,savingsInitialDeposit);
        customers.put(customer.getCustomerId(),customer);
    }

    public boolean doTransaction(String id,BankAccount.AccountType accountType,double amount){
        BankCustomer customer = customers.get(id);

        return false;
    }
}

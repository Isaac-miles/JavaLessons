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

}

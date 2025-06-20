package dev.Synchronization;

import java.util.concurrent.TimeUnit;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double originalBalance = balance;
        balance+=amount;
        System.out.printf("STARTING BALANCE: %.0f, DEPOSIT(%.0f)"+
                " : NEW BALANCE = %.0f%n", originalBalance,amount,balance);
    }
    public void withdraw(double amount){
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double originalBalance = balance;
        if(balance >= amount){
            balance -=amount;
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAW(%.0f)"+
                    " : NEW BALANCE = %.0f%n", originalBalance,amount,balance);
        }
        System.out.printf("STARTING BALANCE: %.0f, WITHDRAW(%.0f)"+
                " : INSUFFICIENT FUNDS = %.0f%n", originalBalance,amount,balance);
    }
}

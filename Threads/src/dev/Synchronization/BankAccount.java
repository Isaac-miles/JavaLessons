package dev.Synchronization;

import java.util.concurrent.TimeUnit;

public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
        System.out.println("Updated name = "+ this.name);
    }

    public double getBalance(){
        return balance;
    }
    public synchronized void deposit(double amount){
        try{
            System.out.println("Deposit - Talking to the teller at the bank...");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//A thread acquires a lock by executing a synchronized method on the instance, or by using the instance as the parameter to synchronized statement
//A thread releases a lock when it exits from a synchronized block or method, even if it throws an exception
//        synchronized (this){
            double originalBalance = balance;
            balance+=amount;
            System.out.printf("STARTING BALANCE: %.0f, DEPOSIT(%.0f)"+
                    " : NEW BALANCE = %.0f%n", originalBalance,amount,balance);
//        }
    }
    public synchronized void withdraw(double amount){
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double originalBalance = balance;
        if(amount <= balance){
            balance -=amount;
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAW(%.0f)"+
                    " : NEW BALANCE = %.0f%n", originalBalance,amount,balance);
        }else {
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAW(%.0f)"+
                    " : INSUFFICIENT FUNDS = %.0f%n", originalBalance,amount,balance);
        }
    }
}

package dev.zico;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name,double initialDeposit){
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class AutoBoxingChallenge {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 100);
        System.out.println(bob);
    }
}

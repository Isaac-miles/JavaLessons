package dev.zico;

import java.util.ArrayList;

record CustomerA(String name, ArrayList<Double> transactions){
    public CustomerA(String name, double initialDeposit){
        this(name.toLowerCase(), new ArrayList<>(100));
        transactions.add(initialDeposit);
    }
}
public class AutoBoxChallenge {
    public static void main(String[] args) {
        Customer Isaac = new Customer("Isaac", 100);
//        System.out.println(Isaac);
    }

class Bank{
        private String name;
        private ArrayList<Customer> customers = new ArrayList<>(1000);

        public Bank(String name){
            this.name = name.toUpperCase();
        }

}
}

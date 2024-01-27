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
        CustomerA Isaac = new CustomerA("Isaac", 100);
//        System.out.println(Isaac);
        Bankk accessBank = new Bankk("Access Bank");
        Bankk bank = new Bankk("uba");
        accessBank.addNewCustomer("miles", 200);
        accessBank.addNewCustomer("miles", 100);
//        accessBank.addTransactions("Isaac", -10);
//        accessBank.printTransactions("isaac");
//        System.out.println(accessBank);

    }
}
class Bankk{
    private String name;
    private ArrayList<CustomerA> customers = new ArrayList<>(1000);

    public Bankk(String name){
        this.name = name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Bankk{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private CustomerA findCustomer(String customerName){
        System.out.println(customers);
        for(var customer:customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }
    public void addNewCustomer(String customerName,  double initialDeposit){
        CustomerA findCus = findCustomer(customerName);
        System.out.println(">".repeat(10) + findCus);

       if(findCus == null){
           customers.add(new CustomerA(customerName,initialDeposit));
           System.out.println(customerName+ " has been added successfully");
           return;
       }
        System.out.println("Customer already exists " + customerName);
    }

    public void addTransactions(String customerName, double transaction){
        CustomerA findCus = findCustomer(customerName);
        if (findCus !=null){
            findCus.transactions().add(transaction);
        }
        System.out.println("customer not found "+ findCus);
    }

    public void printTransactions(String customerName){
        CustomerA findCus = findCustomer(customerName);

        if(findCus == null){
            System.out.println("customer with transactions not found "+ customerName);
            return;
        }
        for(var tran: findCus.transactions()){
            System.out.println("__".repeat(30));
            System.out.printf("%s%n %10.2f (%s)", findCus.name(),tran, tran<0?"debit":"credit");

        }
    }
}

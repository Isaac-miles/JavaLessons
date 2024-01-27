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
        accessBank.addNewCustomer(Isaac);
        accessBank.addTransactions("Isaac", -10);
        accessBank.printTransactions("Isaac");
    }
}
class Bankk{
    private String name;
    private ArrayList<CustomerA> customers = new ArrayList<>(1000);

    public Bankk(String name){
        this.name = name.toUpperCase();
    }
    private CustomerA findCustomer(String customerName){
        for(var customer:customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }

        return null;
    }
    public void addNewCustomer(CustomerA newCustomer){
        CustomerA findCus = findCustomer(newCustomer.name());
        for(var customer: customers){
            if(findCus == null){
                customers.add(newCustomer);
            }
        }
        System.out.println("Customer already exists " + newCustomer);
    }

    public   void addTransactions(String customerName, double transaction){
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
        }
        for(var tran: findCus.transactions()){
            System.out.println("__".repeat(30));
            System.out.printf("%s%n %10.2f (%s)", findCus.name(),tran, tran<0?"debit":"credit");

        }
    }
}

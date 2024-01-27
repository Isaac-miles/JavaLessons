package dev.zico;

import java.util.ArrayList;

record CustomerA(String name, ArrayList<Double> transactions){
    public CustomerA(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<>(100));
        transactions.add(initialDeposit);
    }
}
public class AutoBoxChallenge {

}

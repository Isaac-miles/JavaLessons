package dev.zico;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    double policyAmount = 100_000_000;
    int beneficiaries = 3;
    float percentageFloat = 1.0f/ beneficiaries;
    double percentage = 1.0/beneficiaries;

        System.out.printf("Payout = %,.2f%n", policyAmount *percentageFloat);
        System.out.printf("Payout = %,.2f%n", policyAmount * percentage);

        double totalUsingFloat = policyAmount-((policyAmount * percentageFloat) * beneficiaries);
        System.out.printf("totalUsingFloat: %,.2f%n", totalUsingFloat);

        double total = policyAmount-((policyAmount * percentage) * beneficiaries);
        System.out.printf("totalUsingFloat: %,.2f%n", total);

//  Big decimal lets you control how numbers are rounded without loosing precisions in calculations

        String[] tests = {"15.456","8","10000.000001",".123"};
        BigDecimal[] bds = new BigDecimal[tests.length];
        Arrays.setAll(bds, i->new BigDecimal(tests[i]));
        System.out.printf("%-14s %-15s %-8s %s%n", "Value", "Unscaled Value", "Scale","Precision");

        for(var bd: bds){
            System.out.printf("%-15s %-15d %-8d %d %n", bd, bd.unscaledValue(),bd.scale(),bd.precision());
        }

        double[] doubles = {15.456,8,10000.000001,.125};
        Arrays.setAll(bds, i-> BigDecimal.valueOf(doubles[i]));
        System.out.println("------------------------------------");
        System.out.printf("%-14s %-15s %-8s  %s%n", "Value", "Unscaled Value", "Scale","Precision");

        for(var bd: bds){
            System.out.printf("%-15s %-15d %-8d %d  %n", bd, bd.unscaledValue(),bd.scale(),bd.precision());
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            System.out.printf("%-15s %-15d %-8d %d  %n", bd, bd.unscaledValue(),bd.scale(),bd.precision());

        }


    }
}

package dev.zico;

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
    }
}

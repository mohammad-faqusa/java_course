package dev.lpa;

public class Main {


    public static void main(String[] args) {

        double policyAmount = 10_000_000;
        int beneficiaries = 3;
        float percentageFloat = 1.0f / beneficiaries;
        double percentage = 1.0/beneficiaries ;

        System.out.printf("Payout = %,.2f%n", policyAmount * percentageFloat);
        System.out.printf("Payout = %,.2f%n", policyAmount * percentage);

        double totalUsingFloat = policyAmount -
                ((policyAmount * percentageFloat) * beneficiaries);
        System.out.printf("totalUsingFloat = %,.2f%n", totalUsingFloat);

        double total = policyAmount -
                ((policyAmount * percentage) * beneficiaries);
        System.out.printf("total = %,.2f%n", total);

        // BigDecimal.valueOf



    }
}

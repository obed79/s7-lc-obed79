package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * the code is calculating the amount that needed to pay the loan with 10% of the remaining balance
     * 
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int months;
        for(months = 3; months > 0; months--){
            amount = (int)(amount * 0.9);
        }

        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}

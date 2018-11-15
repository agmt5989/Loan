/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 3 Sample Development: Loan Calculator  (Step 1)

    File: Step1/Ch3LoanCalculator.java

    Step 1: Input Data Values

*/

import java.util.*;

class Ch3LoanCalculator1 {

    public static void main (String[] args) {
        
        double  loanAmount,
                annualInterestRate;

        int     loanPeriod;

        Scanner scanner = new Scanner(System.in);
        // scanner.useDelimiter(System.getProperty("line.separator"));

        //get input values
        System.out.print("Loan Amount (Dollars+Cents): ");
        loanAmount = scanner.nextDouble();

        System.out.print("Annual Interest Rate (e.g., 9.5): ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Loan Period - # of years: ");
        loanPeriod = scanner.nextInt();

        //echo print the input values
        System.out.println("");
        System.out.println("Loan Amount:          $" + loanAmount);
        System.out.println("Annual Interest Rate:  " + annualInterestRate + "%");
        System.out.println("Loan Period (years):   " + loanPeriod);
   }
}

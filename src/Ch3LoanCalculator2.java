/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 3 Sample Development: Loan Calculator  (Step 2)

    File: Step2/Ch3LoanCalculator.java

    Step 2: Display the Results

*/

import java.util.*;

class Ch3LoanCalculator2 {

    public static void main (String[] args) {
        
        double  loanAmount,
                annualInterestRate;

        double  monthlyPayment,
                totalPayment;
        
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

        //compute the monthly and total payments
        monthlyPayment = 132.15;
        totalPayment  =  15858.10;       
        
        //display the result
        System.out.println("");
        System.out.println("Loan Amount:          $" + loanAmount);
        System.out.println("Annual Interest Rate:  " + annualInterestRate + "%");
        System.out.println("Loan Period (years):   " + loanPeriod);
        
        System.out.println("\n"); //skip two lines
        System.out.println("Monthly payment is    $ " + monthlyPayment);
        System.out.println("  TOTAL payment is    $ " + totalPayment);
   }
}

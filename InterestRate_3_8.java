/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package interestrate_3_8;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


/**
 *
 * @author aramos2027
 */

public class InterestRate_3_8 {
     

    public static void main(String[] args) {
     
     // Finanial aAmount
     Scanner scan = new Scanner(System.in);
     System.out.println("Put your money here!");
     double financialAmount = scan.nextDouble();
     
     // Months needed to repay
     System.out.println("How many months do you have to repay?");
     int payMonths = scan.nextInt();  
     
     // Create the calculator object
     InterestRateCalculator calculator = new InterestRateCalculator();
    
     // Call the method and pass variables into it
     calculator.calculatePayments(financialAmount, payMonths);
    }
}

class InterestRateCalculator {
    public static final double rate = .067;
    // making private variables so it stays encapsulated
     private double principalAmount;
     private int repaymentMonths;
   
    public void calculatePayments(double amount, int months){
        this.principalAmount = amount; 
        this.repaymentMonths = months; 
        
        /* doing the math 
        notes: 
        
        methods can't have modifiers lke private or public inside
        these ones are already hidden. 
        
        */
       
        double monthlyPrincipal = amount / months;
        double monthlyInterest = amount * rate; // Interest is principal times the rate
        double totalMonthlyPayment = monthlyPrincipal + monthlyInterest;
        
        double totalRepaid = totalMonthlyPayment * months;
        // Basically ((amount/months, or how much would pay each month) + (amount*rate, or the rate you have to pay on top each month)) * months, or the # of months you would need to do this for
        
        //Formatting the output to make it look nice and to also pass
        NumberFormat currencyForm = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentForm = NumberFormat.getPercentInstance(Locale.US);

        percentForm.setMinimumFractionDigits(1);
        // I found this from somewhere online, it put everything into a decimal format

        System.out.println("\nLoan Repayment Summary:");
        System.out.println("Principal Amount:     " + currencyForm.format(this.principalAmount));
        System.out.println("Interest Rate:        " + percentForm.format(rate));
        System.out.println("Repayment Term:       " + this.repaymentMonths + " months");
        System.out.println("---------");
        System.out.println("Monthly Payment:      " + currencyForm.format(totalMonthlyPayment));
        System.out.println("Total Amount Repaid:  " + currencyForm.format(totalRepaid));
     
    }
}

    
    
        

 




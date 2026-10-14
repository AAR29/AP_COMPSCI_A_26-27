/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package interestrate_3_8;
import java.util.Scanner;


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

        
    }
}

    
    
        

 




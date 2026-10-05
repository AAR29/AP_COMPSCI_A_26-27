/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberformat_3.pkg5;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * @author aramos2027
 */


public class NumberFormat_35 {

    public static void main(String[] args) {
        int students;
        int numBoys;
        int numGirls;
        Scanner input = new Scanner(System.in);;
        

       
        //ask for the number of students

        System.out.println("please enter the number of students");
        students = input.nextInt();
        System.out.println("please enter the number of boys");
        numBoys = input.nextInt();
        System.out.println("please enter the number of girls");
        numGirls = input.nextInt();
        
//        double boyPercent = (boys/students)*100;
//        double girlPercent = (girls/students)*100;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        
        double girlFraction = (double) numGirls / students;
        double boyFraction = (double) numBoys / students;
        
//Print
        System.out.println("Percentage of girls: " + percentFormat.format(girlFraction));
        System.out.println("Percentage of boys: " + percentFormat.format(boyFraction));
        System.out.println("------------");
  
// Currency: 

 System.out.println("2. Now Enter a dollar amount (e.g., 125.50): ");
        double usdAmount = input.nextDouble();

        // Exchange rates given in problem statement
        double usdToGbpRate = 0.75;
        double usdToEurRate = 0.86;

        // Convert amounts
        double gbpAmount = usdAmount * usdToGbpRate;
        double eurAmount = usdAmount * usdToEurRate;

        // Use DecimalFormat to explicitly set a 2-decimal monetary layout with commas
        DecimalFormat currencyPattern = new DecimalFormat("#,##0.00");

        System.out.println("At an exchange rate of " + usdToGbpRate + " GBP per $1:");
        // Prepending British Pound symbol manually to match requested imports
        System.out.println("Amount in British Pounds: " + currencyPattern.format(gbpAmount));
        
        System.out.println("At an exchange rate of " + usdToEurRate + " EUR per $1:");
        
        // Prepending Euro symbol manually
        System.out.println("Amount in Euros: " + currencyPattern.format(eurAmount));
        System.out.println("------------");


// PI Decimal Formatting
      

        System.out.println("3. Enter an integer from 0 to 15: ");
        int decimalPlaces = input.nextInt();

        // Validate the range (good practice for AP CSA)
        if (decimalPlaces >= 0 && decimalPlaces <= 15) {
            // Create a general number formatter
            NumberFormat piFormat = NumberFormat.getInstance();
            // Set the exact precision requested
            piFormat.setMinimumFractionDigits(decimalPlaces);
            piFormat.setMaximumFractionDigits(decimalPlaces);

            System.out.println("Pi formatted to " + decimalPlaces + " decimal places: " 
                               + piFormat.format(Math.PI));
        } else {
            System.out.println("Error: Number must be between 0 and 15.");
        }
        System.out.println("------------");



//Random Decimal Generator

        
        // Boundaries definition: 999e18 maps directly to primitive double values
        double min = 100000000.0;
        double max = 999e18; // 999 * 10^18

        // Generate a random decimal using Math.random() to avoid extra imports
        double randomValue = min + (max - min) * Math.random();

        // Using DecimalFormat to force regular decimal representation without standard scientific E notation
        DecimalFormat noScientific = new DecimalFormat("0.0000");

        System.out.println("4. Generated Random Decimal: " + noScientific.format(randomValue));
        
        input.close();
    }

    
}

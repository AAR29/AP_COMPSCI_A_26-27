package cashtestrig;

import javax.swing.JOptionPane; // Replaced Scanner with JOptionPane

/**
 * @author aramos2027
 */
public class CashTestRig {

    public static void main(String[] args) {
        // 1. Ask the user for input using a visual dialog box
        String inputStr = JOptionPane.showInputDialog(null, "Put your money here!", "Cash Test Rig", JOptionPane.QUESTION_MESSAGE);
        /*
        null 
            where the pop-up pops out
            
        
        JOptionPane.QUESTION_MESSAGE = the green qestion box on the side
        
        */
        
        
        
        
        // Handle case where user clicks "Cancel" or closes the window
        if (inputStr == null) {
            System.exit(0);
        }

        // 2. Convert the text input into a double
        double inputPay = Double.parseDouble(inputStr);
            /* Double.parseDouble(inputStr); parses it
        parse: turn the string into a number 
        
             */

        // 3. super cool old code
        int totalCents = (int) (inputPay * 100 + 0.5);

        int tenDollar = totalCents / 1000;
        totalCents %= 1000;
        int fiveDollar = totalCents / 500;
        totalCents %= 500;
        int oneDollar = totalCents / 100;
        totalCents %= 100;
        int quarters = totalCents / 25;
        totalCents %= 25;
        int dimes = totalCents / 10;
        totalCents %= 10;
        int nickels = totalCents / 5;
        totalCents %= 5;
        int pennies = totalCents; 

        // 4. Build a single formatted string for the visual output
        String resultMessage = "Your change breakdown:\n\n"
                + "Ten dollar bills: " + tenDollar + "\n"
                + "Five dollar bills: " + fiveDollar + "\n"
                + "One dollar bills: " + oneDollar + "\n"
                + "Quarters: " + quarters + "\n"
                + "Dimes: " + dimes + "\n"
                + "Nickels: " + nickels + "\n"
                + "Pennies: " + pennies;

        // 5. Output results to the user in a message dialog box
        JOptionPane.showMessageDialog(null, resultMessage, "Change Calculator Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

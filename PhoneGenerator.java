/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package phonegenerator;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * Part 1 - Phone Number Generator

Plan and write a program that generates random phone numbers in the pattern 
* XXX-XXX-XXXX. Include the dashes in the output.

Do not let the first 3 digits contain the numbers 8 or 9 
* (but don't be any more restrictive than that).

Make sure the second set of 3 digits does not go higher than 655 
(so 000 to 655 OK, 656 not OK).

Recall that all 3 sets can have the digit 0 anywhere in the set 
(so 071-010-0210 is fine).

Think through the easiest way to construct the phone number. 
* Each of the 10 digits does not have to be determined individually.

For a bonus point, place it inside a loop, 
* and when the user presses the letter "p", it will generate a new one.

Part 2 - 6 sided Die generator

Plan and write a program that randomly generates an integer from 1 to 6.

for a bonus point, put it inside a loop, 
* and each time the user types the letter "r", it "rolls the dice" and 
* generates another random number, from 1 to 6.

Keep the die generator in mind, as it will come into use in the next unit.
 */
public class PhoneGenerator {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String p = "p";
//Declare random number generator
        Random rand = new Random();
        while(!p.equals("stop")){
            System.out.println("Press any letter. type \"stop\" to stop");
            p=scan.next();
            //first 3 digits: 
        
            int d1 = rand.nextInt(8); //0-7, no 8 or 9
            int d2 = rand.nextInt(8);
            int d3 = rand.nextInt(8);

            String firstSet = "" + d1+d2+d3;
            
            //next 3
            int secondSample = rand.nextInt(656);
            DecimalFormat df = new DecimalFormat("000");
            String s3 = df.format(secondSample);
            
                    
            //final 3
            int finalSample = rand.nextInt(10000);
            DecimalFormat dg = new DecimalFormat("0000");
            String f4 = dg.format(finalSample);

        
        //dispense numberslop
        System.out.println("" + firstSet + "-" + s3 + "-" + f4);
        }
        

        
    }
    
}

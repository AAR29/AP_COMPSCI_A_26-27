/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package phonegenerator;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
 Part 1 - Phone Number Generator
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
            DecimalFormat df = new DecimalFormat("000"); //making a decimal format variable 
            String s3 = df.format(secondSample);
            /*
            Decimal format is a package where we can reformat our numbers
            000 ensures there is always a 0 at the beginning in absence of a hundreds/tens place
            */
            
                    
            //final 3
            int finalSample = rand.nextInt(10000); //final number 9999
            DecimalFormat dg = new DecimalFormat("0000");
            String f4 = dg.format(finalSample);

        
        //dispense numberslop
        System.out.println("" + firstSet + "-" + s3 + "-" + f4);
        }
        

        
    }
    
}

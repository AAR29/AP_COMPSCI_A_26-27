/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package mathformula;
import java.util.Random;
import java.util.Scanner;

/*
Write a program that generates a random number in the range 0 to 90 inclusive. 
Using the Math class, display the sine, cosine and tangent for that number, 
rounded to 3 decimal places

in the format: "Number: 45 Sine: 0.851 Cosine: 0.525 Tangent: 1.620"
*/

public class MathFormula {


    public static void main(String[] args) {
        // TODO code application logic here
//         Scanner scan = new Scanner(System.in);
//Declare random number generator
        Random rand = new Random();
        int circleAngle = rand.nextInt(91);
        double sinAngle = 6;
        double cosAngle = 6;
        double tanAngle = 6;
        System.out.println ("Your angle: " + circleAngle);
        System.out.println (" ");
        System.out.println ("Your Trigonometry: ");
        System.out.println("Sine: /d/nCosine: %d%nTangent: %d%n", sinAngle, cosAngle, tanAngle);
        
        
        
    }
       


/*Generate another random real number, 
value 1.0 to 20.0, to generate the radius of a circle. 
Use  the MathClass to calculate the  area of that circle, 
as well as the volume of a sphere of that radius, 
all rounded to 3 decimal places.

Generate a random real number in the range 100,000,000.0 to 100,000,000,000.0, 
and using the Math Class, display that number, 
it's square root, as well as it'snatural logarithm and it's Log10 values, 
all rounded to 5 decimal places.
Using the high real number value just generated, 
calculate the Mass required (in Grams) to generate that much energy in joules. 
(E = mc ^2). Hint, if speed of light (c) is in m/s, the mass will be in grams - 
so assume your large number is in joules (j). Look up the value of c in m/s. 
Use the "roundAvoid" method to output this number 
to a user defined number of decimal places.
Use a scanner to get a real number value and an integer input by the user. 
Output the value to the power of the integer, using the Math Class methods, 
again rounded to a user input number of decimal places.

 */

    
}

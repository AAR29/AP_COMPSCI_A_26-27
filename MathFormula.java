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


    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    
     public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);   
        // Trig Formulas
        int angleDegree = rand.nextInt(91); 
        // Math. trig functions require radians, NOT degrees
        double radians = Math.toRadians(angleDegree); 
            //toRadians = 

        double sine = roundAvoid(Math.sin(radians), 3);
        double cosine = roundAvoid(Math.cos(radians), 3);
        double tangent = roundAvoid(Math.tan(radians), 3);

        System.out.printf("Number: %d Sine: %.3f %nCosine: %.3f %nTangent: %.3f%n", 
                angleDegree, sine, cosine, tangent);
        /*
        System.out.printf is used to call the formatting
        %d is a decimal integer 
        %.3f is 3 decimal places
        this is just for this problem, I didn't do this afterwards 
        after different instructions
        */ 
        
        System.out.println("-------");
        
        // 2. Circle Radius
        double radius = 1.0 + (rand.nextDouble(19));
        //it can't be over 20 units, ince you're adding 1 you need yo make it -1
        // 20 (0-19) > 21 (0-20) > (sice you're adding 1) 19 (1-20) 
        
        
        double area = Math.PI * Math.pow(radius, 2);
        //squares the radius
        
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        //calcs V
        
        
        //Printing!
        System.out.print("Radius:" + roundAvoid(radius,3));
        System.out.print("Area:" + roundAvoid(area, 3));
        System.out.print("Volume:" + roundAvoid(volume,3));
        
        System.out.println("-------");
        
        //3. large number
         double minLarge = 100000000.0;
         double maxLarge = 100000000000.0;
         double largeNum = minLarge + (rand.nextDouble() * (maxLarge - minLarge));
        //rand.nextDouble() on its own generates a # between 0-1 (not including 1)
        //the range is multiplied so we get a bigger value 
         double sqrtVal = Math.sqrt(largeNum);
         double lnVal = Math.log(largeNum);
         double log10Val = Math.log10(largeNum);

         System.out.println("Large Number: " + roundAvoid(largeNum, 5));
         System.out.println("Square Root: " + roundAvoid(sqrtVal, 5));
         System.out.println("Natural Log (ln): " + roundAvoid(lnVal, 5));
         System.out.println("Log10: " + roundAvoid(log10Val, 5));
         
         //4. E = m c^2
         double c = 299792458.0; 
         double massInGrams = (largeNum / Math.pow(c, 2)) * 1000.0;

         System.out.print("Enter the number of decimal places to round the Mass calculation: ");
         int massDecimals = scanner.nextInt();
        
         System.out.println("Mass required to generate energy (in Grams): " + roundAvoid(massInGrams, massDecimals));
       
         System.out.println("-------");

        //5. Scanner
         System.out.print("Enter a real number (double base value): ");
        double userBase = scanner.nextDouble();
        
        System.out.print("Enter an integer exponent: ");
        int userExponent = scanner.nextInt();
        
        System.out.print("Enter the number of decimal places for this result: ");
        int powerDecimals = scanner.nextInt();

        double powerResult = Math.pow(userBase, userExponent);
        
        System.out.println("Result (" + userBase + " to the power of " + userExponent + "): " + roundAvoid(powerResult, powerDecimals));
        
        scanner.close();
     
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boolean_expressions_4_1;
import java.util.Scanner;


/* 
 @author aramos2027
 */
public class Boolean_Expressions_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        
        //making a new scanner: 
        Scanner scan = new Scanner(System.in);
        
        //default is false
        boolean leapYear = false; 
        
        // Asking for year: 
        System.out.println("Insert a year below!");
        int newYear = scan.nextInt();
        if (newYear >= 1582) {
        System.out.println("--------------------");
        System.out.println("The Year " + newYear + " is: \n");


        // Divisible by 4 = newYear is a Leap Year
        if (newYear % 4 == 0) {
            leapYear = true;
            System.out.println("Divisible by 4: True!");
            System.out.println("It Might Be A Happy Leap Year!");
            System.out.println("--------------------");
        }else{
            leapYear = false; 
            System.out.println("Divisible by 4: False.");
            System.out.println("--------------------");
        }
        if (!(newYear % 100 == 0)) {
            leapYear = false; 
            System.out.println("Divisible by 100: False!");
            System.out.println("Happy Leap Year!");
            System.out.println("--------------------");
        }else{
        if (newYear % 100 == 0 && !(newYear % 400 == 0)) {
             leapYear = false; 
             System.out.println("Divisible by 100: True!");
             System.out.println("Divisible by 400: False.");
             System.out.println("--------------------");
        }else{
            if (newYear % 100 == 0 && (newYear % 400 == 0)){
             leapYear = true; 
             System.out.println("Divisible by 100: True!");
             System.out.println("Divisible by 400: True!");
             System.out.println("Happy Leap Year!");
             System.out.println("--------------------");
            }else{
                System.out.println("Divisible by 100: False.");
                System.out.println("Divisible by 400: False.");
                System.out.println("--------------------");
            }
        }
        }
        }else{
            leapYear = false;
            System.out.println("""
                               --------------------
                               Error:
                               
                               Any input value less than 1582
                               (the year the Gregorian calendar was adopted)
                               is invalid
                               --------------------
                               """);
        }
    }

    
}

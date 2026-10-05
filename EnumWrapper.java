/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumwrapper;
import java.util.Scanner;
/**
 *
 * @author aramos2027
 */
public class EnumWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     enum Day {
         Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
     System.out.println("------");
     System.out.println("The days of the week:");
     for (Day day : Day.values()){
         //the enum Day now has a loal variable called "day" with all the day values inside
         System.out.println(day);
         
     }
     System.out.println("------");
     enum Month {
         January, February, March, April, May, June, July, August, September, October, November, December}
     Month month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12;
     
     //month varables
              month1 = Month.January;
        month2 = Month.February;
        month3 = Month.March;
        month4 = Month.April;
        month5 = Month.May;
        month6 = Month.June;
        month7 = Month.July;
        month8 = Month.August;
        month9 = Month.September;
        month10 = Month.October;
        month11 = Month.November;
        month12 = Month.December;
        
        Month[] allMonths = {
         month1, month2, month3, month4, month5, month6, 
         month7, month8, month9, month10, month11, month12
        };

        // Printing each month with its 1-12 number
        System.out.println("------");
        for (Month m : allMonths) {
            System.out.println("");
            System.out.println("Month name: " + m);
            // ordinal() starts at 0, so add 1 to get 1-12
            System.out.println("Month number: " + (m.ordinal() + 1));

        }
        System.out.println("------");
        System.out.println("------");
        Scanner scanner = new Scanner(System.in);
        
        
        // Prompt the user for their username
        System.out.print("Enter your CCHS username (e.g., aramos2027): ");
        String username = scanner.nextLine();

        // Extract the last 4 characters representing the graduation year
        // length() - 4 gives the starting index of the year
        String yearString = username.substring(username.length() - 4);

        // Parse the string into an int value using the Integer wrapper class
        int gradYear = Integer.parseInt(yearString);

        // Calculate the year after graduation
        int yearAfter = gradYear + 1;

        // Convert the graduation year into its binary string representation
        String binaryYear = Integer.toBinaryString(gradYear);

        // Print the requested information
        System.out.println("Your graduation year is: " + gradYear);
        System.out.println("The year after your graduation will be: " + yearAfter);
        System.out.println("In computer language, you graduate in: " + binaryYear);

        // Close the scanner resource
        scanner.close();
     
     }
    
    
    
    
}

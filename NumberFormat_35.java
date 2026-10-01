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
        double students;
        double boys;
        double girls;
        Scanner scan = new Scanner(System.in);
        

       
        //ask for the number of students

        System.out.println("please enter the number of students");
        students = scan.nextDouble();
        System.out.println("please enter the number of boys");
        boys = scan.nextDouble();
        System.out.println("please enter the number of girls");
        girls = scan.nextDouble();
        
//        double boyPercent = (boys/students)*100;
//        double girlPercent = (girls/students)*100;
        NumberFormat  girlPercent = 
        
        //Print
        System.out.println("boy %:  " + boyPercent);
        System.out.println("girl %:  " + girlPercent);
        
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

//        java.text.DecimalFormat df = ; 
//            new java.text.DecimalFormat("%");
//            System.out.println(df.format(percentage));
    }
    
}

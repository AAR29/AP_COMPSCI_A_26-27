/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppinglist;
import java.util.Scanner;
import java.text.NumberFormat;

//@author aramos2027

public class ShoppingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //opening scanner
        Scanner scanner = new Scanner(System.in);
        
        //Item List
        System.out.println("""
                           ====== Welcome to Aini's Items! ======
                           
                           Here are our selections for today:
                           
                           1. Bread (sourdough)
                           \t ($2.50 each)
                           2. Milk (whole)
                           \t ($4.00 each)
                           3. Milk (fat free)
                           \t ($3.00 each)
                           4. Water (purified)
                           \t ($0.01 /gallon)
                           5. Batteries (alkaline, pack of 20) 
                           \t ($12.99 each)
                           6. Cookies (chocolate chip)
                           \t ($2.50 each)
                           7. Mysterious 7th Thing (very scary)
                           \t ($19.98, 1 max)
                           
                           ======================================
                           """);
        
        
        //Asking for name and price
        System.out.println("What is the name of the item?");
        String scanItem = scanner.nextLine();
        System.out.println("What is the price of the item?");
        String scanPrice = scanner.nextLine();
    }
    
}
//class shoppingList {
//    private String courseTitle;
//    private double itemPrice;
//    
//    double itemPrice = double truePrice;
//}
//
//if (!(scanPrice==truePrice)){
//     System.out.println("Silly! the Price is " + itemPrice);
//}
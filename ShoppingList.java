/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppinglist;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

//@author aramos2027

public class ShoppingList {

   static class Item { // calling out our items
    private String name;
    private double price;
    
    // Constructor: 
        
    public Item(String name, double price){ //note to self, public and private is lowercase.
        this.name = name; 
        this.price = price;
    }
    
    //Getter methods:
    
    public String getName() {
       return name; 
    }
    public double getPrice() {
       return price; 
    }
    
    //toString to print item
    @Override
    public String toString(){
        return name + " - $" + price;
    }
}

    public static void main(String[] args) {

        
        //opening scanner
        Scanner scanner = new Scanner(System.in);
        
        // Array List!
        ArrayList<Item> list = new ArrayList<>();
        
        // collecting the items from a loop 
        
        // boolean + while = goes until false
        boolean adding = true; 
        while (adding){ 
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
                 String name = scanner.nextLine();
                 System.out.println("What is the price of the item?");
                 double price = scanner.nextDouble();
                 scanner.nextLine();
                 
                 // checking price matching menu options
                 double correctPrice = -1.0;
                 
                 if (name.equalsIgnoreCase("Bread (sourdough)") || name.equalsIgnoreCase("Bread")) {
                     correctPrice = 2.50;
                 } else if (name.equalsIgnoreCase("Milk (whole)") || name.equalsIgnoreCase("Whole Milk")) {
                     correctPrice = 4.00;
                 } else if (name.equalsIgnoreCase("Milk (fat free)") || name.equalsIgnoreCase("Fat Free Milk")) {
                     correctPrice = 3.00;
                 } else if (name.equalsIgnoreCase("Water (purified)") || name.equalsIgnoreCase("Water")) {
                     correctPrice = 0.01;
                 } else if (name.equalsIgnoreCase("Batteries (alkaline, pack of 20)") || name.equalsIgnoreCase("Batteries")) {
                     correctPrice = 12.99;
                 } else if (name.equalsIgnoreCase("Cookies (chocolate chip)") || name.equalsIgnoreCase("Cookies")) {
                     correctPrice = 2.50;
                 } else if (name.equalsIgnoreCase("Mysterious 7th Thing (very scary)") || name.equalsIgnoreCase("Mysterious 7th Thing")) {
                     correctPrice = 19.98;
                 }
                 
                 // checking if price matches menu price
                 if (correctPrice == -1.0) {
                     System.out.println("Error: Item not recognized on menu!");
                 } else if (Math.abs(price - correctPrice) > 0.001) { // checking double price match
                     System.out.println("Silly! The price of " + name + " is $" + String.format("%.2f", correctPrice) + ". Item not added.");
                 } else {
                     // price matches! making a new item & adding to list
                     Item newItem = new Item(name, price);
                     list.add(newItem);
                     System.out.println(name + " added to your list!");
                 }
                 
                 //Asking if they have more items: 
                 System.out.println("\nDo you want to add another item? (yes/no)");
                 String response = scanner.nextLine();
                 
                 //cancel via setting boolean to false
                 if (response.equalsIgnoreCase("no")) {
                     adding = false;
                 }
               
     }
     

    // Shopping list 
     System.out.println("\nYour Shopping List:");
     double total = 0.0; 
     
     //looping to display list and total
     for (int i = 0; i < list.size(); i++) {
         Item currentItem = list.get(i);
         System.out.println((i + 1) + ". " + currentItem.toString());
         total += currentItem.getPrice();
     }
     System.out.println("Total Cost: $" + String.format("%.2f", total));
     
     
     //Asking user to remove item if list is not empty: 
     if (!list.isEmpty()) {
         System.out.println("""
                            ================================================
                            At Aini's Items, we are economical. 
                            You have to remove 1 item from your list. 
                            
                            Enter the number of the item you want to remove:
                            """);
         int removeNum = scanner.nextInt();
         scanner.nextLine();
         
         //subtracting 1 to get correct ArrayList index
         int removeIndex = removeNum - 1;
         
         if (removeIndex >= 0 && removeIndex < list.size()) {
             //removing item from list
             list.remove(removeIndex);
         } else {
             System.out.println("Invalid item number!");
         }
     }
     
     
     // Redisplay updated shopping list
     System.out.println("\nUpdated Shopping List:");
     double newTotal = 0.0;
     
     //looping again to display new list and new total
     for (int i = 0; i < list.size(); i++) {
         Item currentItem = list.get(i);
         System.out.println((i + 1) + ". " + currentItem.toString());
         newTotal += currentItem.getPrice();
     }
     System.out.println("New Total Cost: $" + String.format("%.2f", newTotal));
     
    }
    
}
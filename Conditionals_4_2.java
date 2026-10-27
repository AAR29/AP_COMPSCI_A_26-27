/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionals_4_2;

import java.util.Scanner;

public class Conditionals_4_2 {
    public static void main(String[] args) {
        // Instantiate and start your store program
        MyStore store = new MyStore();
        store.run();
    }
}

class MyStore {
    // 1. Declare constant
    private final double MAX_BUDGET = 250.00;

    public void run() {
        // Create each Item object individually using accessors/mutators
        Item tShirt = new Item("T Shirt", 29.99);
        Item shoes  = new Item("Shoes", 125.99);
        Item jeans  = new Item("Jeans", 60.99);
        Item jacket = new Item("Jacket", 250.00);
        Item hat    = new Item("Hat", 25.99);
        Item shorts = new Item("Shorts", 75.99);
        Item blouse = new Item("Blouse", 88.99);

        // Track purchase progress inside run()
        double totalSpent = 0.0;
        int itemCount = 0;

        // Set up Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to MyStore ===");
        System.out.println("Budget Limit: $" + MAX_BUDGET);

        // 4. Start while(true) loop
        while (true) {
            System.out.print("\nEnter item name (or type 'exit' to quit): ");
            String inputName = scanner.nextLine().trim();
            //trim >>> disregards white space/spaces

            // Check exit condition
            if (inputName.equalsIgnoreCase("exit")) { //equals ignore upper/lower-case >>> 
                System.out.println("""
                                    _______________________
                                    
                                    Thank you for shopping!
                                    Bye Bye!
                                    _______________________
                                    """);
                break; // Exit the loop
            }

            // Match input to an Item object using getters
            Item selectedItem = null;
            if (inputName.equalsIgnoreCase(tShirt.getStrName())) {
                selectedItem = tShirt;
            } else if (inputName.equalsIgnoreCase(shoes.getStrName())) {
                selectedItem = shoes;
            } else if (inputName.equalsIgnoreCase(jeans.getStrName())) {
                selectedItem = jeans;
            } else if (inputName.equalsIgnoreCase(jacket.getStrName())) {
                selectedItem = jacket;
            } else if (inputName.equalsIgnoreCase(hat.getStrName())) {
                selectedItem = hat;
            } else if (inputName.equalsIgnoreCase(shorts.getStrName())) {
                selectedItem = shorts;
            } else if (inputName.equalsIgnoreCase(blouse.getStrName())) {
                selectedItem = blouse;
            }

            // Process purchase with budget check
            if (selectedItem != null) {
                double price = selectedItem.getDblPrice();

                if (totalSpent + price <= MAX_BUDGET) {
                    totalSpent += price;
                    itemCount++;

                    // Print item info via toString()
                    System.out.println("Added: " + selectedItem.toString());
                    System.out.println("Items bought: " + itemCount + " | Total spent: $" + totalSpent);
                } else {
                    System.out.println("WARNING: Adding " + selectedItem.getStrName() 
                        + " ($" + price + ") exceeds your $" + MAX_BUDGET + " budget! Current spent: $" + totalSpent);
                }
            } else {
                System.out.println("Item '" + inputName + "' is not in the store catalog. Try again.");
            }
        }

        scanner.close();
    } // End of run() method
} // End of MyStore class

class Item {
    private String strName;
    private double dblPrice;

    // Default Constructor
    public Item() {
        this.strName = "";
        this.dblPrice = 0.0;
    }

    // Parameterized Constructor
    public Item(String strName, double dblPrice) {
        this.strName = strName;
        this.dblPrice = dblPrice;
    }

    // Accessors (Getters)
    public String getStrName() {
        return strName;
    }

    public double getDblPrice() {
        return dblPrice;
    }

    // Mutators (Setters)
    public void setStrName(String strName) {
        this.strName = strName;
    }

    public void setDblPrice(double dblPrice) {
        this.dblPrice = dblPrice;
    }

    // toString method
    @Override
    public String toString() {
        return "Item: " + strName + ", Price: " + dblPrice;
    }
}
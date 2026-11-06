/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_6_doforloops;

//black box printer class for star patterns.
class StarPrinter {
    private int maxRows;

    // Constructor to initialize maxRows (defaults to 10 if not specified)
    public StarPrinter(int maxRows) {
        this.maxRows = maxRows;
    }

    //Prints SMP: an increasing triangle of stars.

    public void printPatternSMP() {
        System.out.println("SAMPLE: NOT GRADED");
        for (int row = 1; row <= maxRows; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //Prints pattern A: a decreasing triangle of stars.

    public void printPatternA() {
        System.out.println("a.");
        for (int row = 1; row <= maxRows; row++) {
            for (int star = maxRows; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printPatternB() {
        System.out.println("b.");
        for (int row = 1; row <= maxRows; row++) {
            for (int spaces = 1; spaces <= maxRows - row; spaces++) { //
                System.out.print(" ");
            
            }
            
            for (int stars = 1; stars <= row; stars++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    
    public void printPatternC() {
        
        System.out.println("c.");
        for (int row = 1; row <= maxRows; row++) {
            for (int stars = maxRows; stars >= maxRows; stars--){
                System.out.print("*");
            }
            for (int spaces = 10; spaces >= maxRows - row; spaces++) { //
                System.out.print(" ");
            
            }
            

            
            System.out.println();
        }    
    }
    
    public void printPatternD() {
        //
    }
    
} //end of printer

public class Main {

    public static void main(String[] args) {
        // Instantiate the black box class
        StarPrinter printer = new StarPrinter(10);
        
        boolean active = true;
        int executionCount = 0;

        // Controlled while (active) loop
        while (active) {
            printer.printPatternSMP();
            printer.printPatternA();
            printer.printPatternB();
            printer.printPatternC();
//            printer.printPatternD();

            executionCount++;

            // active >>> false after 1 run 
            // no more loop
            if (executionCount >= 1) {
                active = false;
            }
        }
    }
}

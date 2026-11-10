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
            
            //new row: 
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
    
    //Prints pattern B: increasing right-aligned trangle of stars
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
    
    //Prints pattern C: decreasing right-aligned trangle of stars
    public void printPatternC() {
        
        System.out.println("c.");
        for (int row = 1; row <= maxRows; row++) {
            for (int spaces = 1; spaces <= row - 1; spaces++) { /* 
                why if i do 
                int spaces = 0; spaces < row; spaces++
                it makes 1 space at the begining
                
                
                ANSWER: 
                
                0 < 1 is TRUE, so it will print the space
                if spaces is equal to 1, it wil e less than rows - 1
                rows - 1 in the first iteration is 0
                    row 1 set to FALSE
                */
                System.out.print(" ");
            }      
            for (int stars = maxRows; stars >= row; stars--){
                System.out.print("*");
            }
            
            System.out.println();
        }    
    }
    
    //Prints pattern D: diamond
    public void printPatternD() {
        System.out.println("d.");
        int halfRows = maxRows/2; // = 5
        
        // TOP HALF
        for (int row = 1; row <= halfRows; row++) {
                // 1. Spaces: count UP from 1 to (halfRows - row)
                for (int spaces = 1; spaces <= halfRows - row; spaces++) {
                    System.out.print(" ");
                }

                // stars 1, 3, 5, 7, 9 >>> (2 * row - 1)
                for (int stars = 1; stars <= (2 * row) - 1; stars++) {
                    System.out.print("*");
                }

                // new row
                System.out.println(); 
            }

        
        // BOTTOM HALF: both spaces and stars decrease
            
            for (int row = 1; row <= halfRows; row++) { // row value resets to 1
            
                // spaces increase by 1: 0, 1, 2, 3, 4 >>> (row - 1)
                for (int spaces = 1; spaces <= row - 1; spaces++) {
                    System.out.print(" ");
                }

                // stars decrease by 2: 9, 7, 5, 3, 1
                int starCount = 2 * (halfRows - row + 1) - 1;
                // 2 * (halfRows - row + 1) - 1
                    // 
                for (int stars = 1; stars <= starCount; stars++) {
                    System.out.print("*");
                }

                System.out.println();
            } 
        
    }
    //no need for a new line
    
} //end of printer

public class U4_6_doforloops {

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
            printer.printPatternD();

            executionCount++;

            // active >>> false after 1 run 
            // no more loop
            if (executionCount >= 1) {
                active = false;
            }
        }
    }
}

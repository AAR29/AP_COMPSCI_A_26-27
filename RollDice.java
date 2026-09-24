/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rolldice;
import java.util.Random;
import java.util.Scanner;

/*

Part 2 - 6 sided Die generator

Plan and write a program that randomly generates an integer from 1 to 6.

for a bonus point, put it inside a loop, 
and each time the user types the letter "r", it "rolls the dice" and generates another random number, from 1 to 6.

Keep the die generator in mind, as it will come into use in the next unit.
 */

/**
 *
 * @author aramos2027
 */
public class RollDice {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String r = "r";
//Declare random number generator
        Random rand = new Random();
        while(r.equals("r")){
            System.out.println("Press \"r\" for a phone number. type anything else to stop");
            r=scan.next();
            int diceRoll = rand.nextInt(6)+1;
            System.out.println ("Your dice rolled " + diceRoll);
        
        
    }
    
    }
}

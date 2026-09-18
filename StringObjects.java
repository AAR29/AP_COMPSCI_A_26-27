/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringobjects;

/**
 *
 * @author aramos2027
 */
public class StringObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = ("Aini Ramos");
        //new string object
        
        System.out.println ("My name is " + name);
        // printing name 
        System.out.println ("My name length has " + name.length() + " characters");
        // a space counts as a character!!!
        
        
        //Printing in uppercase, lowercase
        
        System.out.println ("My name in lowercase is " + name.toUpperCase());
        System.out.println ("My name in lowercase is " + name.toLowerCase());
        
        // First, Last letter
        System.out.println("The first letter in my name is " + name.charAt(0));
        System.out.println("The last letter in my name is " + name.charAt (name.length() - 1));
        
       System.out.println("The index of the space between the names is " + name.indexOf(' ')); 

    }
    
}

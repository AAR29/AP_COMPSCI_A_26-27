/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anatofclass_3.pkg7;

/*
    @author aramos2027
 */
public class AnatOfClass_37 {
/*
    Answer the following questions:

What is the difference between a class and an object?

    A class serves as a blueprint for the program, whilst objects are created 
    (in class = instance) and altered in that blueprint to do certain functions
What happens when you pass an object to a print or println method?

    A println method generates the next action on the next line, while the print method runs the next action on the same line
What is the scope of a variable in a method? In a class?

    A scope is the areas where data can be referenced

    In a class, a variable is applicable anywhere in the code. 
    In a method, the variable is applicable from the declared line onwards 
    (until the curly brace of the method/block it’s in). 

Carry out the following programming project.
*/

    // inner class Car
    public static class Car {   
        private String carBrand = ""; 
        private int enginePower; // Print out with "horse power @ end 
        private double maxSpeed; // print in MPH
        private double price; // print in $
        
        // "public X" makes a Constructor called "X"
        // these are the "defaults"
        public Car() {
             this.carBrand = "Unknown Brand";
             this.enginePower = 0;
             this.maxSpeed = 0.0;
             this.price = 0.0;
        }
    
        // Getters and Setters
        public String getCarBrand() {
            return carBrand;
            // return = gives out result
        }
        
        public void setCarBrand(String carBrand) {
            this.carBrand = carBrand;
        }
                //  void = it just updaes the memory and does nothing with it (doesn't make it a string, etc.)
                //  setCarBrand : this is just the name of the method to call for later
                // (String carBrand) it turns the String that's handed over and will be temporarily called "carBrand"
        
        public int getEnginePower() {
            return enginePower;
        }
        
        public void setEnginePower(int enginePower){
            this.enginePower = enginePower;
        }
        
        public double getMaxSpeed() {
            return maxSpeed;
        }
        
        public void setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "Brand: " + carBrand + "\n" +
                   "Engine Power: " + enginePower + " horse power\n" +
                   "Max Speed: " + maxSpeed + " MPH\n" +
                   "Price: $" + String.format("%,.2f", price) + "\n" +
                   "-----------------------------";
        } // Closed toString
    } // Closed Car class

    // This is the actual entry point for your NetBeans project
    public static void main(String[] args) {
        // making a new car
        Car debugCar = new Car();
       
        System.out.println("...Debugging Base Car...");
        System.out.println("-------------------------");
         System.out.println();
                 
        System.out.println(debugCar);
        System.out.println("");
        
        // --- Driver method to create the specific car types ---
        System.out.println("Specific Car Types");

        // 1. VW Bug
        Car vwBug = new Car();
        vwBug.setCarBrand("VW Bug");
        vwBug.setEnginePower(40);
        vwBug.setMaxSpeed(75.0);
        vwBug.setPrice(18000.0);
        System.out.println(vwBug);

        // 2. Toyota Prius
        Car prius = new Car();
        prius.setCarBrand("Toyota Prius");
        prius.setEnginePower(121);
        prius.setMaxSpeed(112.0);
        prius.setPrice(28000.0);
        System.out.println(prius);

        // 3. BMW i8
        Car bmwI8 = new Car();
        bmwI8.setCarBrand("BMW i8");
        bmwI8.setEnginePower(369);
        bmwI8.setMaxSpeed(155.0);
        bmwI8.setPrice(147500.0);
        System.out.println(bmwI8);

        // 4. Tesla Model 3
        Car teslaModel3 = new Car();
        teslaModel3.setCarBrand("Tesla Model 3");
        teslaModel3.setEnginePower(283);
        teslaModel3.setMaxSpeed(140.0);
        teslaModel3.setPrice(40000.0);
        System.out.println(teslaModel3);
    } // Closed main method
} // Closed AnatOfClass_37 class

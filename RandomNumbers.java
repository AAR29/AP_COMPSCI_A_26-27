/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {
/**
* @param args the command line arguments
*/
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
String p = "p";
//Declare random number generator
Random generator = new Random();
while(!p.equals("-1")){
System.out.println("Press any letter. enter -1 to stop");
p = scan.next();
int num1;
float num2;
//random integer from 0 - 54
num1 = generator.nextInt(55);
System.out.println("A random integer from 0 to 54: " + num1);
//random int from 0 to 9
num1 = generator.nextInt(10);
System.out.println("From 0 to 9: " + num1);
//random int from 1 to 10
num1 = generator.nextInt(10) + 1;
System.out.println("From 1 to 10: " + num1);
//random int from 20 to 34
num1 = generator.nextInt(15) + 20;
System.out.println("From 20 to 34: " + num1);
//random int from -10 to +9
num1 = generator.nextInt(20) - 10;
System.out.println("From -10 to 9: " + num1);
//random float from 0 to 1
num2 = generator.nextFloat();
System.out.println("A random float (between 0-1): " + num2);
}
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaygraphics;

// @author aramos2027
import java.awt.*;
import javax.swing.*;

public class DisplayGraphics extends JPanel{

//this is a constructor method.
public DisplayGraphics(){
        super();
    }
//my hex codes!
 Color color1 = Color.decode("#d4cebe");
    //table color
 Color color2 = Color.decode("#a4ebed");
 //

/* Create a paintComponent() method to override the one in
JPanel.This is where the drawing happens. We don't have
to call it in our program, it gets called automatically
whenever the panel needs to be redrawn, like when it is
made visible or moved or whatever.
*/
 
     @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Good practice to call super
 
final int MID = 150;
final int TOP = 50;

g.setColor(color2); 
//set the graphics object's paint color
//for next action
g.fillRect(0, 175, 400, 300); // ground
g.setColor(color1); //restting paint color
g.fillRect(0, 175, 300, 50); // ground
g.setColor(Color.black); //restting paint color
g.fillRect(MID-50, TOP+115, MID-100, 80); // body
g.setColor(Color.black); //resetting paint color
g.fillOval(MID-50, TOP+60, MID-100, TOP-10);// head

g.setColor(Color.GREEN);
g.fillPolygon(new int[] {175, 220, 275}, new int[] {200, 20, 200}, 3);
}
/**
* @param args the command line arguments
*/
public static void main(String arg[]){
//create a new JFrame object, initialize
JFrame frame = new JFrame("Display Graphics");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
// Create a new identifier for a Basic JPanel (DisplayGraphics) called "panel",
// then create a new BasicJPanel object for it to refer to.
DisplayGraphics panel = new DisplayGraphics();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
frame.setContentPane(panel);
frame.setVisible(true);
}
}
    


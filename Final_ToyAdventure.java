/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_toyadventure;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author aramos2027
 */


class StoryText{
    public void printInstructions(){



        System.out.println("""
                           ====================================
                           CONTROLS:
                           
                           1 : Option 1
                           2 : Option 2
                           3 : Option 3
                           ? : View Controls
                           
                           reset : Reset game
                           end   : End Program
                           ok    : Close CONTROLS
                           
                           Any other text: show current prompt
                           =====================================
                           """);
    }
    
    public void printIntroText(){
         System.out.println("""
                       =====================================================
                       ""
                         There once was a TOY, a TOY made of wood.
                         But unlike a TOY ought to and should, 
                         the TOY was magicked to life by a MAN in a hood.
                       
                         So there he stood, the TOY made of wood,
                         Wishing to be understood.
                         So you bring the TOY, the TOY made of wood,
                         To bring him to the FAIRY who is good
                                                                          ""
                       ======================================================
                            """);
    }
    
    public void printSceneOne(){
        System.out.println("Placeholder text");
    }
}
       

class SceneZero{
}

class SceneOne{
    
}

public class Final_ToyAdventure {


    public static void main(String[] args) {
        // Print "Title Screen"
        StoryText text = new StoryText(); 
        
        // Open Scanner 
        
        Scanner scanner = new Scanner(System.in);
        boolean title = true;
        boolean sceneOne = false;
        boolean sceneTwo = false;        
        while (title){
            text.printIntroText();
            System.out.println("Type \"?\" for CONTROLS");
            System.out.println("Type \"1\" to PLAY");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("?")){
                text.printInstructions();
            }
            else if (response.equals("1")){
                sceneOne = true;
                title = false;
            }
            
        }
        while (sceneOne){
            text.printSceneOne();
            sceneOne = false;
        }
    }
    
}

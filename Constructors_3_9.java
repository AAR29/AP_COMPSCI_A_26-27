/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors_3_9;

/**
 *
 * @author aramos2027
 */
public class Constructors_3_9 {
    //PUT THE ACTUAL COURSES UP HERE
    //Use toString 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // making the clasd
}

 class Course{
        private String courseTitle;
        // making prvate string
        // don't set it equal to the new variable! it's gonna get confused 
        private String courseCode; 
        private int pointsTotal; // add up the points
        private String courseTeacher; 
        
        // Making a Constructor! The things in Parentheses means the "fill-ins" 
        public Course(String courseTitle, String courseCode, int pointsTotal, String courseTeacher) {
         //put in custom inputs before puttng in the default inputs
         this.courseTitle = courseTitle;       
         this.courseCode = courseCode;         
         this.pointsTotal = pointsTotal;
         this.courseTeacher = courseTeacher;   
}
            
        //}
        //public getInstructor(String courseTitle) {
        //    this.courseTitle = "no title";
        //}
    }
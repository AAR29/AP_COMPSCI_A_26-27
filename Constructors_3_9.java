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
   
    // Create course w/ full constructor     
    Course course1 = new Course("Computer Science", "AP CSA", 5642, "Mr. Nelson");

    // name-only constructor, then update values using setters
        Course course2 = new Course("Sciences");
        course2.setCourseCode("AP Physics C");
        course2.setPointsTotal(850);
        course2.setCourseInstructor("Ms. Rafie");

        // Print out each course using toString()
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3)

        // full constructor
        Course course3 = new Course("Physics", "AP Physics 1", 900, "Dr. Brown");

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
        private String CourseInstructor; 
        
        // Making a Constructor! The things in Parentheses means the "fill-ins" 
        public Course(String courseTitle, String courseCode, int pointsTotal, String courseTeacher) {
         //put in custom inputs before puttng in the default inputs
         this.courseTitle = courseTitle;       
         this.courseCode = courseCode;         
         this.pointsTotal = pointsTotal;
         this.CourseInstructor = CourseInstructor;   
         
         // Accessors (Getters)
    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

        public int getPointsTotal() {
            return pointsTotal;
        }

        public String getCourseInstructor() {
            return courseInstructor;
        }

        // Mutators (Setters)
        public void setCourseTitle(String courseTitle) {
            this.courseTitle = courseTitle;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public void setPointsTotal(int pointsTotal) {
            this.pointsTotal = pointsTotal;
        }

        public void setCourseInstructor(String courseInstructor) {
            this.courseInstructor = courseInstructor;
        }

        // toString method (built step-by-step)
        @Override
        public String toString() {
            String description = "Course Title: " + courseTitle + "\n";
            description += "Course Code: " + courseCode + "\n";
            description += "Total Points: " + pointsTotal + "\n";
            description += "Instructor: " + courseInstructor;
            
            return description;
        
         

        }



}
      
}

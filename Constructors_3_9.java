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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Create course w/ full constructor (at least 3 objects required)
        Course course1 = new Course("Computer Science", "AP CSA", 234, "Mr. Nelson");

        // 2. Name-only constructor, then update values using setters
        Course course2 = new Course("Sciences");
        course2.setCourseCode("AP Physics C");
        course2.setPointsTotal(850);
        course2.setCourseInstructor("Ms. Rafie");

        // 3. Full constructor for the third course (created before printing so it exists)
        Course course3 = new Course("Mathematics", "AP Calculus BC", 900, "Mr. Dahms");

        // Print out each course using toString()
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}

class Course {
    private String courseTitle;
    private String courseCode;
    private int pointsTotal;
    private String courseInstructor; 

    // Constructor 1: Full constructor
    public Course(String courseTitle, String courseCode, int pointsTotal, String courseInstructor) {
        this.courseTitle = courseTitle;       
        this.courseCode = courseCode;        
        this.pointsTotal = pointsTotal;
        this.courseInstructor = courseInstructor;   
    }

    // Constructor 2: Name-only constructor (Overloaded)
    public Course(String courseTitle) {
        this.courseTitle = courseTitle;
        this.courseCode = "TBD";
        this.pointsTotal = 0;
        this.courseInstructor = "TBD";
    }

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
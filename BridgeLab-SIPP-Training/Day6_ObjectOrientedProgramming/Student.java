/**
 * Day 6: Object Oriented Programming
 * Problem: Student Class
 * Description: Demonstrating classes, objects, constructors, and methods
 */
public class Student {
    // Instance variables (attributes)
    private String name;
    private int rollNumber;
    private String course;
    private double gpa;
    
    // Constructor
    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.gpa = 0.0;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public String getCourse() {
        return course;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA value");
        }
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
    
    public static void main(String[] args) {
        // Creating objects
        Student student1 = new Student("John Doe", 101, "Computer Science");
        Student student2 = new Student("Jane Smith", 102, "Mathematics");
        
        // Setting GPA
        student1.setGpa(3.8);
        student2.setGpa(3.9);
        
        // Displaying information
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}

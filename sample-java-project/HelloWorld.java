/**
 * HelloWorld.java
 * A beginner-friendly program demonstrating Object-Oriented Programming (OOP) concepts
 * 
 * Learning Concepts:
 * - Class definition and structure
 * - Object instantiation (creating objects)
 * - Instance variables and static variables
 * - Constructors (initialization methods)
 * - Method definitions
 * - The main method (program entry point)
 * - String concatenation and output
 */

public class HelloWorld {
    
    // Instance variables (belong to each object)
    private String name;
    private int age;
    
    // Static variable (belongs to the class, shared by all objects)
    private static int studentCount = 0;
    
    /**
     * Constructor: Called when creating a new Student object
     * Initializes instance variables
     * @param name The student's name
     * @param age The student's age
     */
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;  // Increment counter each time a new student is created
    }
    
    /**
     * Method to display student information
     */
    public void displayInfo() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
    /**
     * Getter method for name
     * @return The student's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter method for age
     * @return The student's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Static method to get total number of students created
     * @return Total student count
     */
    public static int getStudentCount() {
        return studentCount;
    }
    
    /**
     * Main method: Entry point of the program
     * Demonstrates object creation and method calling
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== HelloWorld Demo ==========\n");
        
        // Create student objects (instantiation)
        HelloWorld student1 = new HelloWorld("Alice", 20);
        HelloWorld student2 = new HelloWorld("Bob", 21);
        HelloWorld student3 = new HelloWorld("Charlie", 19);
        
        // Call methods on objects
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        
        // Access static variable through a method
        System.out.println("\nTotal students created: " + getStudentCount());
        
        System.out.println("====================================");
    }
}

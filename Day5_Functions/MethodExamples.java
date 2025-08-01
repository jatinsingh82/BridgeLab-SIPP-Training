/**
 * Day 5: Functions/Methods
 * Problem: Method Examples
 * Description: Demonstrating different types of methods in Java
 */
public class MethodExamples {
    public static void main(String[] args) {
        // Calling different methods
        printMessage();
        printMessage("Custom message");
        
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
        
        double area = calculateArea(5.0);
        System.out.println("Area of circle: " + area);
        
        boolean isEven = checkEven(8);
        System.out.println("Is 8 even? " + isEven);
    }
    
    // Method with no parameters and no return value
    public static void printMessage() {
        System.out.println("Hello from method!");
    }
    
    // Method with parameters and no return value
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
    
    // Method with parameters and return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Method to check if number is even
    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }
}

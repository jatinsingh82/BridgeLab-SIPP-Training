/**
 * Day 3: Control Structures
 * Problem: If-Else Statement Example
 * Description: Demonstrating conditional statements and control flow
 */
public class IfElseExample {
    public static void main(String[] args) {
        int number = 15;
        
        // Simple if statement
        if (number > 0) {
            System.out.println("Number is positive");
        }
        
        // If-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        
        // If-else if-else statement
        if (number < 10) {
            System.out.println("Number is less than 10");
        } else if (number < 20) {
            System.out.println("Number is between 10 and 20");
        } else {
            System.out.println("Number is 20 or greater");
        }
        
        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}

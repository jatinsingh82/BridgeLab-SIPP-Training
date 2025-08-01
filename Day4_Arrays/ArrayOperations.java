/**
 * Day 4: Arrays
 * Problem: Array Operations
 * Description: Demonstrating array creation, manipulation, and traversal
 */
public class ArrayOperations {
    public static void main(String[] args) {
        // Creating arrays
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        
        // Accessing array elements
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last name: " + names[names.length - 1]);
        
        // Traversing arrays
        System.out.println("Numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Enhanced for loop
        System.out.println("Names array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("2D Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/**
 * Day 10: File Handling
 * Problem: File Operations
 * Description: Demonstrating file reading, writing, and manipulation
 */
import java.io.*;
import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        // Writing to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample file!\n");
            writer.write("This is the second line.\n");
            writer.write("Java File Handling Example.\n");
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading from a file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            System.out.println("\nReading file contents:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        // File information
        try {
            File file = new File(fileName);
            System.out.println("\nFile Information:");
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("File exists: " + file.exists());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
        } catch (Exception e) {
            System.out.println("Error getting file information: " + e.getMessage());
        }
        
        // Creating a directory
        try {
            File directory = new File("output");
            if (directory.mkdir()) {
                System.out.println("\nDirectory 'output' created successfully!");
            } else {
                System.out.println("\nDirectory 'output' already exists or could not be created.");
            }
        } catch (Exception e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }
}

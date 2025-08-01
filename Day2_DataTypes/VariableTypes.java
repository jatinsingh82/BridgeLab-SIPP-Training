/**
 * Day 2: Data Types
 * Problem: Variable Types Demonstration
 * Description: Demonstrating different data types in Java
 */
public class VariableTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        
        // Floating point types
        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        
        // Character type
        char charValue = 'A';
        
        // Boolean type
        boolean boolValue = true;
        
        // String (reference type)
        String stringValue = "Hello Java!";
        
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("String: " + stringValue);
    }
}

/**
 * Day 7: Strings
 * Problem: String Manipulation
 * Description: Demonstrating various string operations and methods
 */
public class StringManipulation {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello World";
        String str2 = new String("Java Programming");
        
        // String length
        System.out.println("Length of str1: " + str1.length());
        
        // String concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated: " + result);
        
        // String methods
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        System.out.println("Substring: " + str1.substring(0, 5));
        
        // String comparison
        String str3 = "Hello World";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 == str3: " + (str1 == str3));
        
        // String searching
        System.out.println("Contains 'World': " + str1.contains("World"));
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        
        // String splitting
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        
        // String trimming
        String spaced = "   Hello   ";
        System.out.println("Original: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");
    }
}

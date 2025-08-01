/**
 * Day 8: Collections
 * Problem: Collection Examples
 * Description: Demonstrating ArrayList, HashSet, and HashMap
 */
import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        // ArrayList example
        System.out.println("=== ArrayList Example ===");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
        System.out.println("Contains 'Bob': " + names.contains("Bob"));
        
        // Iterating through ArrayList
        System.out.println("Names using for-each:");
        for (String name : names) {
            System.out.println("- " + name);
        }
        
        // HashSet example
        System.out.println("\n=== HashSet Example ===");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate will be ignored
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Size: " + numbers.size());
        
        // HashMap example
        System.out.println("\n=== HashMap Example ===");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("David", 78);
        
        System.out.println("Scores: " + scores);
        System.out.println("Alice's score: " + scores.get("Alice"));
        
        // Iterating through HashMap
        System.out.println("All scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

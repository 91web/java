package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a Map (using HashMap implementation)
        Map<String, Integer> ageMap = new HashMap<>();

        // 1. Adding entries using put(key, value)
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 28);

        // 2. Keys are unique. put() on an existing key UPDATES the value.
        Integer oldValue = ageMap.put("Bob", 26); // Bob's age changes from 25 to 26
        System.out.println("Bob's old age was: " + oldValue); // Output: 25

        // 3. Retrieving values using get(key)
        Integer aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge); // Output: 30

        // 4. Trying to get a non-existent key returns null
        Integer daveAge = ageMap.get("Dave");
        System.out.println("Dave's age: " + daveAge); // Output: null

        // 5. Checking for a key or value
        System.out.println("Is Alice in the map? " + ageMap.containsKey("Alice")); // Output: true
        System.out.println("Is anyone 100 years old? " + ageMap.containsValue(100)); // Output: false

        // 6. Removing an entry
        ageMap.remove("Charlie");
        System.out.println("Map after removing Charlie: " + ageMap); // Output: {Alice=30, Bob=26}

        // 7. Iterating over a Map (KeySet, Values, or EntrySet)
        System.out.println("All keys: " + ageMap.keySet());   // Output: [Alice, Bob]
        System.out.println("All values: " + ageMap.values()); // Output: [30, 26]

        // The most common way to iterate: Over the EntrySet
        System.out.println("\nIterating over entries:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(" - " + key + " is " + value + " years old.");
        }
    }
}

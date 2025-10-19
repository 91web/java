package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrderDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // Preserves insertion order

        // Inserting entries in a specific order
        hashMap.put("Zebra", 26);
        hashMap.put("Apple", 1);
        hashMap.put("Mango", 13);
        linkedHashMap.put("Zebra", 26);
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Mango", 13);

        System.out.println("HashMap (Order not guaranteed):");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(" - " + entry.getKey() + " = " + entry.getValue());
        }
        // Output order might be: Apple, Zebra, Mango

        System.out.println("\nLinkedHashMap (Insertion order preserved):");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(" - " + entry.getKey() + " = " + entry.getValue());
        }
        // Output order is guaranteed: Zebra, Apple, Mango
    }
}


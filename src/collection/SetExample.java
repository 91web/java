package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a Set (using HashSet implementation)
        Set<String> uniqueNumbers = new HashSet<>();

        // Adding elements
        uniqueNumbers.add("One");
        uniqueNumbers.add("Two");
        uniqueNumbers.add("Three");
        boolean wasAdded = uniqueNumbers.add("Two"); // Trying to add a duplicate

        System.out.println("Was 'Two' added again? " + wasAdded); // Output: false
        System.out.println("Set contents: " + uniqueNumbers); // Output: [One, Two, Three] (order may vary)

        // The size remains 3, not 4, because duplicates are ignored.
        System.out.println("Size of set: " + uniqueNumbers.size()); // Output: 3

        // Useful for deduplication: Converting a List with duplicates to a Set
        List<String> listWithDuplicates = List.of("A", "B", "A", "C", "B");
        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
        System.out.println("Original List: " + listWithDuplicates); // Output: [A, B, A, C, B]
        System.out.println("Deduplicated Set: " + setWithoutDuplicates); // Output: [A, B, C]
    }
}

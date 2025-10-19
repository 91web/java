package collection;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List (using ArrayList implementation)
        List<String> fruitList = new ArrayList<>();

        // 1. Ordered & Indexed
        fruitList.add("Apple");  // Index 0
        fruitList.add("Banana"); // Index 1
        fruitList.add("Mango");  // Index 2
        System.out.println("Initial List: " + fruitList); // Output: [Apple, Banana, Mango]

        // 2. Allows Duplicates
        fruitList.add("Apple"); // Adding a duplicate
        System.out.println("List with duplicate: " + fruitList); // Output: [Apple, Banana, Mango, Apple]

        // 3. Access by Index
        String fruitAtIndex1 = fruitList.get(1);
        System.out.println("Fruit at index 1: " + fruitAtIndex1); // Output: Banana

        // 4. Insert at specific index (shifts elements)
        fruitList.add(1, "Orange"); // Insert Orange at index 1
        System.out.println("After inserting Orange at index 1: " + fruitList); // Output: [Apple, Orange, Banana, Mango, Apple]

        // 5. Remove by index and by object
        fruitList.remove(0); // Removes "Apple" at index 0
        fruitList.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("After removals: " + fruitList); // Output: [Orange, Banana, Mango]

        // 6. Other common methods
        System.out.println("Size of list: " + fruitList.size()); // Output: 3
        System.out.println("Index of 'Mango': " + fruitList.indexOf("Mango")); // Output: 2

        // 7. Iteration (using for-each loop)
        System.out.println("Iterating with for-each:");
        for (String fruit : fruitList) {
            System.out.println(" - " + fruit);
        }
    }
}

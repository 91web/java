package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOrderDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>(); // Uses natural ordering (alphabetical)

        String[] names = {"Charlie", "Alice", "Bob", "David"};

        for (String name : names) {
            hashSet.add(name);
            treeSet.add(name);
        }

        System.out.println("HashSet (No guaranteed order): " + hashSet);
        // Output might be: [Bob, David, Charlie, Alice] - order is unpredictable.

        System.out.println("TreeSet (Sorted order): " + treeSet);
        // Output will always be: [Alice, Bob, Charlie, David] - sorted alphabetically.
    }
}

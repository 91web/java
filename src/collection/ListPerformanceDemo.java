package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceDemo {
    public static void main(String[] args) {
        final int SIZE = 100000;
        // Test ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i); // Fast at adding to the end
        }

        long startTime = System.nanoTime();
        // SLOW: Insert at the beginning (must shift all elements)
        arrayList.add(0, -1);
        long arrayListTime = System.nanoTime() - startTime;

        // Test LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        // FAST: Insert at the beginning (just change pointers)
        linkedList.add(0, -1);
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("Time to insert at start (ArrayList): " + arrayListTime + " ns");
        System.out.println("Time to insert at start (LinkedList): " + linkedListTime + " ns");
        // LinkedListTime will be significantly faster for this operation.
    }
}


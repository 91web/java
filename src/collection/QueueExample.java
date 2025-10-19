package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue (using LinkedList implementation)
        Queue<String> ticketQueue = new LinkedList<>();

        // Adding elements to the queue (enqueue operation)
        ticketQueue.add("Person A");
        ticketQueue.add("Person B");
        ticketQueue.add("Person C");
        System.out.println("Initial queue: " + ticketQueue); // Output: [Person A, Person B, Person C]

        // Removing the element at the front of the queue (dequeue operation) - FIFO
        String firstPerson = ticketQueue.remove();
        System.out.println("First person served: " + firstPerson); // Output: Person A
        System.out.println("Queue after serving: " + ticketQueue); // Output: [Person B, Person C]

        // Peeking at the front element without removing it
        String nextInLine = ticketQueue.peek();
        System.out.println("Next in line: " + nextInLine); // Output: Person B
        System.out.println("Queue is unchanged: " + ticketQueue); // Output: [Person B, Person C]
    }
}


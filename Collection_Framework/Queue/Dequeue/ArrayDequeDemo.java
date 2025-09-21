package Queue.Dequeue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Insert at both ends
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(30);

        System.out.println("Deque: " + deque); // [5, 10, 20, 30]

        // Peek operations
        System.out.println("First: " + deque.peekFirst()); // 5
        System.out.println("Last: " + deque.peekLast());   // 30

        // Remove from both ends
        System.out.println("removeFirst: " + deque.removeFirst()); // 5
        System.out.println("removeLast: " + deque.removeLast());   // 30

        System.out.println("Deque after removals: " + deque); // [10, 20]

        // Stack behavior (LIFO)
        deque.push(99); // same as addFirst
        System.out.println("After push: " + deque); // [99, 10, 20]
        System.out.println("Pop: " + deque.pop()); // 99
    }
}

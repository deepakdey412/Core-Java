package Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // add/offer
        queue.add(30);
        queue.offer(10);
        queue.offer(20);
        System.out.println("Queue: " + queue); // internal order

        // peek / element
        System.out.println("Peek: " + queue.peek());     // 10
        System.out.println("Element: " + queue.element()); // 10

        // poll / remove
        System.out.println("Poll: " + queue.poll());     // 10 removed
        System.out.println("Remove: " + queue.remove()); // 20 removed
        System.out.println("Queue after removal: " + queue);

        // size / isEmpty
        System.out.println("Size: " + queue.size());
        System.out.println("IsEmpty? " + queue.isEmpty());
    }
}

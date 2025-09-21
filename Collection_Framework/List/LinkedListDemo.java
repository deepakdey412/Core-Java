package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList create
        LinkedList<Integer> list = new LinkedList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original List: " + list);

        // addFirst, addLast
        list.addFirst(5);  // 5 at beginning
        list.addLast(40);  // 40 at end
        System.out.println("After addFirst & addLast: " + list);

        // get elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // set element (replace)
        list.set(2, 25);
        System.out.println("After set(2,25): " + list);

        // remove elements
        list.removeFirst();
        list.removeLast();
        list.remove(1); // remove by index
        System.out.println("After removing elements: " + list);

        // contains
        System.out.println("Contains 25? " + list.contains(25));

        // size
        System.out.println("Size of list: " + list.size());

        // isEmpty
        System.out.println("Is list empty? " + list.isEmpty());

        // indexOf / lastIndexOf
        list.add(30);
        list.add(25);
        System.out.println("Index of 25: " + list.indexOf(25));
        System.out.println("Last index of 25: " + list.lastIndexOf(25));

        // sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // ---------------- STREAMS ----------------
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        System.out.println("\nStream Original: " + numbers);

        // filter (even numbers only)
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evens);

        // map (square each element)
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // count
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // sorted descending
        List<Integer> sortedDesc = numbers.stream()
                .sorted((a,b) -> b - a)
                .collect(Collectors.toList());
        System.out.println("Sorted Desc: " + sortedDesc);

        // anyMatch, allMatch
        System.out.println("Any > 5? " + numbers.stream().anyMatch(n -> n > 5));
        System.out.println("All > 0? " + numbers.stream().allMatch(n -> n > 0));

        // forEach
        System.out.print("Print with forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
    }
}

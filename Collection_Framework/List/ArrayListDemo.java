package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList create
        List<Integer> list = new ArrayList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List: " + list);

        // add at index
        list.add(2, 25); // index 2 pe insert
        System.out.println("After add(index, element): " + list);

        // get element
        System.out.println("Element at index 3: " + list.get(3));

        // set element (replace)
        list.set(1, 99);
        System.out.println("After set(1, 99): " + list);

        // remove by index
        list.remove(2);
        System.out.println("After remove(2): " + list);

        // contains
        System.out.println("Contains 40? " + list.contains(40));

        // size
        System.out.println("Size of list: " + list.size());

        // isEmpty
        System.out.println("Is list empty? " + list.isEmpty());

        // indexOf / lastIndexOf
        list.add(40);
        System.out.println("Index of 40: " + list.indexOf(40));
        System.out.println("Last index of 40: " + list.lastIndexOf(40));

        // sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // clear
        // list.clear();  // Uncomment to remove all elements

        // ---------------- STREAMS ----------------
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
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

        // sorted in reverse order
        List<Integer> sortedDesc = numbers.stream()
                .sorted((a, b) -> b - a)
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

package Sets.SortedSet;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // Add elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(30); // duplicate, won't be added

        System.out.println("TreeSet: " + set); // automatically sorted

        // contains
        System.out.println("Contains 20? " + set.contains(20));

        // remove
        set.remove(10);
        System.out.println("After removing 10: " + set);

        // size
        System.out.println("Size: " + set.size());

        // iteration
        System.out.print("Iterating: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // clear
        set.clear();
        System.out.println("After clear: " + set);
    }
}

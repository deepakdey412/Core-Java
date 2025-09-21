package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Banana"); // duplicate, won't be added

        System.out.println("Set: " + set); // insertion order maintained

        // contains
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // remove
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);

        // size
        System.out.println("Size: " + set.size());

        // iteration
        System.out.print("Iterating: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // clear
        set.clear();
        System.out.println("After clear: " + set);
    }
}

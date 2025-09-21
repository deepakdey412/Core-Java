package Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create HashSets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        set2.add(30);
        set2.add(40);
        set2.add(60);
        set2.add(70);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // contains
        System.out.println("Set1 contains 20? " + set1.contains(20));

        // remove
        set1.remove(50);
        System.out.println("After removing 50 from Set1: " + set1);

        // addAll (Union)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (set1 ∪ set2): " + union);

        // retainAll (Intersection)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection (set1 ∩ set2): " + intersection);

        // removeAll (Difference)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);

        // isEmpty
        System.out.println("Set1 empty? " + set1.isEmpty());

        // size
        System.out.println("Size of Set2: " + set2.size());

        // Iteration
        System.out.print("Iterating Set1: ");
        for (Integer val : set1) {
            System.out.print(val + " ");
        }
        System.out.println();

        // clear
        set1.clear();
        System.out.println("After clear Set1: " + set1);
    }
}

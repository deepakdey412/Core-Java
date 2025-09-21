package List;

import java.util.Vector;

public class VectorDemo {

    // Main Method
    public static void main(String[] args) {

        // Declaring the Vector
        Vector<Integer> v = new Vector<>();

        // Appending new elements at the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println("Vector: " + v);

        // Remove element at index 3 (0-based index)
        v.remove(3);

        // Displaying the Vector after deletion
        System.out.println("After removing index 3: " + v);

        // Printing elements one by one
        System.out.print("Iterating: ");
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}

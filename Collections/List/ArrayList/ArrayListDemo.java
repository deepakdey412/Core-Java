import java.util.ArrayList;  // ArrayList class import
import java.util.List;       // List interface import

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1️⃣ Create an ArrayList using List interface
        List<String> fruits = new ArrayList<>(); // List reference, ArrayList object (store elements in form of object ). default capacity 10

        // 2️⃣ Add elements
        fruits.add("Apple");     // Adds "Apple" at end
        fruits.add("Banana");    // Adds "Banana" at end
        fruits.add("Mango");     // Adds "Mango" at end
        fruits.add("Orange");    // Adds "Orange" at end
        System.out.println("Initial List: " + fruits); // [Apple, Banana, Mango, Orange]

        // 3️⃣ Insert element at a specific index
        fruits.add(1, "Grapes"); // Inserts "Grapes" at index 1
        System.out.println("After insert: " + fruits); // [Apple, Grapes, Banana, Mango, Orange]

        // 4️⃣ Access element
        String firstFruit = fruits.get(0); // Gets element at index 0
        System.out.println("First fruit: " + firstFruit); // Apple

        // 5️⃣ Update element
        fruits.set(2, "Pineapple"); // Replaces element at index 2 with "Pineapple"
        System.out.println("After update: " + fruits); // [Apple, Grapes, Pineapple, Mango, Orange]

        // 6️⃣ Check if element exists
        boolean hasMango = fruits.contains("Mango"); // Checks if "Mango" is in list
        System.out.println("Contains Mango? " + hasMango); // true

        // 7️⃣ Remove by index
        fruits.remove(0); // Removes element at index 0 ("Apple")
        System.out.println("After removing index 0: " + fruits); // [Grapes, Pineapple, Mango, Orange]

        // 8️⃣ Remove by value
        fruits.remove("Mango"); // Removes first occurrence of "Mango"
        System.out.println("After removing Mango: " + fruits); // [Grapes, Pineapple, Orange]

        // 9️⃣ Size of ArrayList
        System.out.println("Size: " + fruits.size()); // 3

        // 🔟 Loop through ArrayList
        System.out.print("Loop: ");
        for (String fruit : fruits) { // Enhanced for loop
            System.out.print(fruit + " "); // Grapes Pineapple Orange
        }
        System.out.println();

        // 1️⃣1️⃣ Clear all elements
        fruits.clear(); // Removes all elements
        System.out.println("After clear: " + fruits); // []

        System.out.println(fruits.contains(10));

    }
}

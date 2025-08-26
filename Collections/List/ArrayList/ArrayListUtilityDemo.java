import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUtilityDemo {
    public static void main(String[] args) {

        // 1️⃣ Convert ArrayList to Array using toArray()
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Object[] fruitArray = fruits.toArray(); // Convert to Object array
        System.out.println("Array from ArrayList: " + Arrays.toString(fruitArray));
        // Output: [Apple, Banana, Mango]

        // 2️⃣ ArrayList to String using toString()
        String fruitsString = fruits.toString(); // Convert list to string
        System.out.println("ArrayList as String: " + fruitsString);
        // Output: [Apple, Banana, Mango]

        // 3️⃣ Convert Array to List using Arrays.asList()
        String[] colorsArray = {"Red", "Green", "Blue"};
        List<String> colorsList = Arrays.asList(colorsArray); // Convert array to fixed-size List
        System.out.println("List from Array: " + colorsList);
        // Output: [Red, Green, Blue]

        // 4️⃣ Demonstrating fixed-size nature of Arrays.asList()
        // colorsList.add("Yellow"); // ❌ Will throw UnsupportedOperationException
    }
}

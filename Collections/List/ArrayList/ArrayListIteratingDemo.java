import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratingDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 1️⃣ Using traditional for loop (index-based)
        System.out.println("1. Traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 2️⃣ Using enhanced for loop (for-each)
        System.out.println("\n2. Enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 3️⃣ Using Iterator
        System.out.println("\n3. Using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4️⃣ Using forEach() method with lambda (Java 8+)
        System.out.println("\n4. Using forEach() with lambda:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // 5️⃣ Using forEach() with method reference (Java 8+)
        System.out.println("\n5. Using forEach() with method reference:");
        fruits.forEach(System.out::println);
    }
}

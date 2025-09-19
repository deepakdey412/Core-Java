abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass provides implementation
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Test {
    public static void main(String[] args) {
        // Animal a = new Animal(); ❌ Error (can't create object of abstract class)
        Animal d = new Dog();  // ✅ allowed (reference of parent, object of child)
        d.sound();  // Output: Bark
        d.sleep();  // Output: Sleeping...
    }
}

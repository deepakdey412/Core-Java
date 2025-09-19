public class Test {
    public static void main(String[] args) {

        // 1️⃣ Parent object
        A a = new A();
        a.show();         // Calls A's show()
        // a.display();   // ✅ Would work, but commented as per your note

        // 2️⃣ Child object
        B b = new B();
        b.show();         // Calls B's overridden show()
        b.display();      // Calls B's display()

        // 3️⃣ Parent reference, child object (Polymorphism)
        A a1 = new B();
        a1.show();        // ✅ Calls B's overridden show() → runtime polymorphism
        // a1.display();  // ❌ Not allowed, reference type A can't access child-specific methods

        // 4️⃣ Child reference, parent object (Not allowed)
        // B b1 = new A(); // ❌ Compile-time error: cannot assign parent object to child reference
    }
}

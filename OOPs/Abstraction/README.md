
# 🔹 **Abstraction in Java – Simple to Advanced**

### **1. Simple Definition (Basic Level)**

👉 **Abstraction means hiding implementation details and showing only the necessary functionality to the user.**

* Example in real life:
  When you drive a car, you use the **steering, brake, accelerator**, but you don’t care how the **engine works internally**.
  That’s abstraction.

---

### **2. In Java**

In Java, abstraction is achieved in **two ways**:

1. **Abstract classes** (0–100% abstraction)
2. **Interfaces** (100% abstraction in older versions, but since Java 8+, interfaces can also have default and static methods, so not always 100%).

---

### **3. Why Abstraction?**

* To reduce complexity.
* To focus on *what* an object does instead of *how* it does.
* To achieve loose coupling between different modules.

---

### **4. Code Example (Abstract Class)**

```java
abstract class Vehicle {
    abstract void start(); // abstract method -> no body

    void fuel() { // concrete method
        System.out.println("Vehicle needs fuel to run.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.fuel();
        v2.start();
    }
}
```

✅ Output:

```
Car starts with a key.
Vehicle needs fuel to run.
Bike starts with a kick.
```

Here, **Vehicle** is abstract (general idea), but **Car** and **Bike** provide actual implementations.

---

### **5. Code Example (Interface)**

```java
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay(1000);
        payment2.pay(500);
    }
}
```

✅ Output:

```
Paid 1000.0 using Credit Card.
Paid 500.0 using UPI.
```

Here, the **user only sees `pay()` method**, not how the payment is processed.

---

# 🔹 **Interview Questions on Abstraction (Basic → Advanced)**

### ✅ **Basic Level**

1. **What is abstraction in Java?**
   → Process of hiding internal details and showing only essential features.

2. **How do you achieve abstraction in Java?**
   → Using **abstract classes** and **interfaces**.

3. **Can we create an object of an abstract class?**
   → ❌ No, but we can create a reference of it.

4. **Can abstract class have constructor?**
   → ✅ Yes, to initialize common variables.

---

### ✅ **Intermediate Level**

5. **Difference between abstraction and encapsulation?**

   * **Abstraction** → Focuses on *what* to do (hides implementation).
   * **Encapsulation** → Focuses on *how* data is hidden (wrapping fields and methods together with access modifiers).

6. **Difference between abstract class and interface?**

   * **Abstract Class**: Can have abstract + concrete methods, variables, constructors. Supports multiple inheritance via interfaces only.
   * **Interface**: Only method signatures (till Java 7), but from Java 8 onwards can have `default` and `static` methods. Supports multiple inheritance.

7. **Can an interface extend another interface?**
   → ✅ Yes. (One interface can extend multiple interfaces).

---

### ✅ **Advanced Level**

8. **When should you use abstract class vs interface?**

   * Use **abstract class** when you have a base class with some default behavior and shared state.
   * Use **interface** when you want to define a contract that multiple classes (even unrelated) can implement.

9. **What is marker interface?**
   → An interface with no methods (e.g., `Serializable`, `Cloneable`). It gives metadata to JVM.

10. **Can an abstract class implement an interface without defining its methods?**
    → ✅ Yes, but then that abstract class also becomes abstract.

11. **What happens if a class does not implement all methods of an interface?**
    → Then that class must also be declared as **abstract**.

12. **Can abstract methods be private or static?**
    → ❌ No, because abstract methods must be overridden.

---

# 🔹 **Key Points to Remember**

* Abstraction = *What to do*, not *How to do*.
* **Abstract class** → 0 to 100% abstraction.
* **Interface** → 100% abstraction (till Java 7), later supports default and static methods.
* Use abstraction to design **loosely coupled, scalable, and maintainable code**.

---

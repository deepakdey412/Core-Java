# 📘 Abstract Class and Abstract Methods in Java

---

## 🔹 1. What is an Abstract Class?

* An **abstract class** is a class that is **incomplete**.
* It may contain **abstract methods** (without body) and **normal methods** (with body).
* We **cannot create an object** of an abstract class directly.
* It is used as a **blueprint** for other classes.
* Subclasses must provide the implementation of abstract methods.

### ✅ Syntax

```java
abstract class ClassName {
    abstract void method1();  // Abstract method
    void method2() {          // Normal method
        System.out.println("This is a normal method");
    }
}
```

---

## 🔹 2. What is an Abstract Method?

* A **method without implementation (body)**.
* Declared with the `abstract` keyword.
* Must be implemented by the subclass.
* Can only be declared inside an abstract class.

### ✅ Syntax

```java
abstract void methodName();
```

---

## 🔹 3. Key Points

1. **Object Creation** → Not allowed for abstract classes.
2. **Methods** → Abstract + Normal methods are allowed.
3. **Constructors/Variables** → Abstract class can have constructors, variables, static methods, final methods.
4. **Inheritance** → Subclass must implement all abstract methods, otherwise subclass must also be abstract.

---

## 🔹 4. Example

```java
abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() { // normal method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Test {
    public static void main(String[] args) {
        // Animal a = new Animal(); ❌ Error (cannot instantiate)
        Animal d = new Dog(); ✅
        d.sound();  // Output: Bark
        d.sleep();  // Output: Sleeping...
    }
}
```

---

## 🔹 5. Anonymous Class with Abstract Class

We can use an **anonymous class** to provide implementation instantly.

```java
abstract class Vehicle {
    abstract void start();
}

class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {
            void start() {
                System.out.println("Car started with key");
            }
        };
        v.start(); // Output: Car started with key
    }
}
```

---

## 🔹 6. Real-life Example

* **Abstract class → Vehicle (general idea)**

    * Methods: start(), stop()
    * Cannot create object of Vehicle because it’s just a concept.

* **Subclasses → Car, Bike**

    * Car implements `start()` using key.
    * Bike implements `start()` using kick.

---

## 🔹 7. Abstract Class vs Interface (Interview Point)

| Feature     | Abstract Class                             | Interface                                                                             |
| ----------- | ------------------------------------------ | ------------------------------------------------------------------------------------- |
| Methods     | Abstract + Normal methods                  | Only abstract methods (Java 7); default & static (Java 8+); private methods (Java 9+) |
| Variables   | Instance variables allowed                 | Only `public static final` constants                                                  |
| Inheritance | A class can extend **one abstract class**  | A class can implement **multiple interfaces**                                         |
| Constructor | Can have constructor                       | Cannot have constructor                                                               |
| Use case    | Common functionality + partial abstraction | Full abstraction + multiple inheritance                                               |

---


# 🔹 **Encapsulation in Java**

### **1. Simple Definition**

👉 **Encapsulation means binding data (variables) and methods (functions) together into a single unit and restricting direct access to data.**

* In simple words:

  * Wrap **data (fields)** + **code (methods)** into one class.
  * Hide data using `private` keyword.
  * Provide controlled access using `getter` and `setter` methods.

---

### **2. Real-Life Example**

* A **capsule medicine** → all ingredients are wrapped inside a single capsule.
* You don’t see or directly touch ingredients. You only consume the capsule.
  That’s **Encapsulation**.

---

### **3. Why Encapsulation?**

* To achieve **data hiding** (security).
* To make code **flexible** and **easy to change**.
* To protect object’s internal state from unauthorized access.
* To implement **read-only** or **write-only** fields.

---

### **4. Code Example**

```java
class Student {
    // Step 1: private variables
    private String name;
    private int age;

    // Step 2: public getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // validation can be added
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Deepak");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

✅ Output:

```
Name: Deepak
Age: 21
```

Here:

* `name` and `age` are **hidden** (`private`).
* You can’t access them directly: `s.name ❌` (error).
* You must use `setName()` and `getName()` to access them ✅.

---

### **5. Key Benefits**

1. **Data Hiding** → variables are private.
2. **Security** → no one can access sensitive data directly.
3. **Control** → through getters/setters, you can add validations.
4. **Flexibility** → change implementation anytime without breaking other classes.
5. **Read-only / Write-only** fields →

   * Only `getter` → read-only
   * Only `setter` → write-only

---

# 🔹 **Interview Questions on Encapsulation**

### ✅ **Basic**

1. **What is encapsulation?**
   → Wrapping data and methods into one unit and restricting direct access to fields.

2. **How is encapsulation implemented in Java?**

   * Make variables `private`.
   * Provide `getter` and `setter` methods.

3. **Is encapsulation same as data hiding?**
   → Not exactly.

   * **Encapsulation** is a concept (wrapping + restricting).
   * **Data hiding** is achieved using access modifiers.

---

### ✅ **Intermediate**

4. **What’s the difference between encapsulation and abstraction?**

   * **Encapsulation** → Hides *how data is accessed/stored*. (Focus = variables + methods in one place)
   * **Abstraction** → Hides *implementation details*. (Focus = what to do, not how)

5. **Can we achieve encapsulation without using getters and setters?**
   → No. Because without them, private fields can’t be accessed.

6. **What are real-life examples of encapsulation in Java?**

   * `java.util.Date` (fields are private, accessed via methods).
   * `java.util.ArrayList` (internally uses arrays, but you only use methods like `add()`, `get()`).

---

# 🔹 **Quick Notes (for fast revision)**

* Encapsulation = **Data Hiding + Binding Data & Methods in One Unit**
* Achieved by:

  * Private fields (`private`)
  * Public getters/setters (`getName()`, `setName()`)
* Advantages:

  * Security
  * Data Hiding
  * Flexibility (change without affecting users)
  * Read-only / Write-only support
* Difference:

  * Encapsulation = **How data is accessed**
  * Abstraction = **What to do, not how**

---
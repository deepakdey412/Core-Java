## **Ways to Make an Object Eligible for GC in Java**

---

### **1. Assign `null` to a reference**

When a reference variable is set to `null`, it no longer points to the object, making it unreachable.

**Example:**

```java
String name = new String("Deepak");
name = null; // "Deepak" object is now eligible for GC
```

**Real-life:** Like throwing away a note — you no longer have it in your pocket.

---

### **2. Reassign the reference to another object**

If a variable starts pointing to a new object, the old object becomes unreachable (if no other reference exists).

**Example:**

```java
Student s = new Student("John");
s = new Student("Mike"); // "John" object is now eligible for GC
```

**Real-life:** You replace an old phone with a new one — you no longer use the old one.

---

### **3. Objects created inside a method (local objects)**

When a method ends, all its local variables go out of scope — objects without other references become eligible for GC.

**Example:**

```java
void display() {
    Car c = new Car(); // eligible for GC after method ends
}
```

**Real-life:** A temporary table in a restaurant — when you leave, they remove it.

---

### **4. Nullifying references of object members**

If an object has references to other objects, and you set them to `null`, those inner objects may become eligible for GC.

**Example:**

```java
class House {
    Room room = new Room();
}
House h = new House();
h.room = null; // Room object eligible for GC
```

**Real-life:** Selling furniture from your house — furniture is gone but house still exists.

---

### **5. Isolating objects from the reference chain**

If you break the link between GC Roots and an object, the object becomes unreachable.

**Example:**

```java
Employee e1 = new Employee();
Employee e2 = new Employee();
e1.ref = e2;
e2.ref = e1;
e1 = null;
e2 = null; // both eligible for GC despite circular reference
```

**Real-life:** Two people holding each other’s phone numbers, but both move away and no one else knows them.

---

### **6. Using Anonymous Objects**

Objects without references are eligible for GC as soon as they’re created.

**Example:**

```java
new Book("Java Mastery"); // eligible for GC immediately after creation
```

**Real-life:** Borrowing a pen, using it once, and throwing it away.

---

✅ **Key Point:**
Java GC can **collect circularly referenced objects** too, because it uses **reachability analysis**, not reference counting.

---

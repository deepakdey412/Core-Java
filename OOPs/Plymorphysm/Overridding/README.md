
# 🌟 Java Method Overriding Notes

Method Overriding is a **core OOP concept** in Java used to achieve **run-time polymorphism**. These notes summarize everything you need to know, with examples, rules, and diagrams.

---

## 🔹 1. What is Method Overriding? <img src="https://editablegifs.com/download/down-arrow-red-6.gif" alt="Scroll Down Arrow" width="50" style="vertical-align:middle; margin-left:10px;">


* Occurs when a **child class provides its own implementation** of a method already defined in the **parent class**.
* Ensures **child class behavior** executes at **runtime**.
* **Run-time Polymorphism:** JVM decides which method to call **based on the actual object type**.

**Key Point:** Overriding is **different from Overloading** (explained below).

---

## 🔹 2. How It Works  <img src="https://editablegifs.com/download/down-arrow-red-6.gif" alt="Scroll Down Arrow" width="50" style="vertical-align:middle; margin-left:10px;">

```java
Parent obj = new Child();
obj.show(); // Calls Child's show() at runtime
```

* `obj` is declared as `Parent` but instantiated as `Child`.
* JVM checks the **object type at runtime** → executes **child method**.
  
---

## 🔹 3. Rules of Method Overriding ✅  <img src="https://editablegifs.com/download/down-arrow-red-6.gif" alt="Scroll Down Arrow" width="50" style="vertical-align:middle; margin-left:10px;">

1. **Same Method Signature:** Name + argument types must match.
2. **Covariant Return Type Allowed:** From Java 1.5, child return type can be a subclass of parent return type.
3. **Private Methods Cannot Be Overridden:** They are **class-specific**.
4. **Final Methods Cannot Be Overridden:** Declared with `final` keyword.
5. **Access Modifier Rule:** Child cannot **reduce visibility** (e.g., `public` → `protected` is invalid).

---

## 🔹 4. Example  <img src="https://editablegifs.com/download/down-arrow-red-6.gif" alt="Scroll Down Arrow" width="50" style="vertical-align:middle; margin-left:10px;">

```java
class Parent {
    public void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child show()");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Output: Child show()
    }
}
```

**Explanation:**

* Declared as `Parent` but **object is Child**.
* JVM executes **Child's `show()` method** → **run-time polymorphism**.

---


## 🔹 5. Rule and Cases📊  <img src="https://editablegifs.com/download/down-arrow-red-6.gif" alt="Scroll Down Arrow" width="50" style="vertical-align:middle; margin-left:10px;">
## CASE 01 : 
![Overriding Diagram](https://raw.githubusercontent.com/deepakdey412/Core-Java/main/OOPs/Plymorphysm/Overridding/Images/01.png)
## CASE 02 : 
![Overriding Diagram](https://raw.githubusercontent.com/deepakdey412/Core-Java/main/OOPs/Plymorphysm/Overridding/Images/02.png)
## CASE 03 : 
![Overriding Diagram](https://raw.githubusercontent.com/deepakdey412/Core-Java/main/OOPs/Plymorphysm/Overridding/Images/03.png)
## CASE 04 : 
![Overriding Diagram](https://raw.githubusercontent.com/deepakdey412/Core-Java/main/OOPs/Plymorphysm/Overridding/Images/04.png)
## CASE 05 : 
![Overriding Diagram](https://raw.githubusercontent.com/deepakdey412/Core-Java/main/OOPs/Plymorphysm/Overridding/Images/05.png)







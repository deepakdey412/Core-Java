## OOPs in Java
## Module 01:

1. **Data Hiding**
2. **Abstraction**
3. **Encapsulation**
4. **Tightly Encapsulation**

## Module 02:

1. **Is-A Relationship**
2. **Has-A Relationship**
3. **Method Signature**
4. **Overloading**
5. **Overriding**

## Module 03:

1. **Static Control Flow**
2. **Instance Control Flow**
3. **Constructors**
4. **Coupling**
5. **Cohesion**
6. **Type-Casting**

## Module 01:

### 1. Data Hiding:

Data Hiding is a fundamental concept in object-oriented programming that ensures the internal state and behavior of an object are protected from unauthorized access. This is achieved by making the data members private, which means they can only be accessed or modified through controlled mechanisms like getter and setter methods. By doing so, we prevent direct manipulation of sensitive information, thereby enhancing the security and integrity of the data.

* Outside entities cannot directly access or modify the internal data of an object.
* Data is accessed or modified only through public getter and setter methods, which can include validation and authentication checks.

#### Example:

```java
class ATM {
  // Data member
  private double balance;

  // Getting this data member by getter method
  public double getBalance(){
    return this.balance;
  }

  // Setting this data member by setter method
  public void setBalance(double balance) {
    // Validation can be added here
    this.balance = balance;
  }
}
```

In this example, the `balance` variable is private, meaning it cannot be accessed directly from outside the `ATM` class. Instead, it is accessed and modified through the public `getBalance` and `setBalance` methods, which can include additional logic for validation and authentication.

#### Advantages of Data Hiding:

* **Enhanced Security:** Protects sensitive data from unauthorized access and modification.
* **Improved Integrity:** Ensures that the object's state remains consistent and reliable.
* **Controlled Access:** Allows for validation and authentication checks before data is accessed or modified.
* **Maintainability:** Makes the code easier to maintain and update, as changes to the internal implementation do not affect external code.
* **Encapsulation:** Promotes the principle of encapsulation by bundling data and methods that operate on the data within a single unit.

### 2. Abstraction:

**Abstraction** is the process of hiding the complex implementation details of a system and showing only the essential features or functionalities to the user. It simplifies software design by focusing on **what** an object does instead of **how** it does it.

* 1. **Why It’s Useful:**

     * Simplifies the design process by separating what a system does (interface) from how it does it (implementation).

     * Makes the system easier to use and maintain.

     * Improves security by limiting access to internal implementations.

  2. **Real-Life Example:**

     * "Think of a car. As a driver, you use the steering wheel, accelerator, and brake (the interface). You don't need to understand how the engine, transmission, or braking system works (implementation).".

#### Advantages of Abstraction:

* **Reduced Complexity:** By hiding the complex implementation details, abstraction makes the system easier to understand and use.
* **Enhanced Reusability:** Abstract classes and interfaces can be reused across different parts of the application, promoting code reuse.
* **Improved Maintainability:** Changes to the implementation do not affect the interface, making the system easier to maintain and update.
* **Increased Security:** By exposing only the necessary features, abstraction limits access to internal implementations, enhancing security.
* **Focus on Essentials:** Allows developers to focus on the high-level design and functionality rather than the low-level details.

---

### **Example Code for Abstraction Using an Abstract Class**

```java
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Concrete method (has a body)
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass inheriting the abstract class
class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("Barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.sound();           // Outputs: Barks
        myDog.sleep();           // Outputs: Sleeping...
    }
}
```

---

### **Example Code for Abstraction Using an Interface**

```java
// Interface
interface Vehicle {
    // Abstract methods
    void start();
    void stop();
}

// Implementation of the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Create a Car object
        myCar.start();            // Outputs: Car is starting...
        myCar.stop();             // Outputs: Car is stopping...
    }
}
```

---

### Key Differences Between Abstract Class and Interface:

| **Feature** | **Abstract Class** | **Interface** |
| --- | --- | --- |
| Default Methods | Can have concrete (default) methods. | Can have default and static methods (Java 8+). |
| Multiple Inheritance | Not supported directly. | Can be implemented by multiple classes. |
| Fields | Can have instance variables. | Can have only constants (final static). |

### 3. Encapsulation:

Encapsulation is a fundamental concept in object-oriented programming that involves bundling the data (variables) and the methods (functions) that operate on the data into a single unit, known as a class. It restricts direct access to some of an object's components, which is a means of preventing unauthorized access and modification of data.

* **Key Points:**
  * **Data Bundling:** Encapsulation binds the data and the methods that manipulate the data together.
  * **Access Control:** It controls the access to the data members by making them private and providing public getter and setter methods.
  * **Security:** Enhances security by preventing unauthorized access to the internal state of the object.

#### Example:

```java
class Person {
    // Private data members
    private String name;
    private int age;

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation check
            this.age = age;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

In this example, the `Person` class encapsulates the `name` and `age` data members by making them private. The public getter and setter methods provide controlled access to these data members, ensuring that the internal state of the object is protected.

#### Advantages of Encapsulation:

* **Enhanced Security:** Protects the internal state of the object from unauthorized access and modification.
* **Improved Maintainability:** Makes the code easier to maintain and update, as changes to the internal implementation do not affect external code.
* **Controlled Access:** Allows for validation and authentication checks before data is accessed or modified.
* **Modularity:** Promotes the modular design of the system by bundling related data and methods together.
* **Flexibility:** Allows the internal implementation of a class to be changed without affecting the code that uses the class.

### Data Hiding + Abstraction = Encapsulation

Encapsulation is often achieved through a combination of data hiding and abstraction. Data hiding ensures that the internal state of an object is protected from unauthorized access, while abstraction simplifies the interface by exposing only the essential features of the object. Together, these principles help create robust, secure, and maintainable software systems.

### 4. Tightly Encapsulation:

Tightly Encapsulation, also known as strong encapsulation, is a stricter form of encapsulation where the internal state of an object is completely hidden from the outside world. This means that not only are the data members private, but also the methods that operate on the data are carefully controlled to ensure that the object's state remains consistent and secure.

* **Key Points:**
  * **Complete Data Hiding:** All data members are private, and no direct access is allowed.
  * **Controlled Methods:** Only specific methods are exposed to the outside world, and these methods are designed to maintain the integrity of the object's state.
  * **Immutability:** Often, tightly encapsulated objects are immutable, meaning their state cannot be changed once they are created.

#### Example:

```java
class ImmutablePerson {
    // Private data members
    private final String name;
    private final int age;

    // Constructor to initialize the data members
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John Doe", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

In this example, the `ImmutablePerson` class is tightly encapsulated. The data members `name` and `age` are private and final, meaning they cannot be changed once the object is created. The constructor initializes these data members, and public getter methods provide read-only access to them. This ensures that the internal state of the object remains consistent and secure.

#### Advantages of Tightly Encapsulation:

* **Enhanced Security:** Provides the highest level of security by completely hiding the internal state of the object.
* **Consistency:** Ensures that the object's state remains consistent and reliable throughout its lifecycle.
* **Immutability:** Prevents unintended modifications to the object's state, making the object immutable.
* **Maintainability:** Makes the code easier to maintain and update, as changes to the internal implementation do not affect external code.
* **Robustness:** Creates robust and reliable software systems by strictly controlling access to the object's state.

### What is Mutable and Immutable?

#### Mutable:

A mutable object is one whose state can be changed after it is created. In Java, most objects are mutable by default. This means that the internal state of the object can be modified through public methods or direct access to its data members.

##### Example:

```java
class MutablePerson {
    private String name;
    private int age;

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John Doe", 30);
        person.setName("Jane Doe");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

In this example, the `MutablePerson` class allows the `name` and `age` data members to be modified after the object is created, making it mutable.

#### Immutable:

An immutable object is one whose state cannot be changed after it is created. In Java, immutable objects are often achieved by making the data members private and final, and not providing any methods that modify the object's state.

##### Example:

```java
class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John Doe", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

In this example, the `ImmutablePerson` class ensures that the `name` and `age` data members cannot be changed after the object is created, making it immutable.

## Module 02:

### 1. Is-A Relationship:

The "Is-A" relationship is a fundamental concept in object-oriented programming that represents inheritance. It signifies that one class is a subtype of another class, meaning that the subclass inherits the properties and behaviors of the superclass. This relationship is used to achieve code reusability and to create a hierarchical structure of classes.

1. It is also know as **Enharitance**.
2. It uses the keyword **Extends** 
3. Main advantage is **Reusability**

**NOTE**: 
JAVA dont provide multiple inheritance 

#### Example:

```java
// Superclass
class Animal {
    //code
}
class Bird{
    //code
}

// Subclass
class Dog extends Animal , Bird {
    //code
}
```

**NOTE**: 
JAVA provide multiple inheritance with respect to interfaces

#### Example:

```java
// Superclass
interface Animal {
    //code
}
interface Bird{
    //code
}

// Subclass
interface Dog extends Animal , Bird {
    //code
}
```

**NOTE**: 
JAVA provide Multi- level inheritance 

#### Example:

```java
// Superclass
Class Animal {
    //code
}
class Bird extends Animal{
    //code
}

// Subclass
class Dog extends Bird {
    //code
}
```
**NOTE**: 
Cyclic Inheritance is not supported in java 

#### Advantages of Is-A Relationship:

* **Code Reusability:** Allows subclasses to reuse the code from the superclass, reducing duplication.
* **Hierarchical Structure:** Creates a clear and organized structure of classes, making the code easier to understand and maintain.
* **Polymorphism:** Enables polymorphism, allowing objects to be treated as instances of their superclass.
* **Extensibility:** Makes it easier to extend the functionality of existing classes by creating new subclasses.

### 2. Has-A Relationship:

The "Has-A" relationship is another fundamental concept in object-oriented programming that represents composition or aggregation. It signifies that one class contains or uses instances of another class, meaning that the containing class has a reference to the contained class. This relationship is used to achieve code modularity and to create complex objects from simpler ones.

#### Example:

```java
// Contained class
class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

// Containing class
class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started...");
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
```

In this example, the `Car` class has a reference to the `Engine` class, indicating a "Has-A" relationship. The `Car` class uses the `Engine` class to start the car.

#### Advantages of Has-A Relationship:

* **Code Modularity:** Allows complex objects to be composed of simpler, reusable components.
* **Flexibility:** Makes it easier to change the implementation of contained classes without affecting the containing class.
* **Maintainability:** Improves the maintainability of the code by separating concerns and promoting single responsibility.
* **Reusability:** Enables the reuse of contained classes in different contexts and applications.

### 3. Method Signature:

A method signature is a unique identifier for a method in a class. It consists of the method name and the parameter types (including the order of the parameters). The method signature is used by the compiler to distinguish between different methods, especially in the context of method overloading.

#### Example:

```java
class Calculator {
    // Method with signature i.e method name and paramerters(arguments types ): add(int, int)
    public int add(int a, int b) {
        return a + b;
    }

    // Method with signature: add(double, double)
    public double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // Outputs: 15
        System.out.println(calc.add(5.5, 10.5));   // Outputs: 16.0
    }
}
```

In this example, the `Calculator` class has two methods with different signatures: `add(int, int)` and `add(double, double)`. The compiler uses the method signatures to distinguish between these methods.

### 4. Overloading:

Method overloading is a feature in Java where multiple methods in the same class have the same name but different parameters (different type, number, or order of parameters). This allows a class to have multiple methods with the same name but different functionalities based on the parameters.

#### Example:

```java
class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        System.out.println(mathOps.add(5, 10));          // Outputs: 15
        System.out.println(mathOps.add(5, 10, 15));       // Outputs: 30
        System.out.println(mathOps.add(5.5, 10.5));       // Outputs: 16.0
    }
}
```

In this example, the `MathOperations` class has three overloaded `add` methods with different parameters. The compiler uses the method signatures to determine which method to call based on the arguments provided.

#### Advantages of Overloading:

* **Code Readability:** Improves code readability by allowing methods with the same name to perform different operations based on the parameters.
* **Code Reusability:** Allows the same method name to be used for different types of operations, promoting code reuse.
* **Flexibility:** Provides flexibility in method invocation by allowing different types and numbers of parameters.
* **Maintainability:** Makes the code easier to maintain by grouping related methods under the same name.

### 5. Overriding:

Method overriding is a feature in Java where a subclass provides a specific implementation for a method that is already defined in its superclass. This allows the subclass to override the behavior of the superclass method. The overridden method must have the same signature as the method in the superclass.

#### Example:

```java
// Superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Outputs: Dog barks
    }
}
```

In this example, the `Dog` class overrides the `sound` method of the `Animal` class. When the `sound` method is called on an instance of `Dog`, the overridden method in the `Dog` class is executed.

#### Advantages of Overriding:

* **Polymorphism:** Enables polymorphism, allowing objects to be treated as instances of their superclass while providing specific behavior.
* **Code Reusability:** Allows subclasses to reuse the code from the superclass while providing specific implementations.
* **Flexibility:** Provides flexibility in method invocation by allowing subclasses to override the behavior of superclass methods.
* **Maintainability:** Makes the code easier to maintain by allowing subclasses to provide specific implementations for inherited methods.


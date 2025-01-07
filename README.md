# Java Midterm Project 📝✨

## Overview 💻🌟

This project demonstrates key concepts of Object-Oriented Programming (OOP) in Java, focusing on classes, objects, constructors, and inheritance. The project includes multiple examples of single, multilevel, and hierarchical inheritance, as well as the use of access modifiers (`private`, `public`, and `protected`). The main classes include `Person` and `Main`, showcasing encapsulation with getter and setter methods, and demonstrating casting concepts.

---

## Concepts Covered 📚🔍

### 1. **Class & Object** 🏫
   - A class defines a blueprint for creating objects (instances), and objects represent individual entities.
   - Example: `Person` class represents a person with attributes like name and age.

### 2. **Constructor** 🛠️
   - A constructor is a special method used to initialize objects.
   - Example: Constructor used in `Person` to initialize name and age.

### 3. **Getter & Setter Methods** 🔑
   - Encapsulation is achieved using getter and setter methods to access or modify private fields.
   - Example: `getName()` and `setName()` methods for the `Person` class.

### 4. **Casting Concept** 🔄
   - Casting allows you to convert one data type to another.
   - Example: Casting between different types in inheritance.

### 5. **Inheritance** 🌳
   - **Single Inheritance**: A class inherits from one superclass.
   - **Multilevel Inheritance**: A class inherits from another class, which itself is a subclass of another class.
   - **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
   - Example: A `Student` class inheriting from `Person`, and `Employee` inheriting from `Person`.

### 6. **Access Modifiers** 🚪
   - **Private**: Restricts access to the same class only.
   - **Public**: Makes members accessible to all classes.
   - **Protected**: Allows access within the same package or subclasses.
   - Example: `private int age`, `public String name`, `protected String address`.

---

## Files Included 📂

- `Person.java`: Contains the `Person` class with private attributes, constructors, getter and setter methods.
- `Main.java`: Demonstrates the usage of classes, objects, inheritance, and casting.

---

## Example Code 🖥️💡

```java
// Person.java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
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

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Student.java (Single Inheritance)
public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString() + ", School: " + school;
    }
}

// Employee.java (Multilevel Inheritance)
public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + company;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Person person = new Person("John Doe", 30);
        Student student = new Student("Jane Smith", 20, "ABC University");
        Employee employee = new Employee("Alice Johnson", 35, "XYZ Corporation");

        // Displaying information
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);

        // Casting example
        Person personFromStudent = student; // Casting from Student to Person
        System.out.println("Casted Person: " + personFromStudent);
    }
}

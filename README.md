# Midterm Java 📝✨

## ภาพรวม 💻🌟

โครงการนี้แสดงแนวคิดหลักของการเขียนโปรแกรมเชิงวัตถุ (OOP) ในภาษา Java โดยมุ่งเน้นที่การใช้คลาส, อ็อบเจ็กต์, คอนสตรัคเตอร์ และการสืบทอด (Inheritance) โครงการนี้รวมตัวอย่างการใช้การสืบทอดแบบเดียว, แบบหลายระดับ และแบบเชิงลำดับ รวมถึงการใช้ตัวแก้ไขการเข้าถึง (`private`, `public`, และ `protected`) คลาสหลักในโครงการประกอบด้วย `Person` และ `Main` ที่แสดงการห่อหุ้มข้อมูล (encapsulation) ด้วย getter และ setter methods รวมถึงการใช้แนวคิดการแคสติ้ง (casting)

---

## แนวคิดที่ครอบคลุม 📚🔍

### 1. **Class & Object** 🏫
   - คลาสคือแม่แบบที่ใช้ในการสร้างอ็อบเจ็กต์ (อินสแตนซ์) และอ็อบเจ็กต์คือสิ่งที่แสดงถึงข้อมูลที่เป็นตัวตนจริง
   - ตัวอย่าง: คลาส `Person` แสดงถึงคนที่มีข้อมูล เช่น ชื่อและอายุ

### 2. **Constructor** 🛠️
   - คอนสตรัคเตอร์คือเมธอดพิเศษที่ใช้ในการกำหนดค่าเริ่มต้นให้กับอ็อบเจ็กต์
   - ตัวอย่าง: คอนสตรัคเตอร์ที่ใช้ในคลาส `Person` เพื่อกำหนดค่าเริ่มต้นของชื่อและอายุ

### 3. **Getter & Setter Methods** 🔑
   - การห่อหุ้มข้อมูล (encapsulation) จะทำได้โดยการใช้ getter และ setter methods เพื่อเข้าถึงหรือแก้ไขฟิลด์ที่เป็น `private`
   - ตัวอย่าง: เมธอด `getName()` และ `setName()` ในคลาส `Person`

### 4. **Casting concept** 🔄
   - การแคสติ้งช่วยให้สามารถแปลงข้อมูลจากประเภทหนึ่งไปยังอีกประเภทหนึ่ง
   - ตัวอย่าง: การแคสติ้งระหว่างประเภทต่างๆ ในการสืบทอด

### 5. **Inheritance** 🌳
   - **Single Inheritance**: คลาสสามารถสืบทอดจากคลาสพ่อแม่เพียงคลาสเดียว
   - **Multilevel Inheritance**: คลาสหนึ่งสามารถสืบทอดจากคลาสอีกตัวที่เป็นลูกของคลาสพ่อแม่
   - **Hierarchical Inheritance**: หลายคลาสสามารถสืบทอดจากคลาสพ่อแม่เดียวกัน
   - ตัวอย่าง: คลาส `Student` สืบทอดจากคลาส `Person` และคลาส `Employee` สืบทอดจากคลาส `Person`

### 6. **Access Modifiers** 🚪
   - **Private**: จำกัดการเข้าถึงเฉพาะภายในคลาสเดียวกัน
   - **Public**: สามารถเข้าถึงได้จากคลาสใดก็ได้
   - **Protected**: สามารถเข้าถึงได้ในแพ็คเกจเดียวกันหรือจากคลาสลูก
   - ตัวอย่าง: `private int age`, `public String name`, `protected String address`

---

## ไฟล์ที่รวมอยู่ 📂

- `Person.java`: ประกอบด้วยคลาส `Person` ที่มีฟิลด์เป็น `private`, คอนสตรัคเตอร์, getter และ setter methods
- `Main.java`: แสดงการใช้งานคลาส, อ็อบเจ็กต์, การสืบทอด และการแคสติ้ง

---

## ตัวอย่างโค้ด 🖥️💡

```java
// Person.java
public class Person {
    private String name;
    private int age;

    // คอนสตรัคเตอร์
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter และ Setter methods
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
        // สร้างอ็อบเจ็กต์
        Person person = new Person("John Doe", 30);
        Student student = new Student("Jane Smith", 20, "ABC University");
        Employee employee = new Employee("Alice Johnson", 35, "XYZ Corporation");

        // แสดงข้อมูล
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);

        // ตัวอย่างการแคสติ้ง
        Person personFromStudent = student; // การแคสจาก Student ไปเป็น Person
        System.out.println("Casted Person: " + personFromStudent);
    }
}

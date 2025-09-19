package javaIntro;// File: OOPExample.java
import java.util.Objects;

// -------------------- 1. Class, Object, Constructor --------------------
class Person {
    private String name;   // Encapsulation: private field
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Setter (Encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    // Overriding toString() from Object class
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Overriding equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same reference
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

// -------------------- 2. Inheritance & Polymorphism --------------------
class Student extends Person {
    private String course;

    // Constructor (calls parent constructor with super)
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Method overriding (Polymorphism)
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', course='" + course + "'}";
    }
}

// -------------------- 3. Abstraction & Interfaces --------------------
// Abstract class
abstract class Shape {
    abstract double area(); // abstract method
}

// Concrete class extending abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Interface
interface Drawable {
    void draw();
}

// Class implementing interface
class Square extends Shape implements Drawable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

// -------------------- 4. Main Class to Run --------------------
public class objectBasic {
    public static void main(String[] args) {
        // Objects & Constructors
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);

        // Encapsulation with getters/setters
        System.out.println(p1.getName());
        p1.setName("Alicia");
        System.out.println("Updated name: " + p1.getName());

        // equals, hashCode, toString
        System.out.println(p1.toString());
        System.out.println("p1 equals p2? " + p1.equals(p2));
        System.out.println("p1 hashCode: " + p1.hashCode());

        // Inheritance & Polymorphism
        Person student = new Student("Bob", 20, "Computer Science");
        System.out.println(student.toString()); // Polymorphism: Student's toString() runs

        // Abstraction & Interfaces
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Drawable drawableSquare = (Drawable) square;

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
        drawableSquare.draw(); // interface method
    }
}

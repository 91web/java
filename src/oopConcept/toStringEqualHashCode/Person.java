package oopConcept.toStringEqualHashCode;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private double height;
    private String complexion;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setComplexion(String complexion){
        this.complexion = complexion;
    }

    public String getComplexion(){
        return this.complexion;
    }

    public String toString(){
        return "Person's name: " + name + ", age is: " + age;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }

    public static void main(String[] args){
        Person yusuf1 = new Person("Yusuf", 20);
        Person yusuf2 = new Person("Yusuf", 20);
        Person fodio = new Person("fodio", 25);

//    System.out.println(yusuf1);
//    System.out.println(fodio);
        System.out.println(yusuf1.equals(yusuf2));
    }
}

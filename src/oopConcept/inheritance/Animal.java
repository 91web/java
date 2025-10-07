package oopConcept.inheritance;

public class Animal {

  private final String name;

  public Animal(String name){
    this.name = name;
  }

  public void eat(){
    System.out.println(name + " is eating");
  }

  public void sleep(){
    System.out.println(name + " is sleeping");
  }

  public void move(){
    System.out.println(name + " is moving");
  }

}

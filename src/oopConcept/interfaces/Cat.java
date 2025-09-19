package oopConcept.interfaces;

public class Cat implements AnimalInterface{

  private String name;

  public Cat(String name){
    this.name = name;
  }

  @Override
  public void sound(){
    System.out.println(name + " is a cat and it makes a meow sound");
  }

  @Override
  public void move(){
    System.out.println(name + " is a cat and it walks and runs");
  }
}

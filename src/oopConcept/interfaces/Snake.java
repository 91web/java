package oopConcept.interfaces;

public class Snake implements AnimalInterface{

  private String name;

  public Snake(String name){
    this.name = name;
  }

  @Override
  public void sound() {
    System.out.println(name + " is a snake ant it hisses");
  }

  @Override
  public void move() {
    System.out.println(name + " is a snake and it crawls");
  }
}

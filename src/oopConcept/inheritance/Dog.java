package oopConcept.inheritance;

public class Dog extends Animal{

  public Dog(String name){
    super(name);
  }

  public void eat(){
    super.eat();
  }

  public void move(){
    super.move();
    System.out.println("The animal also has the ability to run");
  }

  public static void main(String[] args){
    Animal goat = new Animal("Goat");
    Dog dog1 = new Dog("bingo");
    goat.eat();
    dog1.eat();
    goat.move();
    dog1.move();
  }
}

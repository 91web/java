package oopConcept.interfaces;

public class Main {

  public static void main(String[] args){
    Cat cat = new Cat("tom");
    cat.sound();
    cat.move();

    Snake snake = new Snake("python");
    snake.sound();
    snake.move();
  }
}

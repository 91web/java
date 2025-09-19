package oopConcept.abstarct_classes;

public class Main {

  public static void main(String[] args){

    Square sq = new Square(5.0);
    Rectangle rectangle = new Rectangle(3.0, 4.0);

    System.out.println("Square Details");
    sq.printShapeDetails();
    System.out.println("Rectangle Details");
    rectangle.printShapeDetails();
  }
}

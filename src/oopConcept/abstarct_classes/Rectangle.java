package oopConcept.abstarct_classes;

public class Rectangle extends Shape{

  private final double length;
  private final double breadth;


  //constructor
  public Rectangle(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public double getArea() {
    return length * breadth;
  }

  @Override
  public double getPerimeter() {
    return (length + breadth) * 2;
  }

}

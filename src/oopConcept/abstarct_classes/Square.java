package oopConcept.abstarct_classes;

public class Square extends Shape{

  private final double length;

  //constructor
  public Square(double length){
    this.length = length;
  }

  @Override
  public double getArea() {
    return length * length;
  }

  @Override
  public double getPerimeter() {
    return length * 4;
  }


}

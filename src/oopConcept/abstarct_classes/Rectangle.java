package oopConcept.abstarct_classes;

public class Rectangle extends Shape{

  private double length;
  private double breadth;

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

  public void printShapeDetails(){
    System.out.println("Area is " + getArea());
    System.out.println("Perimeter is " + getPerimeter());
  }
}

package oopConcept.abstarct_classes;

public class Square extends Shape{

  private double length;

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

  public void printShapeDetails(){
    System.out.println("Area is " + getArea());
    System.out.println("Perimeter is " + getPerimeter());
  }
}

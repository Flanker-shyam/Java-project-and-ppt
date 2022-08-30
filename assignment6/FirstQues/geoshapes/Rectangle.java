package geoshapes;

public class Rectangle {

  double length;
  double breadth;

  public Rectangle(double l, double b) {
    length = l;
    breadth = b;
  }

  public double areaOfReactangle() {
    double area = this.length * this.breadth;
    return area;
  }

  public double perimeterOfReactangle() {
    double peri = 2 * (this.length + this.breadth);
    return peri;
  }
}

package geoshapes;

public class Circle {

  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double areaOfCircle() {
    double area = 3.14 * this.radius * this.radius;
    return area;
  }

  public double perimeterOfCircle() {
    double peri = 2 * 3.14 * this.radius;
    return peri;
  }
}

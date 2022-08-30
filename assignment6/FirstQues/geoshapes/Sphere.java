package geoshapes;

import java.math.*;

public class Sphere {

  double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  public double areaOfSphere() {
    double area = 4 * 3.14 * this.radius * this.radius;
    return area;
  }

  public double perimeterOfSphere() {
    double peri = 2 * 3.14 * this.radius;
    return peri;
  }
}

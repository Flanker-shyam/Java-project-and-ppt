package geoshapes;

import java.math.*;

public class Triangle {

  double a, b, c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double areaOfTriangle() {
    double s = (a + b + c) / 2;

    double area = s * (s - a) * (s - b) * (s - c);
    area = Math.sqrt(area);
    return area;
  }

  public double perimeterOfTriangle() {
    double peri = (a + b + c);
    return peri;
  }
}

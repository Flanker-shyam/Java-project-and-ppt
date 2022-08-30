import geoshapes.*;
import java.util.*;

public class Ques1 {

  public static void main(String args[]) {
    Circle circle = new Circle(3.5);
    Rectangle rectangle = new Rectangle(4, 9);
    Triangle triangle = new Triangle(13, 12, 5);
    Sphere sphere = new Sphere(5.7);

    System.out.println("Area of Circle is : " + circle.areaOfCircle());
    System.out.println(
      "Perimeter of Circle is : " + circle.perimeterOfCircle()
    );
    System.out.println(
      "Area of Rectangle is : " + rectangle.areaOfReactangle()
    );
    System.out.println(
      "Perimeter of Rectangle is : " + rectangle.perimeterOfReactangle()
    );
    System.out.println("Area of Triangle is : " + triangle.areaOfTriangle());

    System.out.println(
      "Perimeter of Triangle is : " + triangle.perimeterOfTriangle()
    );
    System.out.println("Area of Sphere is : " + sphere.areaOfSphere());

    System.out.println(
      "Perimeter of Sphere is : " + sphere.perimeterOfSphere()
    );
  }
}

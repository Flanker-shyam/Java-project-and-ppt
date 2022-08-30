import coordinates.*;
import java.util.*;

public class Ques2 {

  public static void main(String args[]) {
    Cartesian cartesian = new Cartesian(4, 7);
    Polar polar = new Polar(4, 8.9);

    cartesian.toPolar();
    polar.toCartesian();
  }
}

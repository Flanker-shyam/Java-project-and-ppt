import java.util.*;

class UserVerySmallNumException extends Exception {

  private String message;

  UserVerySmallNumException(String message) {
    this.message = message;
  }

  public String toString() {
    return "UserVerySmallNumException {" + message + "} ";
  }
}

class Ques2 {

  public static void main(String args[]) {
    double a, b;
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter Two Numbers");
    a = myInput.nextDouble();
    b = myInput.nextDouble();
    double c = a / b;
    try {
      if (c < 0.000001) {
        throw new UserVerySmallNumException("Result Is too small");
      }
      System.out.println("Result =" + c);
    } catch (UserVerySmallNumException smallExp) {
      System.out.println(smallExp);
    }
  }
}

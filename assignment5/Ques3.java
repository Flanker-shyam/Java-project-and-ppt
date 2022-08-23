import java.lang.*;
import java.util.*;

class UserNumericString extends Exception {

  private String errorMessage;

  UserNumericString(String message) {
    errorMessage = message;
  }

  public String toString() {
    return "UserNumeric [" + errorMessage + "]";
  }
}

public class Ques3 {

  public static void main(String args[]) {
    String str;
    System.out.println("Enter a String");

    Scanner myInput = new Scanner(System.in);

    str = myInput.next();

    try {
      for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
          throw new UserNumericString("A digit is present in the String");
        }
      }
      System.out.println("Enter String is: " + str);
    } catch (UserNumericString numericString) {
      System.out.println(numericString);
    }
  }
}

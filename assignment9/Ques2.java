import java.util.*;

class loginUser {

  HashMap<String, String> map;

  loginUser() {
    map = new HashMap<>();
  }

  void sign_Up() {
    System.out.println("enter your login id and password");
    Scanner in = new Scanner(System.in);
    String id = in.next();
    String password = in.next();
    map.put(id, password);
    System.out.println("succesfully sign in");
  }

  void log_In() {
    System.out.println("enter your login id and password");
    Scanner in = new Scanner(System.in);
    String i = in.next();
    String p = in.next();
    if (map.containsKey(i) && p.equals(map.get(i))) {
      System.out.println("succesfully login");
    } else System.out.println("please enter valid id or password");
  }
}

public class Ques2 {

  public static void main(String args[]) {
    loginUser user = new loginUser();
    boolean f = true;
    while (f) {
      System.out.println(
        "please choose valid option \n 1: login 2: sigUp 3: exit"
      );
      Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      switch (c) {
        case 1:
          user.log_In();
          break;
        case 2:
          user.sign_Up();
          break;
        case 3:
          f = false;
          break;
        default:
          System.out.println("please enter valid option");
      }
    }
  }
}

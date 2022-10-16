import java.sql.Struct;
import java.util.*;

//AuthenticateUser class that keeps the signup and login classes.
//user cam register and login as per the need to interact with the real world application
//We can integrate this auithentication system in any management kind of application.

class authenticateUser {

  HashMap<String, String> map;

  authenticateUser() {
    map = new HashMap<>();
  }

  //Sign_up class

  void sign_Up() {
    int check = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("New User? Enter your Registration details");
    System.out.println(
      "If already a user, press 1 to login else 0 to continue"
    );
    check = in.nextInt();

    if (check == 0) {
      System.out.println("Enter First Name");
      String fname = in.next();

      System.out.println("Enter your Last Name");
      String lname = in.next();

      System.out.println("create a User Id");
      String userId = in.next();

      System.out.println("Create a Password");
      String fpass = in.next();

      System.out.println("Confirm your Password");
      String cpass = in.next();

      if (fpass.equals(cpass)) {
        map.put(userId, fpass);
        System.out.println("succesfully sign in");
      } else {
        sign_Up();
      }
    } else if (check == 1) {
      log_In();
    }
  }

  // log_in class

  int log_In() {
    int check = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your login details");
    System.out.println("New User? , press 1 to signup or 0 to continue");
    check = in.nextInt();
    if (check == 0) {
      System.out.println("Enter your userId");
      String userId = in.next();

      System.out.println("Enter your Password");
      String pass = in.next();

      if (map.containsKey(userId) && pass.equals(map.get(userId))) {
        System.out.println("succesfully login");
        return 1;
      } else System.out.println("please enter valid userId or Password");
    } else if (check == 1) {
      sign_Up();
    }
    return 0;
  }
}

//Main class of the file

public class LoginSystem {

  public static void main(String args[]) {
    authenticateUser user = new authenticateUser();
    boolean f = true;

    System.out.println("Welcome to the Card Game");
    while (f) {
      System.out.println(
        "please choose valid option \n 1: login 2: sigUp 3: exit"
      );
      Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      switch (c) {
        case 1:
          int n = user.log_In();
          if (n == 1) {
            String input;
            char reDo;
            Scanner newInput = new Scanner(System.in);
            Random random = new Random();
            int card1 = random.nextInt(10) + 1;
            int card2 = random.nextInt(10) + 1;
            int card = random.nextInt(10) + 1;
            int total1 = card1 + card2;
            int total2 = total1 + card;

            System.out.print("First cards: " + card1 + ", " + card2 + "\n");
            System.out.print("Total: " + total1 + "\n");

            boolean loop = true;
            while (loop) {
              System.out.print("Do you want another card? (y/n): ");
              input = newInput.nextLine();
              reDo = input.charAt(0);
              if (reDo == 'y' || reDo == 'Y') {
                System.out.print("Card: " + card + "\n");
                System.out.print("Total: " + total2 + "\n");
              } else if (reDo == 'n' || reDo == 'N') {
                loop = false;
              }
            }
          }
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

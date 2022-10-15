import java.util.*;

class ticketBooking {

  ArrayList<String> tickets;
  int max;

  ticketBooking(int max) {
    this.tickets = new ArrayList<>();
    this.max = max;
  }

  void bookTicket() {
    if (this.tickets.size() >= this.max) {
      System.out.println("no ticket available");
    } else {
      System.out.println("enter name of the passenger");
      Scanner in = new Scanner(System.in);
      String name = in.next();
      tickets.add(name);
      System.out.println("ticket booked");
    }
  }

  void cancelTicket() {
    System.out.println(
      "enter name of the passenger whose ticket you want to cancel"
    );
    Scanner in = new Scanner(System.in);
    int index = -1;
    String name = in.next();
    for (int j = 0; j < this.tickets.size(); j++) {
      String t = tickets.get(j);
      if (name.equals(t) == true) {
        tickets.remove(j);
        index = j;
        break;
      }
    }
    if (index == -1) System.out.println(
      "no data found \n please enter valid name "
    ); else System.out.println("ticket canceled");
  }

  void ticketleft() {
    int ans = max - tickets.size();
    System.out.println("ticket left : " + ans);
  }
}

public class Ques1 {

  public static void main(String args[]) {
    ticketBooking tb = new ticketBooking(10);
    boolean f = true;
    while (f) {
      System.out.println(
        "please choose valid option \n 1: bookticket 2: cancelticket 3: ticketleft 4:exit "
      );
      Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      switch (c) {
        case 1:
          tb.bookTicket();
          break;
        case 2:
          tb.cancelTicket();
          break;
        case 3:
          tb.ticketleft();
          break;
        case 4:
          f = false;
          break;
        default:
          System.out.println("please enter valid option");
      }
    }
  }
}

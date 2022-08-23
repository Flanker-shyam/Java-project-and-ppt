import java.util.*;

class Bus {

  int regdno;
  String model;
  int capacity;

  Bus() {
    regdno = 0;
    model = "NIL";
    capacity = 0;
  }

  Bus(int regdno, String model, int capacity) {
    this.regdno = regdno;
    this.model = model;
    this.capacity = capacity;
    System.out.println("Bus Class Constructor is called");
  }

  void showbusdetails() {
    System.out.println(
      "Details of bus are = Registration Number : " +
      this.regdno +
      "\nModel : " +
      this.model +
      "/nCapacity : " +
      this.capacity
    );
  }
}

class publicBus extends Bus {

  String owner;
  String from, to;
  String depttime, arrivaltime;

  publicBus(
    int regdno,
    String model,
    int capacity,
    String owner,
    String from,
    String to,
    String depttime,
    String arrivaltime
  ) {
    super(regdno, model, capacity);
    this.owner = owner;
    this.from = from;
    this.to = to;
    this.depttime = depttime;
    this.arrivaltime = arrivaltime;
    System.out.println("publicBus class Constructor is called");
  }

  void showbusdetails() {
    System.out.println(
      "Details of bus are = Registration Number : " +
      this.regdno +
      "\nModel : " +
      this.model +
      "/nCapacity : " +
      this.capacity
    );
    System.out.println(
      "Owner of bus : " +
      this.owner +
      "\nStarts from: " +
      this.from +
      "\nDestination : " +
      this.to +
      "\nDeparture Time : " +
      this.depttime +
      "\nArrival Time : " +
      this.arrivaltime
    );
  }
}

class LuxuryPublicBus extends publicBus {

  String isAC;
  String isWifi;
  int noofsleeperseat;

  LuxuryPublicBus(
    int regdno,
    String model,
    int capacity,
    String owner,
    String from,
    String to,
    String depttime,
    String arrivaltime,
    String isAC,
    String isWifi,
    int noofsleeperseat
  ) {
    super(regdno, model, capacity, owner, from, to, depttime, arrivaltime);
    this.isAC = isAC;
    this.isWifi = isWifi;
    this.noofsleeperseat = noofsleeperseat;
    System.out.println("LuxuryPublicBus class constructor is called");
  }

  void showbusdetails() {
    System.out.println(
      "Details of bus are = Registration Number : " +
      this.regdno +
      "\nModel : " +
      this.model +
      "\nCapacity : " +
      this.capacity
    );
    System.out.println(
      "Owner of bus : " +
      this.owner +
      "\nStarts from: " +
      this.from +
      "\nDestination : " +
      this.to +
      "\nDeparture Time : " +
      this.depttime +
      "\nArrival Time : " +
      this.arrivaltime
    );
    System.out.println(
      "AC Available : " +
      this.isAC +
      "\nWifi Available: " +
      this.isWifi +
      "\nNo. of Sleeper Seats : " +
      this.noofsleeperseat
    );
  }
}

public class Ques3 {

  public static void main(String args[]) {
    int regdno;
    String model;
    int capacity;
    String owner;
    String from, to;
    String depttime, arrivaltime;
    String isAC;
    String isWifi;
    int noofsleeperseat;

    Scanner myInput = new Scanner(System.in);

    System.out.println("Enter details of the bus: ");
    System.out.println("Enter Regisration Number : ");
    regdno = myInput.nextInt();
    System.out.println("Enter Model number: ");
    model = myInput.next();
    System.out.println("Enter Capacity");
    capacity = myInput.nextInt();
    System.out.println("Enter Owner name: ");
    owner = myInput.next();
    System.out.println("Enter Source place: ");
    from = myInput.next();
    System.out.println("Enter Destination place");
    to = myInput.next();
    System.out.println("Enter Deprature Time: ");
    depttime = myInput.next();
    System.out.println("Enter Arrival Time: ");
    arrivaltime = myInput.next();
    System.out.println("Is AC Available: ");
    isAC = myInput.next();
    System.out.println("Enter Wifi Available: ");
    isWifi = myInput.next();
    System.out.println("Enter Number of Sleeper Seats: ");
    noofsleeperseat = myInput.nextInt();

    LuxuryPublicBus lbus = new LuxuryPublicBus(
      regdno,
      model,
      capacity,
      owner,
      to,
      from,
      depttime,
      arrivaltime,
      isAC,
      isWifi,
      noofsleeperseat
    );

    lbus.showbusdetails();
    Bus bus = new Bus();
    bus = lbus;
    bus.showbusdetails();
  }
}

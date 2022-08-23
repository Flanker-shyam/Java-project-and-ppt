import java.util.*;

abstract class Account {

  String accno;
  String name;
  double balance;

  Account(String accno, String name, double balance) {
    this.accno = accno;
    this.name = name;
    this.balance = balance;
  }

  abstract void displayBalance();

  abstract void Deposite();

  abstract void Withdraw();
}

class SavingAccount extends Account {

  String type;
  double interest_rate;

  SavingAccount(
    String accno,
    String name,
    double balance,
    String type,
    double interestRate
  ) {
    super(accno, name, balance);
    this.type = type;
    this.interest_rate = interestRate;
  }

  void displayBalance() {
    System.out.println(balance);
  }

  void Deposite() {
    double deposite;
    System.out.println("Enter Amount to be deposited: ");
    Scanner myInput = new Scanner(System.in);
    deposite = myInput.nextInt();

    this.balance = this.balance + deposite;
  }

  void Withdraw() {
    double withdraw;
    System.out.println("Enter Amount to be Withdrawn: ");
    Scanner myInput = new Scanner(System.in);
    withdraw = myInput.nextInt();

    this.balance = this.balance - withdraw;
  }

  void calculateIntereset(int period) {
    double interest = (balance * period * interest_rate) / 100;
    System.out.println(
      "Interest on your Saving bank account balance is: " + interest
    );
  }
}

class CurrentAccount extends Account {

  String type;
  double interest_rate;

  CurrentAccount(
    String accno,
    String name,
    double balance,
    String type,
    double interestRate
  ) {
    super(accno, name, balance);
    this.type = type;
    this.interest_rate = interestRate;
  }

  void displayBalance() {
    System.out.println(balance);
  }

  void Deposite() {
    double deposite;
    System.out.println("Enter Amount to be deposited: ");
    Scanner myInput = new Scanner(System.in);
    deposite = myInput.nextInt();

    this.balance = this.balance + deposite;
  }

  void Withdraw() {
    double withdraw;
    System.out.println("Enter Amount to be Withdrawn: ");
    Scanner myInput = new Scanner(System.in);
    withdraw = myInput.nextInt();

    this.balance = this.balance - withdraw;
  }

  void calculateIntereset(int period) {
    double interest = (balance * period * interest_rate) / 100;
    System.out.println(
      "Interest on your Saving bank account balance is: " + interest
    );
  }
}

public class Ques2 {

  public static void main(String args[]) {
    String accno, name, type;
    double balance;
    double interestRate;

    System.out.println("Enter your Account details: ");
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter your Account Number: ");
    accno = myInput.next();
    System.out.println("Enter your Name ");
    name = myInput.next();
    System.out.println("Enter your Account type (saving/current): ");
    type = myInput.next();
    System.out.println("Enter your Account Balance: ");
    balance = myInput.nextDouble();
    System.out.println("Enter your Interset Rate: ");
    interestRate = myInput.nextDouble();

    // System.out.println(type);

    if (type.equals("saving")) {
      SavingAccount svAccount = new SavingAccount(
        accno,
        name,
        balance,
        type,
        interestRate
      );

      int choice;
      do {
        System.out.println("Enter Your Choice :");
        System.out.println(
          "1. Deposite Amount \n2. Withdraw Amount \n3. Calculate Interest \n4. Display Balance\n5. Exit"
        );
        choice = myInput.nextInt();

        switch (choice) {
          case 1:
            {
              svAccount.Deposite();
              break;
            }
          case 2:
            {
              svAccount.Withdraw();
              break;
            }
          case 3:
            {
              System.out.println("Enter Time period in years");
              int time;
              time = myInput.nextInt();
              svAccount.calculateIntereset(time);
              break;
            }
          case 4:
            {
              svAccount.displayBalance();
              break;
            }
          default:
            {
              System.out.println("Enter correct choice");
            }
        }
      } while (choice != 5);
    } else if (type.equals("current")) {
      CurrentAccount currAccount = new CurrentAccount(
        accno,
        name,
        balance,
        type,
        interestRate
      );

      int choice;
      do {
        System.out.println("Enter Your Choice :");
        System.out.println(
          "1. Deposite Amount \n2. Withdraw Amount \n3. Calculate Interest \n4. Display Balance \n5. Exit"
        );
        choice = myInput.nextInt();

        switch (choice) {
          case 1:
            {
              currAccount.Deposite();
              break;
            }
          case 2:
            {
              currAccount.Withdraw();
              break;
            }
          case 3:
            {
              System.out.println("Enter Time period in years");
              int time;
              time = myInput.nextInt();
              currAccount.calculateIntereset(time);
              break;
            }
          case 4:
            {
              currAccount.displayBalance();
              break;
            }
          default:
            {
              System.out.println("Enter correct choice");
            }
        }
      } while (choice != 4);
    } else {
      System.out.println("Me not working");
    }
  }
}

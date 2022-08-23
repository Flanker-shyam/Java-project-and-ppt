import java.util.*;

class Battery {
    double level;

    Battery() {
        level = 100;
    }

    void showLevel() {
        System.out.println("Current Battery level = " + this.level);
    }

    void sendMsg() {
        this.level = this.level - 2;
    }

    void recvMsg() {
        this.level = this.level - 1;
    }

    void compute() {
        this.level = this.level - 1.5;
    }

    void recharge(double minutes) {
        this.level = this.level + minutes / 2;
        if(this.level > 100)
        {
            this.level =100;
        }
    }
}

public class Ques2 {
    public static void main(String args[]) {
        Battery battery = new Battery();

        Scanner newInput = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1.Send Message\n2.Recieve Message\n3.Compute\n4.Reacharge\n5.Show Level\n6.Exit");
            System.out.println("Enter Choice");

            choice = newInput.nextInt();

            switch (choice) {
                case 1: {
                    battery.sendMsg();
                    break;
                }
                case 2: {
                    battery.recvMsg();
                    break;
                }
                case 3: {
                    battery.compute();
                    break;
                }
                case 4: {
                    int minutes;
                    System.out.println("Enter minutes of recharge");
                    minutes = newInput.nextInt();
                    battery.recharge(minutes);
                }
                case 5: {
                    battery.showLevel();
                }
                default: {
                    System.out.println("Enter a valid choice");
                }
            }
        } while (choice != 6);

        newInput.close();
    }
}

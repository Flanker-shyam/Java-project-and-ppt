
import java.util.*;

class Time {
    private int hour;
    int min;
    int sec;

    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    Time(byte h, byte m, byte s) {
        hour = h;
        min = m;
        sec = s;
    }

    void setTime(byte h, byte m, byte s) {
        hour = h;
        min = m;
        sec = s;
    }

    void addTime(Time time1, Time time2) {
        int h = time1.hour + time2.hour;
        int m = time1.min + time2.min;
        int s = time1.sec + time2.sec;

        if (s > 59) {
            s = s % 60;
            m = m + 1;
        }
        if (m > 59) {
            m = m % 60;
            h = h + 1;
        }
        if (h > 23) {
            h = h % 24;
        }

        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    void subtractTime(Time time1, Time time2) {
       int s1 = time1.sec+time1.min*60 + time1.hour*3600;
       int s2 = time2.sec+time2.min*60 + time2.hour*3600;

       int diff = Math.abs(s1-s2);
       this.hour = diff/3600;
       diff = diff%3600;
       this.min = diff/60;
       diff = diff%60;
       this.sec = diff;
    }

    int toSecond() {
        int sec = this.hour * 3600 + this.min * 60 + this.sec;
        return sec;
    }

    int toHours() {
        int hrs = this.sec / 3600 + this.min / 60 + this.hour;
        return hrs;
    }

    void showTime() {
        System.out.println("Time is: " + this.hour + ":" + this.min + ":" + this.sec);
    }
}

public class Ques1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;
        
        do {
            System.out.println("\n1.Add Time\n2.Subtract Time\n3.Convert to seconds\n4.Convert of Hours\n5.Exit");
            System.out.println("Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    byte hh, mm, ss;
                    Time time1 = new Time();
                    Time time2 = new Time();

                    System.out.println("Enter first time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();

                    time1.setTime(hh, mm, ss);

                    System.out.println("Enter second time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();
                    time2.setTime(hh, mm, ss);
                    Time time3 = new Time();

                    time3.addTime(time1, time2);
                    System.out.println("Total time after Addition is: ");
                    time3.showTime();
                    break;
                }
                case 2: {
                    byte hh, mm, ss;
                    Time time1 = new Time();
                    Time time2 = new Time();

                    System.out.println("Enter first time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();

                    time1.setTime(hh, mm, ss);

                    System.out.println("Enter second time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();
                    time2.setTime(hh, mm, ss);

                    Time time3 = new Time();

                    time3.subtractTime(time1, time2);
                    System.out.println("Total time after Subtraction is: ");
                    time3.showTime();
                    break;
                }
                case 3: {
                    byte hh, mm, ss;
                    Time time1 = new Time();

                    System.out.println("Enter first time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();

                    time1.setTime(hh, mm, ss);
                    time1.toSecond();
                    System.out.println("Total time in seconds is: " + time1.toSecond());
                    break;
                }
                case 4: {
                    byte hh, mm, ss;
                    Time time1 = new Time();

                    System.out.println("Enter first time hour, min, sec");
                    hh = sc.nextByte();
                    mm = sc.nextByte();
                    ss = sc.nextByte();

                    time1.setTime(hh, mm, ss);
                    time1.toHours();
                    System.out.println("Total time in hours is: " + time1.toHours());
                    break;
                }
                default: {
                    System.out.println("Enter a valid choice");
                }
            }
        } while (choice != 5);

        sc.close();
    }
}
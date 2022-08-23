import java.util.*;

class MyByte {
    byte newbyte;

    MyByte() {
        newbyte = 0;
    }

    MyByte(byte value) {
        newbyte = value;
    }

    void andOp(MyByte value1, MyByte value2) {
        this.newbyte = (byte) ((value1.newbyte) & (value2.newbyte));
    }

    void orOp(MyByte value1, MyByte value2) {
        this.newbyte = (byte) ((value1.newbyte) | (value2.newbyte));
    }

    void xorOp(MyByte value1, MyByte value2) {
        this.newbyte = (byte) ((value1.newbyte) ^ (value2.newbyte));
    }

    void compliment(MyByte value1) {
        this.newbyte = (byte) (~value1.newbyte);
    }

    void showAnswer() {
        System.out.println("NUmber is=  " + this.newbyte);
    }
    // void mask(MyByte value1)
    // {

    // }
}

public class Ques3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1.And Operation \n2.OR Operation\n3.XOR Operation\n4.Compliment\n5.Exit");
            System.out.println("Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter first Number");
                    byte num1 = sc.nextByte();
                    MyByte newNum1 = new MyByte(num1);

                    System.out.println("Enter second Number");
                    byte num2 = sc.nextByte();
                    MyByte newNum2 = new MyByte(num2);choice = sc.nextInt();

                    MyByte ans = new MyByte();
                    ans.andOp(newNum1, newNum2);
                    ans.showAnswer();
                    break;
                }
                case 2: {
                    System.out.println("Enter first Number");
                    byte num1 = sc.nextByte();
                    MyByte newNum1 = new MyByte(num1);

                    System.out.println("Enter second Number");
                    byte num2 = sc.nextByte();
                    MyByte newNum2 = new MyByte(num2);

                    MyByte ans = new MyByte();
                    ans.orOp(newNum1, newNum2);
                    ans.showAnswer();
                    break;
                }
                case 3: {
                    System.out.println("Enter first Number");
                    byte num1 = sc.nextByte();
                    MyByte newNum1 = new MyByte(num1);

                    System.out.println("Enter second Number");
                    byte num2 = sc.nextByte();
                    MyByte newNum2 = new MyByte(num2);

                    MyByte ans = new MyByte();
                    ans.xorOp(newNum1, newNum2);
                    ans.showAnswer();
                    break;
                }
                case 4: {
                    System.out.println("Enter a Number");
                    byte num1 = sc.nextByte();
                    MyByte newNum1 = new MyByte(num1);
                    MyByte ans = new MyByte();
                    ans.compliment(newNum1);
                    ans.showAnswer();
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

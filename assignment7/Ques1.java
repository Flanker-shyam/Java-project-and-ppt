import static java.lang.Thread.sleep;

import java.util.Scanner;

class PrintAtoZ implements Runnable {

  Thread t;

  PrintAtoZ() {
    t = new Thread(this, "Print A to Z");
    t.start();
  }

  public void run() {
    try {
      for (char i = 'a'; i <= 'z'; i++) System.out.println(i);
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Ques1 {

  public static void main(String[] args) {
    new PrintAtoZ();
  }
}

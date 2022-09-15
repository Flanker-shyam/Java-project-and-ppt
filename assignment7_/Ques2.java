import java.util.*;

class newThread implements Runnable {

  Thread t;
  int n;

  newThread(int priority, int n) {
    t = new Thread(this, "child Thread" + n);
    t.setPriority(priority);
    t.start();
    this.n = n;
  }

  public void run() {
    try {
      for (int i = 1; i <= n; i++) {
        System.out.println(t.getName() + ": " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Ques2 {

  public static void main(String args[]) {
    int p1 = 10, p2 = 5;
    int n1 = 5, n2 = 10;
    new newThread(p1, n1);
    new newThread(p2, n2);
  }
}

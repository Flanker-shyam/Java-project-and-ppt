import java.util.*;

class NewThread implements Runnable {

  Thread t;

  NewThread() {
    t = new Thread(this, "ChildThread");
    t.start();
  }

  public void run() {
    try {
      for (char i = 'a'; i <= 'z'; i++) {
        System.out.println("Chars: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Ques1 {

  public static void main(String args[]) {
    new NewThread();
  }
}

import java.util.*;

class Inventory {

  int stockItem = 0;

  Inventory() {
    stockItem = 0;
  }

  synchronized void AddStockItem() {
    System.out.println("Item Added to the stock");
    stockItem++;
  }

  synchronized void removeStockItem() {
    if (stockItem == 0) {
      System.out.println("Inventory is Empty");
    } else {
      System.out.println("Item removed from the stock");
      stockItem--;
    }
  }
}

class addStock implements Runnable {

  Thread t;
  int n;
  Inventory inventory;

  addStock(int n, Inventory inventory) {
    t = new Thread(this, "Demo");
    this.n = n;
    this.inventory = inventory;
    t.start();
  }

  public void run() {
    try {
      for (int i = 0; i <= n; i++) {
        inventory.AddStockItem();
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class RemoveStock implements Runnable {

  Thread t;
  int n;
  Inventory inventory;

  RemoveStock(int n, Inventory inventory) {
    t = new Thread(this, "Demo");
    this.n = n;
    this.inventory = inventory;
    t.start();
  }

  public void run() {
    try {
      for (int i = 0; i <= n; i++) {
        inventory.removeStockItem();
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Ques3 {

  public static void main(String args[]) {
    Inventory inventory = new Inventory();
    new addStock(10, inventory);
    new RemoveStock(10, inventory);
  }
}

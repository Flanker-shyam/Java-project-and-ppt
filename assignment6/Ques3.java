import java.util.*;

interface LinearDS {
  int MAXSIZE = 5;
  void add(int num);
  int remove();
  void displayElement();
}

class MyStack implements LinearDS {

  int top = -1;
  int stack[] = new int[MAXSIZE];

  boolean isFull() {
    if (top == MAXSIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (top == -1) {
      return true;
    }
    return false;
  }

  public void add(int num) {
    if (isFull()) {
      System.out.println("Stack overflow");
    } else {
      top++;
      stack[top] = num;
    }
  }

  public int remove() {
    int removed = -1;
    if (isEmpty()) {
      System.out.println("Stack Underflow");
    } else {
      removed = stack[top];
      top--;
    }
    return removed;
  }

  public void displayElement() {
    if (isEmpty()) {
      System.out.println("Stack is Emplty");
    } else {
      for (int i = 0; i < top; i++) {
        System.out.println(" " + stack[i]);
      }
    }
  }
}

class MyQueue implements LinearDS {

  int front, rear;
  int q[] = new int[MAXSIZE];

  MyQueue() {
    front = -1;
    rear = -1;
  }

  public void add(int data) {
    if (rear == MAXSIZE - 1) {
      System.out.println("Queue Overflow ");
    }

    if (front == -1) front = 0;

    q[++rear] = data;
  }

  public int remove() {
    if (front == -1) {
      System.out.println("Queue underflow");
      return Integer.MIN_VALUE;
    }

    return q[front++];
  }

  public void displayElement() {
    for (int i = front; i <= rear; i++) System.out.print(q[i] + " ");
    System.out.println();
  }
}

public class Ques3 {

  public static void main(String args[]) {
    MyStack stack1 = new MyStack();
    stack1.add(20);
    stack1.displayElement();
    stack1.add(34);
    stack1.displayElement();
    int removed = stack1.remove();
    if (removed != -1) {
      System.out.println("Element Removed: " + removed);
    }
    stack1.displayElement();

    MyQueue queue1 = new MyQueue();
    queue1.add(29);
    queue1.add(39);
    queue1.displayElement();
    int ans = queue1.remove();
    if (ans != Integer.MIN_VALUE) {
      System.out.println("Removed element isL: " + ans);
    }

    queue1.displayElement();
  }
}

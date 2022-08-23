//IntrruptedException
//ArrayIndexOutOfBoundEx

import java.util.*;

class Ques1 {

  public static void main(String args[]) {
    Scanner myInput = new Scanner(System.in);
    int size;

    //negative Array size exception
    try {
      System.out.println("Enter the size of the Array");
      size = myInput.nextInt();
      if (size < 0) {
        throw (new NegativeArraySizeException("Negative Array index passed"));
      }
    } catch (NegativeArraySizeException negSize) {
      System.out.println(negSize);
    }

    int arr[] = new int[5];

    //Array out of bound exception
    try {
      int index;

      System.out.println("Enter the index to peek");
      index = myInput.nextInt();
      int a = arr[index];

      System.out.println("Value at " + index + " is = " + a);
    } catch (ArrayIndexOutOfBoundsException arrExp) {
      System.out.println(arrExp);
    }

    //IndexOut of bound exception
    try {
      String str;
      System.out.println("Enter a string");
      str = myInput.next();

      System.out.println("Enter the index to be peeked");
      int index;
      index = myInput.nextInt();

      char ch = str.charAt(index);
      System.out.println("Character at index " + index + " is: " + ch);
    } catch (IndexOutOfBoundsException indexOutExp) {
      System.out.println(indexOutExp);
    }

    //Interrupted Exception
    try {
      throw new InterruptedException("Interrupted occured in the process");
    } catch (InterruptedException interExp) {
      System.out.println(interExp);
    }

    //Illegal ArgumentException
    try {
      throw new IllegalArgumentException(
        "Passed Illegal Argument to the function"
      );
    } catch (IllegalArgumentException illegalExp) {
      System.out.println(illegalExp);
    }

    //Null Pointer Exception
    try {
      throw new NullPointerException("Null pointer exception occured");
    } catch (NullPointerException nullptrExp) {
      System.out.println(nullptrExp);
    }

    //Illegal Access Exception

    try {
      throw new IllegalAccessException("Illegal Excess Exception Occurred");
    } catch (IllegalAccessException illegalExp) {
      System.out.println(illegalExp);
    }
  }
}

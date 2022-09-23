import java.util.Scanner;

public class Ques1 {

  public static void main(String[] args) {
    Scanner inputHelper = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = inputHelper.nextLine();
    System.out.print("Enter second string: ");
    String str2 = inputHelper.nextLine();

    System.out.print("Enter length: ");
    int k = inputHelper.nextInt();

    commonSubstring(str1, str2, k);
  }

  public static void commonSubstring(String str1, String str2, int k) {
    int flag = 0;

    for (int i = 0; i < str1.length() - k + 1; i++) {
      for (int j = 0; j < str2.length() - k + 1; j++) {
        if (str1.substring(i, i + k).equals(str2.substring(j, j + k))) {
          System.out.println(
            "Common Substring Found !! String1 " + i + " String2 " + j
          );
          flag = 1;
        }
      }
    }

    if (flag == 0) {
      System.out.println("Substring not found.");
    }
  }
}

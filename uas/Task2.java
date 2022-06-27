import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    for (int i = 0; i < str.length(); i++) {
      int c = i;
      while (c < str.length()) {
        System.out.print(" ");
        c += 1;
      }
      String reversed = new StringBuilder(str.substring(1, i + 1)).reverse().toString();
      System.out.println(reversed + str.substring(0, i + 1));
    }
  }
}
import java.util.Scanner;

public class Task3 {
  public static int c = 1;

  static String task3(String str, int x, String shift) {
    if (x > 0) {
      if (shift.equals("right")) {
        System.out.println(str.substring(str.length() - c, str.length()) + str.substring(0, str.length() - c));
      } else if (shift.equals("left")) {
        System.out.println(str.substring(c, str.length()) + str.substring(0, c));
      } else {
        System.out.println("unrecognizable shift");
      }
      c++;
      return task3(str, x - 1, shift);
    } else {
      return "";
    }
  }

  public static void main(String[] args) {
    Scanner in1 = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    String str = in2.nextLine();
    int x = in1.nextInt();
    String shift = in2.nextLine();
    System.out.println(task3(str, x, shift));
  }
}
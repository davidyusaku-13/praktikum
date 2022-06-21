import java.util.Scanner;

public class Task1 {
  static void task1(int a, int b, int c) {
    int[] arr = new int[c];
    arr[0] = a;
    for (int i = 1; i < c; i++) {
      arr[i] = arr[i - 1] + b;
    }
    for (int content : arr) {
      System.out.printf("%d ", content);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String[] spliced = input.split(" ");
    int[] a = new int[spliced.length];
    for (int i = 0; i < spliced.length; i++) {
      a[i] = Integer.parseInt(spliced[i]);
    }
    task1(a[0], a[1], a[2]);
  }
}
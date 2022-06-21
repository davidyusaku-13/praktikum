import java.util.Scanner;

public class Louis {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // System.out.print("Masukkan kata : ");
    String input = "MACHUNGERS";
    for (int k = 0; k < input.length() + 1; k++) {
      int c = k;
      while (c < input.length()) {
        System.out.print(" ");
        c += 1;
      }
      for (int i = k - 1; i > 0; i--) {
        // System.out.print(i);
        System.out.print(input.charAt(i));
      }
      for (int j = 0; j < k; j++) {
        // System.out.print(j);
        System.out.print(input.charAt(j));
      }
      System.out.println();
    }
  }
}
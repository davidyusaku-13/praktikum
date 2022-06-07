public class Task5 {
  static void squareOfAsterisk(int a, int b) {
    for (int i = 0; i < b; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    squareOfAsterisk(10, 5);
  }
}
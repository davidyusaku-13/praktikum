public class Task8 {
  static int gcd(int a, int b) {
    int f;
    while (b != 0) {
      f = a % b;
      a = b;
      b = f;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(gcd(30, 120));
  }
}
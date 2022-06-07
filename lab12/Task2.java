public class Task2 {
  static int integerPower(int a, int b) {
    int pow = a;
    for (int i = 0; i < b - 1; i++) {
      a *= pow;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(integerPower(5, 3));
  }
}
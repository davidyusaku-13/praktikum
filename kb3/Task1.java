public class Task1 {
  public static int power(int a, int b) {
    int tmp = a;
    for (int i = 0; i < b - 1; i++) {
      a *= tmp;
    }
    return a;
  }

  public static int powerRec(int a, int b) {
    if (b > 1) {
      return a * powerRec(a, b - 1);
    } else {
      return a;
    }
  }

  public static void main(String[] args) {
    System.out.println(power(2, 5));
    System.out.println(powerRec(2, 5));
  }
}
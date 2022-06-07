public class Task3 {
  static boolean isMultiple(int a, int b) {
    if (a < 0 || b < 0) {
      System.out.println("Angka harus positif");
      return false;
    } else if (b % a == 0) {
      System.out.println("Bilangan kedua merupakan kelipatan bilangan pertama");
      return true;
    } else {
      System.out.println("Bukan kelipatan");
      return false;
    }
  }

  public static void main(String[] args) {
    isMultiple(-2, 4);
  }
}
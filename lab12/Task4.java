public class Task4 {
  static boolean isEven(int a) {
    if (a % 2 == 0) {
      System.out.println("Bilangan genap");
      return true;
    } else {
      System.out.println("Bilangan ganjil");
      return false;
    }
  }

  public static void main(String[] args) {
    isEven(8);
  }
}
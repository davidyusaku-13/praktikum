public class Task9 {
  static int qualityPoints(int a) {
    if (a < 60) {
      return 0;
    } else if (a < 70) {
      return 1;
    } else if (a < 80) {
      return 2;
    } else if (a < 90) {
      return 3;
    } else {
      return 4;
    }
  }

  public static void main(String[] args) {
    System.out.println(qualityPoints(68));
  }
}
public class Task10 {
  static int randomizer() {
    int a = (int) (Math.random() * 889) + 111;
    return a;
  }

  public static void main(String[] args) {
    System.out.println(randomizer());
  }
}
import java.util.ArrayList;

public class Task11 {
  static ArrayList<Integer> arr = new ArrayList<>();

  static void randomizer() {
    if (arr.size() < 9) {
      int a = (int) (Math.random() * 9) + 1;
      do {
        a = (int) (Math.random() * 9) + 1;
      } while (arr.contains(a));
      arr.add(a);
      System.out.println(arr);
    } else {
      System.out.println("-1");
    }
  }

  public static void main(String[] args) {
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
    randomizer();
  }
}
import java.util.ArrayList;

public class lab7_2 {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    int rand = (int) (Math.random() * 10) + 1;
    for (int i = 0; i < 10; i++) {
      do {
        rand = (int) (Math.random() * 10) + 1;
      } while (arr.contains(rand));
      arr.add(rand);
    }
    System.out.println(arr);
  }
}
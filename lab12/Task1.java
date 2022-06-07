import java.util.ArrayList;

public class Task1 {

  static void sortItVoid(int array[]) {
    for (int i = 0; i < array.length; i++)
      for (int j = 0; j < array.length - 1; j++)
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String[] args) {
    int jumbled[] = { 4, 1, 6, 2, 7, 5, 10, 9, 3 };
    sortItVoid(jumbled);
    for (int i : jumbled) {
      System.out.printf("%d, ", i);
    }
  }
}
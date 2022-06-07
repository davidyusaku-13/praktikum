public class Task5 {
  public static void main(String[] args) {
    String string1 = "Welcome Home";
    String string2 = "Welcome home";
    System.out.println(string1.regionMatches(false, 8, string2, 8, 4));
  }
}

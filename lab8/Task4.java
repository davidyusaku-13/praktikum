public class Task4 {
  public static void main(String[] args) {
    String s1 = "halo";
    if (s1 == "halo") {
      System.out.println("illegal move but ok");
    }
    if (s1.equals("halo")) {
      System.out.println("great move for dynamic programming");
    }
    if (s1.compareTo("halo") == 0) {
      System.out.println("weird but ok");
    }
  }
}

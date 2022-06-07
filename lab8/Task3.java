public class Task3 {
  public static void main(String[] args) {
    String string = "Doctor Strange";
    char charArray[] = new char[7];
    string.getChars(0, 7, charArray, 0);
    System.out.println(charArray);
  }
}

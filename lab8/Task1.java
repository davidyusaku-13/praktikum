public class Task1 {
  public static void main(String[] args) {
    char charArray[] = { 'D', 'o', 'c', 't', 'o', 'r', ' ', 'S', 't', 'r', 'a', 'n', 'g', 'e' };
    String string = new String("Marvel Cinematic universe");
    String s1 = new String();
    String s2 = new String(string);
    String s3 = new String(charArray);
    String s4 = new String(charArray, 7, 7);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
  }
}
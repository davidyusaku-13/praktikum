public class Task7 {
  static int reverseDigit(long a) {
    String inverted = "";
    while (a != 0) {
      long digit = a % 10;
      inverted += Long.toString(digit);
      a /= 10;
    }
    return Integer.parseInt(inverted);
  }

  public static void main(String[] args) {
    System.out.println(reverseDigit(45345123));
  }
}
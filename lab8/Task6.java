public class Task6 {
  public static void main(String[] args) {
    String str[] = { "Saya", "suka", "makan", "nasi", "goreng", "meskipun", "makan", "nasi", "kuning", "terlihat",
        "lebih", "nikmat", "dari",
        "pada", "nasi", "goreng", "tapi", "rasa", "nasi", "goreng", "tetap", "lebih", "nendang", "garing", "dan", "itu",
        "7", "bintang",
        "buat", "saya" };
    int c1 = 0;
    int c2 = 0;
    for (String content : str) {
      if (content.startsWith("na")) {
        System.out.println(content.startsWith("na"));
        System.out.println(content);
        c1 += 1;
      }
      if (content.endsWith("ng")) {
        System.out.println(content.endsWith("ng"));
        System.out.println(content);
        c2 += 1;
      }
    }
    System.out.println("awalan na ada = " + c1);
    System.out.println("akhiran ng ada = " + c2);
  }
}

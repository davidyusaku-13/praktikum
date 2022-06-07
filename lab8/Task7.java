public class Task7 {
  public static void main(String[] args) {
    String case1 = "adisucbawipuerbcqirubcvlsdjcgaliuzdcgaodisucg;";
    String case2 = "akljdclakjdbcalkjdbjbz;lkjahcjablcjkbljkzakljfbcvlakjbalkjz.";
    String case3[] = { "jadi", "hari", "ini", "kita", "akan", "mencari", "solusi", "dari", "permasalahan", "yang",
        "terus", "menjadikan", "hambatan", "dari", "pekerjaan", "kita", "sehingga", "projek", "tidak", "jadi", "-",
        "jadi", ".",
        "untuk", "itu", "supaya", "bisa", "segera", "jadi", ",", "kita", "harus", "segera", "menjadikan",
        "permasalahan", "ini", "dengan", "solusi", "yang", "sesuai", "." };

    System.out.println(case1.indexOf("z"));

    int i = case2.indexOf("z");
    while (i >= 0) {
      System.out.println(i);
      i = case2.indexOf("z", i + 1);
    }

    int c = 0;
    for (i = 0; i < case3.length; i++) {
      if (case3[i].equals("jadi")) {
        System.out.println(case3[i]);
        c += 1;
      }
    }
    System.out.println("ada " + c + " kata jadi");
  }
}

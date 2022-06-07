public class Student {
    String[] first_name = { "David", "Louis", "Vincent", "Steven" };
    String[] last_name = { "Yusaku", "Axel", "Dwi", "Pranata" };
    String getFN;
    String getLN;

    public void search(String str) {
        for (int i = 0; i < first_name.length; i++) {
            if (first_name[i].equals(str) || last_name[i].equals(str)) {
                getFN = first_name[i];
                getLN = last_name[i];
            }
        }
        System.out.println(getFN + " " + getLN);
    }
}

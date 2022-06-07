public class Task2 {   
    public static void main(String[] args) {
    String string_object = "Indonesia Jaya";
    shiftCharacter(string_object, Shift.LEFT(), 3); // the result will be "onesia JayaInd"
    shiftCharacter(string_object, Shift.RIGHT(), 3); // the result will be "ayaIndonesia J"
    }

    public static void shiftCharacter(String a, String b, int c){
        if(b.equals("LEFT")){
            System.out.println(a.substring(c,a.length()) + a.substring(0, c));
        } else if (b.equals("RIGHT")) {
            System.out.println(a.substring(a.length()-c, a.length()) + a.substring(0,a.length()-3));
        }
    } 
}
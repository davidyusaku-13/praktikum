import java.util.Scanner;

/**
 * Main
 */
public class Task1 {

    public static void main(String[] args) {
        // --------------------------------------------
        // VERSI LAMA (AGAK MANUAL)
        // --------------------------------------------
        // String[][] jawaban = new String[10][4];
        // jawaban[0][0] = "Melancarkan Elemental Skill \"Guide to Afterlife\" akan
        // terus-menerus mengonsumsi HP Hu Tao selama durasi skill";
        // jawaban[0][1] = "Ketika Hu Tao melancarkan skill \"Guide to Afterlife\" di
        // dalam area \"Spirit Blade: Chonghua's Layered Frost\" milik";
        // jawaban[0][2] = "Selama skill \"Guide to Afterlife\" aktif, semua Normal
        // Attack yang dilancarkan oleh Hu Tao akan memberikan efek \"Blood Blossom\"
        // terhadap musuh";
        // jawaban[0][3] = "\"Guide to Afterlife\" dapat tetap dilancarkan saat HP Hu
        // Tao sudah di bawah 100"; // BENAR
        // // ------------------
        // jawaban[1][0] = "Vayuda Turquoise Gemstone"; // BENAR
        // jawaban[1][1] = "Agnidus Agate Gemstone";
        // jawaban[1][2] = "Juvenile Jade";
        // jawaban[1][3] = "Vajrada Amethyst Gemstone";
        // // ------------------
        // jawaban[2][0] = "Adat Istiadat Hilichurl";
        // jawaban[2][1] = "Panduan Wisata Teyvat"; // BENAR
        // jawaban[2][2] = "Kompilasi Balada Hilichurl";
        // jawaban[2][3] = "Putri Babi Hutan";
        // // ------------------
        // jawaban[3][0] = "10";
        // jawaban[3][1] = "9";
        // jawaban[3][2] = "11"; // BENAR
        // jawaban[3][3] = "12";
        // // ------------------
        // jawaban[4][0] = "Benar";
        // jawaban[4][1] = "Salah"; // BENAR
        // // ------------------
        // jawaban[5][0] = "Menangkapikan";
        // jawaban[5][1] = "Membunuh merpati"; // BENAR
        // jawaban[5][2] = "Membunuh tupai";
        // jawaban[5][3] = "Bicara dengan Timmie";
        // // ------------------
        // jawaban[6][0] = "Teyvat Fried Egg";
        // jawaban[6][1] = "Fisherman's Toast";
        // jawaban[6][2] = "Chicken-Mushroom Skewer";
        // jawaban[6][3] = "Adeptus' Temptation"; // BENAR
        // // ------------------
        // jawaban[7][0] = "7";
        // jawaban[7][1] = "5"; // BENAR
        // jawaban[7][2] = "8";
        // jawaban[7][3] = "6";
        // // ------------------
        // jawaban[8][0] = "Ada achievement yang didapatkan setelah mengaktifkan Seelie
        // Court dalam jumlah tertentu di Liyue dan Mondstadt";
        // jawaban[8][1] = "Jika meninggalkan Seelie di tengah-tengah perjalanan, maka
        // setelah sekian waktu ia akan kembali ke posisi awal";
        // jawaban[8][2] = "Semua jawaban benar"; // BENAR
        // jawaban[8][3] = "Elemental Sight dapat digunakan untuk menemukan Seelie yang
        // cocok dengan Seelie Court";
        // // ------------------
        // jawaban[9][0] = "Wei"; // BENAR
        // jawaban[9][1] = "Fugui";
        // jawaban[9][2] = "Tic";
        // jawaban[9][3] = "Dawei";

        // String[] soal = new String[10];
        // soal[0] = "Manakah dari pernyataan berikut yang benar mengenai Elemental
        // Skill Hu Tao \"Guide to Afterlife\"?";
        // soal[1] = "Manakah dari material berikut yang tidak dijatuhkan oleh Primo
        // Geovishap?";
        // soal[2] = "Koleksi Buku manakah yang ditulis oleh Alice, ibu Klee?";
        // soal[3] = "Childe adalah Harbinger ke-() dari Eleven Harbingers Fatui.";
        // soal[4] = "Benar atau salah: Talenta Xiao \"Transcension: Gravity Defier\"
        // memberikannya jaminan bahwa dia sama sekali tidak akan menerima DMG dari aksi
        // Plunging Attack.";
        // soal[5] = "Manakah dari cara berikut yang dapat dilakukan untuk memperoleh
        // Fowl?";
        // soal[6] = "Manakah dari makanan-makanan berikut yang tidak bisa dibeli di
        // toko?";
        // soal[7] = "Dalam tantangan Tabrakan Gelembung, berapa gelembung yang mungkin
        // ada dalam satu baris?";
        // soal[8] = "Manakah dari pernyataan berikut yang benar mengenai Seelie?";
        // soal[9] = "Siapa nama kucing yang ada di Wungshu Inn?";

        // // RANDOMIZE 3 BIJI SOAL + SIMPAN HASIL RANDOM u/ COMPARE DENGAN INPUT
        // int[] randomCompare = new int[3];
        // for(int i=0;i<3;i++){
        // int random = (int)(Math.random()*10);
        // System.out.printf("\n%s", soal[random]);
        // for(int j=0;j<4;j++){
        // System.out.printf("\n%c. %s", (char)97+j, jawaban[random][j]);
        // }
        // System.out.println("");
        // randomCompare[i] = random;
        // }

        // // INPUT JWBAN USER
        // Scanner input = new Scanner(System.in);
        // String[] jwbUser = new String[3];
        // for(int k=0;k<jwbUser.length;k++){
        // System.out.printf("Masukkan jawaban untuk soal %d : ", k+1);
        // jwbUser[k] = input.nextLine();
        // }

        // int[] indexJwbUser = new int[3];
        // for(int i=0;i<indexJwbUser.length;i++){
        // if(jwbUser[i].equals("a")){
        // indexJwbUser[i] = 0;
        // } else if(jwbUser[i].equals("b")){
        // indexJwbUser[i] = 1;
        // } else if(jwbUser[i].equals("c")){
        // indexJwbUser[i] = 2;
        // } else if(jwbUser[i].equals("d")){
        // indexJwbUser[i] = 3;
        // }
        // }
        // for(int content:randomCompare){
        // System.out.println(content);
        // }
        // for(int content:indexJwbUser){
        // System.out.println(content);
        // }
        // for(int i=0;i<3;i++){
        // if(jawaban[][] == jawaban[randomCompare][indexJwbUser])
        // }

        // --------------------------------------------
        // VERSI BARU SETELAH DAPET CHEAT DARI BAPAK :D
        // --------------------------------------------
        String[][] arr = new String[10][3];
        arr[0][0] = "Manakah dari pernyataan berikut yang benar mengenai Elemental Skill Hu Tao \"Guide to Afterlife\"?";
        arr[0][1] = "a. Melancarkan Elemental Skill \"Guide to Afterlife\" akan terus-menerus mengonsumsi HP Hu Tao selama durasi skill\nb. Ketika Hu Tao melancarkan skill \"Guide to Afterlife\" di dalam area \"Spirit Blade: Chonghua's Layered Frost\" milik\nc. Selama skill \"Guide to Afterlife\" aktif, semua Normal Attack yang dilancarkan oleh Hu Tao akan memberikan efek \"Blood Blossom\" terhadap musuh\nd. \"Guide to Afterlife\" dapat tetap dilancarkan saat HP Hu Tao sudah di bawah 100";
        arr[0][2] = "d";
        arr[1][0] = "Manakah dari material berikut yang tidak dijatuhkan oleh Primo Geovishap?";
        arr[1][1] = "a. Vayuda Turquoise Gemstone\nb. Agnidus Agate Gemstone\nc. Juvenile Jade\nd. Vajrada Amethyst Gemstone";
        arr[1][2] = "a";
        arr[2][0] = "Koleksi Buku manakah yang ditulis oleh Alice, ibu Klee?";
        arr[2][1] = "a. Adat Istiadat Hilichurl\nb. Panduan Wisata Teyvat\nc. Kompilasi Balada Hilichurl\nd. Putri Babi Hutan";
        arr[2][2] = "b";
        arr[3][0] = "Childe adalah Harbinger ke-() dari Eleven Harbingers Fatui.";
        arr[3][1] = "a. 10\nb. 9\nc. 11\nd. 12";
        arr[3][2] = "c";
        arr[4][0] = "Benar atau salah: Talenta Xiao \"Transcension: Gravity Defier\" memberikannya jaminan bahwa dia sama sekali tidak akan menerima DMG dari aksi Plunging Attack.";
        arr[4][1] = "a. Benar\nb. Salah";
        arr[4][2] = "b";
        arr[5][0] = "Manakah dari cara berikut yang dapat dilakukan untuk memperoleh Fowl?";
        arr[5][1] = "a. Menangkapikan\nb. Membunuh merpati\nc. Membunuhtupai\nd. Bicara dengan Timmie";
        arr[5][2] = "b";
        arr[6][0] = "Manakah dari makanan-makanan berikut yang tidak bisa dibeli di toko?";
        arr[6][1] = "a. Teyvat Fried Egg\nb. Fisherman's Toast\nc. Chicken-Mushroom Skewer\nd. Adeptus' Temptation";
        arr[6][2] = "d";
        arr[7][0] = "Dalam tantangan Tabrakan Gelembung, berapa gelembung yang mungkin ada dalam satu baris?";
        arr[7][1] = "a. 7\nb. 5\nc. 8\nd. 6";
        arr[7][2] = "b";
        arr[8][0] = "Manakah dari pernyataan berikut yang benar mengenai Seelie?";
        arr[8][1] = "a. Ada achievement yang didapatkan setelah mengaktifkan Seelie Court dalam jumlah tertentu di Liyue dan Mondstadt\nb. Jika meninggalkan Seelie di tengah-tengah perjalanan, maka setelah sekian waktu ia akan kembali ke posisi awal\nc. Semua jawaban benar\nd. Elemental Sight dapat digunakan untuk menemukan Seelie yang cocok dengan Seelie Court";
        arr[8][2] = "c";
        arr[9][0] = "Siapa nama kucing yang ada di Wungshu Inn?";
        arr[9][1] = "a. Wei \nb. Fugui \nc. Tic \nd. Dawei ";
        arr[9][2] = "a";

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println(arr[random][0]);
            System.out.println(arr[random][1]);
            System.out.printf("Masukkan jawaban: ");
            String jwb = input.nextLine();
            if (arr[random][2].equals(jwb)) {
                System.out.println("Selamat anda mendapatkan 10.000 coins");
            }
        }
    }
}
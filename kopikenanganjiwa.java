import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

    public class KopiKenanganJiwa {
        static int TotalPenerima = 1250;
        public static String[] KopiLateDontBeLate = new String[400];
        public static String[] KopiGoncangJiwa = new String[300];
        public static String[] KopiJalanKenangan = new String[300];
        public static String[] KopiPahitTanpaRasa = new String[250];

        public static void pembeli(String[] myArray, String Pembeli){
            int IndexNow = 0;
            for (int index = 0; index < myArray.length; index++) {
                if (myArray[index] != null) {
                    IndexNow = index + 1;
                }
            }
            if (IndexNow < myArray.length) {
                myArray[IndexNow] = Pembeli;
            }
        }
        public static void Tipe_2(String Pembeli, int angka) {
            switch (angka) {
                case 1 -> {
                    pembeli(KopiLateDontBeLate, Pembeli);
                    System.out.println("Pembeli memesan kopi Late dont Be Latte");
                }
                case 2 -> {
                    pembeli(KopiGoncangJiwa, Pembeli);
                    System.out.println("Pembeli memesan kopi Kopi Goncang Jiwa");
                }
                case 3 -> {
                    pembeli(KopiJalanKenangan, Pembeli);
                    System.out.println("Pembeli memesan kopi Kopi Jalan Kenangan");
                }
                case 4 -> {
                    pembeli(KopiPahitTanpaRasa, Pembeli);
                    System.out.println("Pembeli memesan kopi Kopi Pahit Tanpa Rasa");
                }
            }

            int TotalSisaKopi;
            String kopiFavorit;
            int JumlahKopiLateDontBeLate = 0;
            for (String x : KopiLateDontBeLate) {
                if (x != null) {
                    JumlahKopiLateDontBeLate++;
                }
            }
            int JumlahKopiGoncangJiwa = 0;
            for (String x : KopiGoncangJiwa) {
                if (x != null) {
                    JumlahKopiGoncangJiwa++;
                }
            }
            int JumlahKopiJalanKenangan = 0;
            for (String x : KopiJalanKenangan) {
                if (x != null) {
                    JumlahKopiJalanKenangan++;
                }
            }
            int JumlahKopiPahitTanpaRasa = 0;
            for (String x : KopiPahitTanpaRasa) {
                if (x != null) {
                    JumlahKopiPahitTanpaRasa++;
                }
            }
            TotalSisaKopi = TotalPenerima - JumlahKopiLateDontBeLate - JumlahKopiGoncangJiwa - JumlahKopiJalanKenangan - JumlahKopiPahitTanpaRasa;
            System.out.println("==============================================================================================");
            System.out.println("Total Kopi late Dont be Late : " + JumlahKopiLateDontBeLate);
            System.out.println("Total Kopi Goncang Jiwa      : " + JumlahKopiGoncangJiwa);
            System.out.println("Total Kopi Jalan Kenangan    : " + JumlahKopiJalanKenangan);
            System.out.println("Total Kopi Pahit Tanp Rasa   : " + JumlahKopiPahitTanpaRasa);
            System.out.println("Jumlah Seluruh Kopi          : " + TotalPenerima);
            System.out.println("Total sisa kopi              : " + TotalSisaKopi);
            System.out.println("==============================================================================================");
            System.out.println();

        }

        public static void Tipe_1() {
            Scanner inputData = new Scanner(System.in);
            while (true) {
                System.out.print("nama pembeli = ");
                String namaPembeli = inputData.nextLine();
                if (namaPembeli.isEmpty()) {
                    System.out.println("Nama Pembeli Wajib Diisi");
                    Tipe_1();
                } else {
                    Random hasilRandom = new Random();
                    int JenisRandom = hasilRandom.nextInt(4) + 1;
                    Tipe_2(namaPembeli, JenisRandom);
                }
            }
        }

        public static void main(String[] args) {
            Tipe_1();
        }
    }


// Melanio Daris R. - 123200136

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius;
        int pilihan;

        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius    : ");

        celcius = in.nextDouble();

        Konversi konversi = new Konversi(celcius);

        while (true) {
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");

            pilihan = in.nextInt();
            System.out.println();

            if (pilihan == 1) {
                System.out.println("Suhu Dalam Celcius       : " + konversi.celcius + "°K");
                System.out.println("Dalam Fahrenheit         : " + konversi.fahrenheit() + "°F");
                System.out.println("Dalam Reamur             : " + konversi.reamur() + "°R");
                System.out.println("Dalam Kelvin             : " + konversi.kelvin() + "K");

                if (konversi.celcius <= 0) {
                    System.out.println("Kondisi Air Beku.");
                } else if (konversi.celcius >= 100) {
                    System.out.println("Kondisi Air Mendidih.");
                } else {
                    System.out.println("Kondisi Air Normal.");
                }
            } else if (pilihan == 2) {
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius      : ");
                celcius = in.nextDouble();
                konversi.celcius = celcius;
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }
    }
}

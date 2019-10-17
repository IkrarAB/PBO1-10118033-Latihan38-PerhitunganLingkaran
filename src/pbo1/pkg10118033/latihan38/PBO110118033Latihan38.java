
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan
 *                     Lingkaran
 *  
 */

package pbo1.pkg10118033.latihan38;

import java.util.Scanner;

public class PBO110118033Latihan38 {

    public static void main(String[] args) {
        String d;
        double diameter;
        Scanner scanner = new Scanner(System.in);
        Hitung hitung = new Hitung();

        System.out.println("=====Perhitungan Lingkaran=====");

        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scanner.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");

        } while (!d.matches("[0-9]*"));

        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        diameter = Double.parseDouble(d);
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n", hitung.jariLingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n", hitung.luasLingkaran(hitung.jariLingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n", hitung.kelilingLingkaran(hitung.jariLingkaran(diameter)));
    }
}

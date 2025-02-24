package com.mycompany.tugas_3_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;

public class Tugas_3_nomor1_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();
        
        if (angka1 >= 1000 && angka1 <= 9999 ) {
            System.out.println("Angka adalah ribuan");
        } else {
            System.out.println("Angka bukan ribuan");
        }
        if (angka2 >= 1000 && angka2 <= 9999 ) {
            System.out.println("Angka adalah ribuan");
        } else {
            System.out.println("Angka bukan ribuan");
        }
        if (angka3 >= 1000 && angka3 <= 9999 ) {
            System.out.println("Angka adalah ribuan");
        } else {
            System.out.println("Angka bukan ribuan");
        }  
    }
}

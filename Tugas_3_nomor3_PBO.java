package com.mycompany.tugas_3_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;

public class Tugas_3_nomor3_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jam masuk: ");
        int JamMasuk = input.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int JamKeluar = input.nextInt();
        
        if (JamKeluar < JamMasuk) {
            JamKeluar += 12; 
        }
        int lamaParkir = JamKeluar - JamMasuk;
        int biaya = 1500; 

        if (lamaParkir > 1) {
            biaya += (lamaParkir - 2) * 1000;
        }
        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Tarif parkir: Rp " + biaya);
    }
}

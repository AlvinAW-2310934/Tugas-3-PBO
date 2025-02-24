package com.mycompany.tugas_3_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;

public class Tugas_3_nomor2_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tiga angka: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Nilai terbesar: " + max);
    }    
}

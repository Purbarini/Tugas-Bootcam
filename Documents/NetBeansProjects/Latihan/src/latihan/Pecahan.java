/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Pecahan {

    public static void main(String[] args) {
        hitungPecahan(100660);
    }
/**
     * Fungsi untuk menghitung Pecaahan Uang dengan  nilai yang dimasukkan dalam parameter
     * 
     *
     * @return nilai uang yang dimasukkan
     */
    public static int hitungPecahan(int j) {
//        Scanner sc = new Scanner(System.in);
        int pec[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};

        for (int i = 0; i < 10; i++) {
            int hasil = j / pec[i];
            j = j - (pec[i] * hasil);
            System.out.println("Jumlah Nominal uang " + pec[i] + " ada " + hasil + " lembar");
        }
        if (j == 0) {
            System.out.print("Berhasil menukar uang");
        } else {
            System.out.println("Tidak ada pecahan ");
        }
        return j;
    }
}

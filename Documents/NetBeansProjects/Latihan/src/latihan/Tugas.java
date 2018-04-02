/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Toshiba
 */
public class Tugas {

    public static void main(String[] args) {
        System.out.println(angkaRandom(10));
       
    }
/**
     * Fungsi untuk Mengacak angka secara random
     *
     * @return List dari angka yang sudah teracak
     */
    static ArrayList angkaRandom(int n) {
        Random r = new Random();
        ArrayList a = new ArrayList();
        int hasil = 0;
        for (int counter = 1; counter <= n; counter++) {
            hasil = r.nextInt(10);   
            a.add(hasil);
    }
        return a;
}
}
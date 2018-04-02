/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);   
//        }
//        
//        for (int j = 10; j > 0; j--) {
//            System.out.println(j);
//            
//        }
        List data = new ArrayList();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        for (Object object : data) {
            if(object.toString().equals("1"))System.out.println("Siapa?");
//            System.out.println(object);
            else System.out.println(object);

        }
//        data.forEach(x->System.out.println(x)); // sama dengan perulangan diatas, berfungsi untuk menampilkan nilai dari setiap data penulisan lain dari foreach
//        data.forEach(System.out::println); // penulisan lain dari foreach
//        int a = 5;
//        switch (a) {
//            case 1:
//                System.out.println("Satu");
//                break;
//            case 2:
//                System.out.println("Dua");
//                break;
//            case 3:
//                System.out.println("Tiga");
//                break;
//                default:
//                System.out.println("Gak ada");
//
//        }
//
//        a =65;
//        System.out.println((char)a);
    }

}

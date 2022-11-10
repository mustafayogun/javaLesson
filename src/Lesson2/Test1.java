package Lesson2;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*
        Diziler Arraylar
        int sayi1, int sayi2.. int10...

        int sayi [] [] []

        veritipi değişkenadı [] ;

        int sayilar [] = --> mutlaka new anahtar sözcüğü kullanılmadır.

        int sayilar[] = new int [5];

        sayilar[0] = 12;
        sayilar [1] =21;
        sayilar [2] = 22;

        int sayilar [] = new int [10]; içerisindeki elemanları siler yeniden bellekte yer açar.



         */

        int dizi [] = new int[3];
        dizi[0] = 10;
        dizi [1]= 12;
        dizi [2] =15;

        System.out.println(dizi);

        for (int i =0; i<dizi.length; i++){
            System.out.println(dizi[i]);
        }
        //dizi.length => dizinin eleman sayısını verir.

        System.out.println("foreach ile yazılımı");
        for (int sayi:dizi){
            System.out.println(sayi);

        }

        System.out.println(dizi[0]);

        dizi = new int[5];

        System.out.println(Arrays.toString(dizi));
    }
}

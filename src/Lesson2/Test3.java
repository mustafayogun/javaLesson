package Lesson2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Dizi Boyutnu alınız...

        Alınan dizi boyutu kadar Kullanıcıya Diziye elaman girmesi sağlanmalıdır.

        Girilen elemanların Toplamını
        Ortalamasını alınız..

         */

        int boyut;
        int toplam;
        float ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi Boyutunu Giriniz =");
        boyut = scanner.nextInt();

        int dizi []= new int[boyut];
        toplam=0;

        for (int i=0; i<boyut; i++){
            System.out.print((i+1)+". Elemanını Giriniz..= ");
            dizi[i]=scanner.nextInt();
            toplam=toplam+dizi[i];
        }
        System.out.println();
        ortalama = toplam/boyut;
        System.out.println("Girilen Sayıların Toplamı=" + toplam);
        System.out.println("Girilen Sayıların Ortalaması ="+ ortalama);


    }
}

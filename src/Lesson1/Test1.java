package Lesson1;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
       System.out.println("Merhaba Dünya");
       /*

       Data Tipleri
       Numeric , Tam sayı => short, int , long
       kesirli => float 2x32 bellek yer tutar , double 2x64 bit yer tutar
       karakter => ".,/*-"
       boolean => 0 ve 1 (true, false)
       byte => 0010101010101 Ali ,

       */

      //S O L I D

       /*

        variable => değişken;

        veritipi degiskeninAdi
        camelCase
        ogrenciAdi->d
        öğreciAdı --> y
        2numaralıöğrenci -> y
        ogrenciNumarası -> d


        int sayi = 10;
        float sayi2 = 10.5f;
        double sayi3 = 20.5;
        char karakter = 'A' tektırnak
        boolean isVar = true;
        byte pdf = 0010101010101 ;

        */

        int sayi = 10;
        float sayi2 = 10.5f;
        double sayi3 = 20.5;
        char karakter = 'A';
        boolean isVar = true;

        System.out.println("Sayı = " + sayi );
        System.out.print("Float Sayı = " + sayi2 );
        System.out.println("Double Sayı = " + sayi3 );






        /*
        işlem operatörleri
        * + - /

        Mantıksal Operatörler
        && || == != >= <>



        */

        int sayi1 = 20 ;
        int sayiTwo = 30 ; // 0,05565656556

        int toplam = sayi1 + sayiTwo;
        int carp = sayi1 * sayiTwo;
        int cikar = sayi1 - sayiTwo;

        float bol = (float) sayi1 /(float) sayiTwo; // casting

        System.out.println("Toplama = " + toplam);
        System.out.println("Çıkarma = "+ cikar);
        System.out.println("Çarpma = "+ carp);

        System.out.println("Bölme = "+ bol);

        System.out.printf("Bolme işlemi %s  olarak  %s ",bol,"TAMAMLANDI" );
        System.out.println();




        Scanner  scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayi Giriniz = ");
        int sayiInput = scanner.nextInt();
        System.out.println("Girilen Sayı = " + sayiInput);








    }

}

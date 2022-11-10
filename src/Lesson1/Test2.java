package Lesson1;

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {
    /*
    * Dışardan 2 sayı Alınız  ve Toplama Çıkarma  İşleminn Sonuçunu ekrana yazdırınız..
    *
    *  Scanner
    * int sayi1
    * int sayi2
    * int toplam  = sayi1+sayi2;
    * sout ("Toplam = ")
    *
    *
    * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz = ");
        int sayi1= scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz = ");
        int sayi2 = scanner.nextInt();

        int sonuc = sayi1+sayi2;

        System.out.println("Sonuc =" + sonuc);






    }
}

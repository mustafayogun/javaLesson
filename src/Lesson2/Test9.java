package Lesson2;

import java.util.Scanner;

public class Test9 {
    /*
    Kullanıcdan iki sayı alıp methodla toplayınız.
    Scanner
    sayi1 ila sayi2 yi
    topla(sayi,sayi2)
     */
    public static void main(String[] args) {
        int sayi1 = scannerIntegerAl("1. Sayıyıyı Giriniz....");
        int sayi2 = scannerIntegerAl("2. sayıyıyı Giriniz...");
        sonucYazdir(topla(sayi1, sayi2));
        topla((double) sayi1, (double) sayi2);
        sonucYazdir(topla((double) sayi1, (double) sayi2));

    }

    public static int topla(int x, int y) {
        return x + y;
    }

    public static double topla(double x, double y) {

        return x + y;
    }


    public static int scannerIntegerAl(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double scannerDoubleAl(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String scannerStringAl(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void sonucYazdir(int deger) {
        System.out.println("Sonuc....=" + deger);

    }

    public static void sonucYazdir(double deger) {
        System.out.println("Sonuc....=" + deger);

    }
    public static void message(String message) {
        System.out.println(message);

    }

    public static void exitMessage() {
        System.out.println("Çıkış Yapılıyor..................");

    }


}

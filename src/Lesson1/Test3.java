package Lesson1;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        /*

        Kullanıcıdan bir sayı alalım ve bu sayının karesi alarak mod 10' a göre değerini ekrana yazdıralım.

        sayi1%7

        Scanner
        sayi= sayi*sayi; karesini
        Math.pow(sayi,32)

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Bir Sayı Giriniz = ");

        int sayi= scanner.nextInt();

        sayi = (int) Math.pow(sayi,2);

        int modSayi = sayi%10;


        System.out.println("Mode 10' Göre  Sayınız ="+modSayi);
    }
}

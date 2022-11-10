package Lesson1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
        Bir sayı alalım
        Asal olup olmadığını kontrol ediniz.
        1 ' e kendisine bölünen sayılar
        17   2,3, 4,5,6..... 16
        Scanner
        sayi

        for (int i=2; şart...)
        {
        if (sayi%i==0){
        bu asal değildir.
        }

        }


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...=");
        int sayi = scanner.nextInt();

        boolean isAsal = true;

        for (int i = 2; i < sayi; i++) { //Bölünüyorsa Asal Değildir.!!
            if (sayi % i == 0) {
                isAsal = false;
            }
        }

        if (isAsal) {
            System.out.println("Sayınız Asal !!!");
        } else {
            System.out.println("Sayınız Asal Değil!!!");
        }

    }
}

package Lesson1;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*
        Bir sayı giriniz...
        Random bir sayı oluşturalım.
        bu iki sayıyı karşılaştıralım.
        girilen bizim sayımızın üstünde mi altında mı kontrol edelim.

        Scanner
        Math.random()


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz =");
        int sayi = scanner.nextInt();

        int rasgeleSayi = (int) (Math.random()*100);       // casting işlemi yapıldı.
        System.out.println("Random Sayımız = " + rasgeleSayi);

        if (sayi>rasgeleSayi){
            System.out.println("Girilen Sayı Büyük ");
        } else if (sayi<rasgeleSayi) {
            System.out.println("Girilen Sayı Küçük");
        }else{
            System.out.println("Girilen sayı Eşittir....!");
        }

    }
}

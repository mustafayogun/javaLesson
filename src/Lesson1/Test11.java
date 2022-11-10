package Lesson1;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*
        Kullanıcı sadece 1 ile 3 arasında bir sayı girsin.
        girilen sayı 1 olması durumunda tekrardan bir sayı girmesini isteyelim. Girilen sayının Karesini hesaplattıralım.
        girilen sayı 2 ise tekrardan bir sayı daha girsin bu sayıda tek mi, çift mi ? olarak kontrol edilsin.
        girilen sayı 3 olması durumunda çıkış yapalım...

          while (true ){
          Scanner
          sayi
          if (sayi=1){

          }
          else if (sayi=2){

          }else if (sayi==3){--> çıkış parametresi
          break;
          }else{
          sout("yeniden giriniz...")
          }
         */

        Scanner scanner = new Scanner(System.in);
        //bellek ram

        while (true){
            System.out.println("1 , 2 veya Çıkış için 3 Giriniz....");
            int secim = scanner.nextInt();
            if (secim==1){
                System.out.println("Karesi Alıncak sayıyı giriniz...");
                int sayi=scanner.nextInt();
                sayi = sayi*sayi;
                System.out.println("Karesi " + sayi);
            } else if (secim==2) {
                System.out.println("Bir sayıyı giriniz...");
                int sayi = scanner.nextInt();
                if (sayi%2 ==0){
                    System.out.println("Sayınız Çift");
                }else {
                    System.out.println("Sayımız tek!");
                }
            } else if (secim==3) {
                System.out.println("Çıkış Yapılıyor.........");
                break;
            }
            else
                System.out.println("Hatalı Giriş Yaptınız .....!");
        }

    }
}

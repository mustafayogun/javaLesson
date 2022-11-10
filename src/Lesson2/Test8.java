package Lesson2;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*
        Methods & fonksiyonlar
        Belli bir kod parçaçığıdır.
        yeniden yeniden kullanmamızı sağlar.
        Temiz kod yazmamızı sağlar.
        Çağrıldığında çalışır.

        erişimseviyesi + Dönüştipi + methodAdı (int sayi, String adi)

        public (heryerden erişim)+ private (Sadece Class Sınıf içerisinde kullanılır) + protected (Paket içi erişim sağlar)

        public void topla (int sayi1, int sayi2){
        }
            !! Bir method içerisine 2. method yazılamazzzz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz..=");
        String name = scanner.nextLine();
        karsilamaMesaji(name);
        topla(10,20);

    }
    public  static  void   karsilamaMesaji(String isim){
        System.out.println("Merhaba "+ isim);

    }

    public static void  topla (int sayi1, int sayi2){
        int sonuc = sayi1+sayi2;
        System.out.println("Toplama=" + sonuc);
    }
}

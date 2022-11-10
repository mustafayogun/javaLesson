package Lesson2;

public class Test10 {
    /*
    Hesap Makinası
    Kullanıcıdan 2 adet sayı isticez bunlar fonsiyonlardan gelecek.
    yapılacak işlemin seçimi sorulacak.

    ***** SOLİD prensipleri
     */
    public static void main(String[] args) {
        while (true) {
            double sayi1 = Test9.scannerDoubleAl("1. Sayiyi Giriniz....=");
            double sayi2 = Test9.scannerDoubleAl("2. Sayıyı Giriniz....=");
            double sonuc = 0.0;
            boolean isIslem= false;
            String islem = Test9.scannerStringAl("+ (toplama), - (çıkarma), * (çarpma), / (bölme),E (exit)  karakter seçiniz......");
            if (islem.equals("+")) {
                sonuc= topla(sayi1, sayi2);
                isIslem=true;
            } else if (islem.equals("-")) {
                sonuc=cıkar(sayi1, sayi2);
                isIslem=true;
            } else if (islem.equals("/")) {
                sonuc= bol(sayi1, sayi2);
                isIslem=true;
            } else if (islem.equals("*")) {
                sonuc=carp(sayi1, sayi2);
                isIslem=true;
            } else if (islem.equals("E")){
                Test9.exitMessage();
                break;
            }else {
                Test9.message("Yanlış Bir Karakter Girdiniz...");
            }
            if(isIslem)
            Test9.sonucYazdir(sonuc);
            if (Test9.scannerStringAl("İsleme Devam etmek İstiyormusunuz E/H").equals("H")){
                Test9.exitMessage();
                break;
            }else if (!Test9.scannerStringAl("İsleme Devam etmek İstiyormusunuz E/H").equals("E")){
                Test9.message("Yanlış Bir Karakter Girdiniz...");
            }
        }
    }

    public static double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public static double cıkar(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public static double bol(double sayi1, double sayi2) {
        return sayi1 / sayi2;
    }

    public static double carp(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }
}

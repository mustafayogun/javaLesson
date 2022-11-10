package Lesson2;

public class Test4 {
    /*
    String=""  => Object tipindedir.
    char='k';
     */
    public static void main(String[] args) {
        String kelime = "Java";
        kelime.length(); // eleman sayısını verir.
        kelime.charAt(0); //-> girilen index sayısındaki karakteri verir.
        kelime.getBytes(); // 1010101 byte çevirir.
        kelime.toLowerCase(); // kelimeyi küçük harf çeviri.
        kelime.toUpperCase(); // HArfleri büyütür.
        kelime.concat(" Developer"); // girilen kelimeyi sonuna ekler.
        kelime.equals("Java"); // karşılaştırma fonsiyonu; true yada false döner.
        /*
        if (kelime.equals("Java")){

        }
         */
        kelime.split("a"); // [J,v] verilen karakteri atar dönen Array olaral döner;
        kelime.trim(); // " Mustafa YOĞUN "  kelimenin  boşluları temizler "Mustafa YOĞUN"
        kelime.substring(8,5); // YOĞUN Döndürür.
        kelime.replace("a","A");



    }
}

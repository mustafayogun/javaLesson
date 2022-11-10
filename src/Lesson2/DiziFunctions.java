package Lesson2;

import java.util.Arrays;

public class DiziFunctions {
    /*
     java.util.Arrays
     */



    public static void main(String[] args) {

        int dizi [] = new int[5];
        int[] sayilar = {1,5,100,20,85};

        System.out.println("Sırasız" + Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println("Küçükten Büyüğe Sıralı=" + Arrays.toString(sayilar));

        int yeniDizi []=Arrays.copyOf(sayilar, 3);

        System.out.println("Verilen elman sayısı kadar yeni dizi" + Arrays.toString(yeniDizi)  );


    }


}

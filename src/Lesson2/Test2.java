package Lesson2;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        /*
        Rasgele 6 adet sayıyı dizide tutunuz.
        sayılar 0 ila 50 arasında olmalı.

        Math.random()*50
        dizi
        for()
         */

        int dizi [] = new int [6];
        for (int i = 0; i<dizi.length; i++){
            dizi [i] = (int) (Math.random()*50);    // 0ila 1
        }
        System.out.println(Arrays.toString(dizi));
    }
}

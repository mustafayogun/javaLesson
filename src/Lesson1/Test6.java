package Lesson1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        Bir sayı alınız.
        bu 50 ile 60 arasında mı kontrolü yapalım.
        Scanner
        int sayi
        if (sayi>50 && sayi<60)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı Giriniz =");
        int sayi = scanner.nextInt();

        if (sayi>50 && sayi<60  ){
            System.out.println("Sayı 50 ile 60 arasında");

        }

    }
}

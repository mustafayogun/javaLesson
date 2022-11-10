package Lesson1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alınız.
        bu sayı tek mi çift mi olduğunu ekrana yazınız.
        Scanner
        int sayi
        if (sayi % 2 == 0){
        }else{
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz...=");
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Sayı Çift");
        } else {
            System.out.println("Sayı Tek");
        }

        // ctrl + alt +l kod satırı düzenleyicisi.
    }
}

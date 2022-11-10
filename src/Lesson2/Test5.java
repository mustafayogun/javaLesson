package Lesson2;

import java.util.Scanner;

public class Test5 {
    /*
     Kullanıcıdan 2 kelime alınız..
     karakter sayıları 11 den küçükse not validate (Uygun değil )
     11 ise Uygun yapalım.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tc Number Giriniz...");
        String kelime1 = scanner.nextLine();

        System.out.println("2. Tc Number Giriniz...");
        String kelime2 = scanner.nextLine();

        if (kelime1.length()==11 && kelime2.length()==11){
            System.out.println("Tc Number Uygun");

        }else{
            System.out.println("Tc Number Uygun Değil");
        }





    }


}

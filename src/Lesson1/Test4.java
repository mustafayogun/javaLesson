package Lesson1;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        /*
    ==  && || => <= ...

    if (boolean ){

    }
    if (koşul){

    }else if (koşul ){

    }else{

    }


    .....

     */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if (sayi<20){ //=>> true yada false olmak zorunda
            System.out.println("Girilen sayı 20'den küçük....");
        }else{
            System.out.println("Girilen Sayı 20'den Büyük");
        }

    }



}

package Lesson1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        Bir not giriniz
        0 ila 40 arasında FF
        40 ila 50 arasında DD
        50 ile 60 arasında CC
        60 ila 80 arasında BB
        80 ila 100 arasında AA

       not 100'den Büyükse ekrana uyarı yazdırılacak.
        if (şart)
        else if (şart)
        ....

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Not Giriniz =");
        int not = scanner.nextInt();

        if (not>=0 && not<=40){
            System.out.println("FF aldınız...");
        } else if (not>40&& not<=50) {
            System.out.println("DD ALdınız...");
        } else if (not>50 && not<=60 ) {
            System.out.println("CC Aldınız...");
        } else if (not>60 && not<=80) {
            System.out.println("BB Aldınız");
        } else if (not>80 && not<=100) {
            System.out.println("AA Aldınız");
        }else{
            System.out.println("100'den Büyük Bir Sayı Girdiniz...");
        }

    }


}

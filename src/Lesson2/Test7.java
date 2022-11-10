package Lesson2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
         /*
          Kullanıcıdan alınan kelimeyi tersine çeviriniz....

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Terse çevrilecek Kelimeyi Giriniz....=");
        String kelime = scanner.nextLine();

        for (int i=kelime.length()-1; i>=0; i--){
            System.out.print(kelime.charAt(i));
        }


    }
}

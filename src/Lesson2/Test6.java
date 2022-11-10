package Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        Bir isim Listesi oluşturun... Boyutu Belli olmayacak
        İsimleri Eklerken Sadece Başhari 'a' || 'A' olanları ekleyelim.
        İsimler Enaz 4 harften en çok 12 harf olanları ekleyelim.
        Başında sonunda boşluk varsa teminizlenecek.
        while
        String dizi[]
        if ...

         */


        Scanner scanner = new Scanner(System.in);
        String isimler [] = new String[1];


        while (true){
            System.out.println("Bir isim Giriniz=");
            String isim = scanner.nextLine();
            if (isim.length()>=3 && isim.length()<=12 ){
                if (isim.charAt(0)=='a' || isim.charAt(0)=='A'){
                    if (isimler[0] == ""){
                        isimler[0]=isim.trim();
                    }else{
                        String temp [] = isimler;

                        isimler = new String[temp.length+1];
                        for (int i=0; i< temp.length; i++){
                            isimler[i] = temp[i];
                        }

                        isimler[isimler.length-1]= isim.trim();
                    }

                }

            }
            if (isim.equals("exit")){
                System.out.println(Arrays.toString(isimler));
                break;
            }


        }


    }
}

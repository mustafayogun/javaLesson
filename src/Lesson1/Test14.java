package Lesson1;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
       /*

      for () satırları kontrol
       for (sutunları )
           if ()
           if ()
           if ()

                * * * * *  i=1 5*
                *       *  j=1 ve j5 durumda *
                *   *   *  satır ve sutun eşitse * yıldız.
                *       *
                * * * * * i =5 5*

     */
        ///Scanner
        /// int satirSayisi= 20
        // While  tanımlar her zaman dışarda yapılır.
        //int

        int satir=30;
        int i =0;


        while (i<satir){
            int j=0;
            while (j<satir)
            {
                if (i==0 || i==satir-1){
                    System.out.print("* ");
                } else if (j==0 || j==satir-1 ) {
                    System.out.print("* ");

                } else if (i==satir/2 && i==j ) {  // tam ortası durumu
                    //ortaki tek yıldız
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;

        }





    }


}

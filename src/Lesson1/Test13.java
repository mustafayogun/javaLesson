package Lesson1;

public class Test13 {
    public static void main(String[] args) {
        /*
            *  i=1 =2
          * * *     1
        * * * * *   0

        for (koşul) satır kontrolü
        {
            for (koşul) boşluk
                sout(" ")
            for (konuş) yıldız kontrolü
                   sout ("*")

        }

         */

    int satir =3;

    for (int i=1; i<satir+1;i++){

        for (int j=satir-i;j>0; j--){  /// boşluk
            System.out.print(" ");
        }
        for (int y=0; y<2*i-1; y++ ){  /// yıldız
            System.out.print("*");
        }
        System.out.println("");
    }




    }

}

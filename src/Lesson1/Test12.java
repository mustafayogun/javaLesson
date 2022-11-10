package Lesson1;

public class Test12 {
    /*

        * i=0
            * i=1
                * i=2 ,
                    * i=3
                        * i=4


     */
    public static void main(String[] args) {
        for (int i =0; i<5; i++ ){ //sutunlarımı kontrol etcek

            for (int j=0; j<i; j++){ // satırlar yani boşluklar
                System.out.print(" ");
            }
            System.out.println("*");



        }
    }
}

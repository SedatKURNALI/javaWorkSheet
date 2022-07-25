package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q14_SagaDayaliYildizUcgen {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Yapacaginiz ucgen in boyutunu giriniz : ");
        int boyut = scan.nextInt();

        // ilk sekil

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                if ((i+j)>=boyut+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // ikinci sekil
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                if (j<=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }



    }
}

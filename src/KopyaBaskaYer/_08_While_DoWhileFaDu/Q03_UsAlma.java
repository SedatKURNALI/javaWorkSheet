package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q03_UsAlma {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */
        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen taban sayisini giriniz : ");
        double taban = scan.nextDouble();
        System.out.print("Lutfen us olacak sayiyi tamsayi olarak giriniz : ");
        int ust = scan.nextInt();


        System.out.println(taban + " uzeri "+ust+" = "+usAlma(taban,ust));

        }



    private static double usAlma(double taban, int ust) {

        int i = 1;
        double sonuc = taban;
        while (i < ust) {
            sonuc *= taban;
            i++;

        }
        return sonuc;
    }
}

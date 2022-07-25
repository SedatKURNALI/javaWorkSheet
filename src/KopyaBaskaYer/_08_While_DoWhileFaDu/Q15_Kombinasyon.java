package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q15_Kombinasyon {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */

        Scanner scan = new Scanner (System.in);
        System.out.print("Birinci Sayiyi Giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("Ikinci Sayiy Giriniz : ");
        int sayi2 = scan.nextInt();

        kombinasyon(sayi1,sayi2);



    }

    private static void kombinasyon(int sayi1, int sayi2) {

        int ustTaraf = Q14_FaktoriyelWhile.faktoriyelHesapla(sayi1);
        int altTaraf = Q14_FaktoriyelWhile.faktoriyelHesapla((sayi1-sayi2));

       double sonuc = (double) ustTaraf / altTaraf;
        System.out.println(sonuc);

    }
}


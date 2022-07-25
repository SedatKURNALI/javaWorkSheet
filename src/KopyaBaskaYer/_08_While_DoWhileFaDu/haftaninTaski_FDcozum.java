package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class haftaninTaski_FDcozum {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac metre yukaridan topu birakacaksiniz : ");
        double yukseklik = scan.nextDouble();

        double toplamYolHerSefer = 0;
        double toplamYolToplam=0;
        int ziplamaSayisi = 0;

        while (yukseklik > 1) {

            toplamYolHerSefer = yukseklik + (yukseklik * 0.75);
            toplamYolToplam+=toplamYolHerSefer;
            yukseklik = yukseklik * 0.75;
            ziplamaSayisi++;
        }

        System.out.println("TOPLAM YOL : " + toplamYolToplam);
        System.out.println("ZIPLAMA SAYISI : " + ziplamaSayisi);
    }
}

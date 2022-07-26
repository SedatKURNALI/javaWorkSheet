package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.List;

public class Q03_ListeElemanlarKareleriToplami {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(4);
        sayilar.add(8);
        sayilar.add(12);
        sayilar.add(7);
        sayilar.add(9);
        sayilar.add(3);
        sayilar.add(6);

        int sayilarKarelerToplam = sayilarKarelerToplamBul(sayilar);
        System.out.println(sayilarKarelerToplam);

    }

    private static int sayilarKarelerToplamBul(List<Integer> sayilar) {
        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i)*sayilar.get(i);
        }

        return toplam;
    }
}

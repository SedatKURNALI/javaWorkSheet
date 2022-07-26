package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManavAlisVeris {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan = new Scanner(System.in);


    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */

    public static void main(String[] args) {

        urunListesi.add("domat - urun kodu: 1 ");
        urunListesi.add("mus - urun kodu: 2 ");
        urunListesi.add("elma - urun kodu: 3 ");
        urunListesi.add("erik - urun kodu: 4 ");
        urunListesi.add("cilek - urun kodu: 5 ");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);

        musteriSecim();


    }

    private static void musteriSecim() {
        System.out.print("Sectiginiz urun kodunu giriniz : ");
        int secim = scan.nextInt();
        System.out.print("Sectiginiz urunden kac kg alacaksiniz : ");
        double kilo = scan.nextDouble();
        double urunTutari = kilo*urunFiyatlari.get(secim-1);
        toplamOdeme+=urunTutari;
        System.out.print("Alisverise devam etmek istiyorsaniz 1, Kasan icin 2 seciniz : ");
        int devamKey = scan.nextInt();
        if(devamKey==1) {
            musteriSecim();  // recursive method
        } else {
            kasa();
        }
    }

    private static void kasa() {
        System.out.println("Yine Bekleriz \n Odemeniz Gereken : " +toplamOdeme);
    }
}

package denemeler001;

import java.util.Scanner;

public class OgrenciIsim {
    public static void main(String[] args) {
        // Main method icerisinde bir ogrenciye ait variable?lar olusturun ve bu
        // variable?lara atama yapin
        String ogrAdi = "Sedat";
        String ogrSoyadi = "Kurnali";
        int ogrNo = 127;
        System.out.println(ogrAdi + " " + ogrSoyadi + " " + ogrNo);

        // isimDegistir adinda bir method olusturun, parametre olarak ogrenci bilgilerini alsin
        isimDegistir(ogrAdi, ogrSoyadi, ogrNo);

        //  Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
        //  sonrasinda yeniden ogrenci bilgilerini yazdirin

        System.out.println(ogrAdi + " " + ogrSoyadi + " " + ogrNo);

        // Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
        // "ogrSoyadi" variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
        // istesin ve eski soyismi degistirsin.
        ogrSoyadi = soyIsimDegistir(ogrSoyadi);
        System.out.println(ogrAdi + " " + ogrSoyadi + " " + ogrNo);
    }
    public static void isimDegistir(String ogrAdi, String ogrSoyadi, int ogrNo) {
        // methodun icinde tum bilgileri degistirip, yeni bilgileri yazdirsin
        ogrAdi = "Mert";
        ogrSoyadi = "Demirci";
        ogrNo = 488;
        System.out.println(ogrAdi + " " + ogrSoyadi + " " + ogrNo);
    }
    public static String soyIsimDegistir(String ogrSoyadi) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ogrencinin soyadini giriniz :");
        ogrSoyadi = scan.nextLine();
        return ogrSoyadi;
    }
}

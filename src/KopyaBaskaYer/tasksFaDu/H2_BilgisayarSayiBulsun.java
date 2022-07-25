package KopyaBaskaYer.tasksFaDu;

import java.util.Random;
import java.util.Scanner;

public class H2_BilgisayarSayiBulsun {
    public static void main(String[] args) {

        // Kendiniz 1 ile 100 arasinda bir sayi tutun ve bunu degisken olarak atayin
        // Bilgisayardan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde "sayiyi buyut" veya "sayiyi kucult" diyerek bilgisayara yol gosterin
        // bilgisayar sayiyi buldugunda kac tahminde buldugunu ekrana yazdirin

        // burada kendimiz bir sayi belirleyelim
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1-100 arasinda bir tamsayi belirleyiniz : ");
        int tutulanSayi = scan.nextInt();

        System.out.println("Bilgisayar tahminde bulunacak \nEger bilgisayarin tahmini belirlediginiz sayidan buyukse kucult yazin \nbilgisayarin tahmini tuttugunudan kucukse buyut yaziniz");

        // burada da bilgisayar belirledigimiz sayiyi bulmaya calissin

        // burada her seferinde sinirlarin disinda sayi olusturmasin diye
        // girdiklerimiz icinde kucuk olanlarin en buyugu
        // girdiklerimiz icinde buyuk olanlarin en kucugu
        // iki degisken olusturuyoruz

        /* iki sayi arasindan random deger olusturma
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
         */

        int kucuklerinBuyugu = 0;
        int buyuklerinKucugu = 100;
        int bilgisayarTahmin = 0;

        Random rnd=new Random();
        int girilenSayi = rnd.nextInt(100); // bilgisayar random 1 sayi secsin
        System.out.print("Bilgisayar ilk tahmin : "+girilenSayi +" -> ");

        if(girilenSayi>tutulanSayi) {
            buyuklerinKucugu=girilenSayi;
        } else {
            kucuklerinBuyugu=girilenSayi;
        }

        while(girilenSayi!=tutulanSayi) {

            String yonlendir = scan.next();

            if (yonlendir.equalsIgnoreCase("buyut")) {
                kucuklerinBuyugu=girilenSayi;
                girilenSayi = rnd.nextInt((buyuklerinKucugu+1) - girilenSayi) + girilenSayi+1;
                System.out.print("Bilgisayarin tahmini : "+girilenSayi+"-> ");
                bilgisayarTahmin+=1;

            } else if (yonlendir.equalsIgnoreCase("kucult")) {
                buyuklerinKucugu=girilenSayi;
                girilenSayi = rnd.nextInt((girilenSayi+1) - kucuklerinBuyugu) + kucuklerinBuyugu-1;
                System.out.print("Bilgisayarin tahmini : "+girilenSayi +"-> ");
                bilgisayarTahmin+=1;
            }
        }
        System.out.println("Bilgisayarin dogru sonuca ulasmasi icin yaptigi tahmin sayisi : "+bilgisayarTahmin);


    }
}

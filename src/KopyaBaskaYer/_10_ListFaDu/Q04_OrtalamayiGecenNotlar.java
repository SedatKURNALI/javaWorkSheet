package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Q04_OrtalamayiGecenNotlar {

    static Scanner scan = new Scanner (System.in);
    static List<Double> notlar = new ArrayList<Double>();
    static int toplam = 0;
    static double ortalama = 0;
    static int ortalamaUstundekilerinSayisi = 0;

    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */


        // notlari girdirelim
        System.out.print("Kac adet ogrenci notu gireceksiniz : ");
        int sayi = scan.nextInt();
        int i = 0;
        while (i<sayi) {
            System.out.print((i+1)+". Ogrenincin notunu giriniz : ");

            notlar.add(i,scan.nextDouble());
            i++;
        }

        // ortalamayi hesplatalim
        for (int j = 0; j < notlar.size(); j++) {
            toplam+=notlar.get(j);
        }
        ortalama=(double) toplam / notlar.size();

        // ortalamanin uzerindeki not sayisini hesaplayalim
        int ortalamaUstundekiNotSayisi = 0;
        for (int j = 0; j < notlar.size(); j++) {
            if(notlar.get(j)>ortalama) {
            ortalamaUstundekilerinSayisi++;
            }



        }
        System.out.println("Toplam Ogrenci Sayisi : "+notlar.size());
        System.out.println("Ortalama : "+ortalama);
        System.out.println("Ortlamayi Gecen Ogrenci Sayisi : "+ortalamaUstundekilerinSayisi);

    }
}

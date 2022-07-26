package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan aşağıysa o günleri return yap.
 * */


public class QMarketArrayListli {

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi","Pazar"));
    static double gunlukKazanclar[] = new double[7];

    public static void main(String[] args) {


        gunlukKazanclar=gunlukKazancGir(gunlukKazanclar);
        double ortalamaKazanc = getOrtalamaKazanc2(gunlukKazanclar);

        // ortlama kazancdan buyuk olan gunler:
        List<String> OrtalamaninUstundeKazancGunler = new ArrayList<String>();
        OrtalamaninUstundeKazancGunler = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar,ortalamaKazanc);
        System.out.println("Ortalama gunluk kazancin uzerindeki gunler: "+OrtalamaninUstundeKazancGunler);

        // ortlama kazancdan buyuk olan gunler:
        List<String> OrtalamaninAltindaKazancGunler = new ArrayList<String>();
        OrtalamaninAltindaKazancGunler = getOrtalamaninAltindaKazancGunleri(gunlukKazanclar,ortalamaKazanc);
        System.out.println("Ortalama gunluk kazanc ve altindaki gunler: "+OrtalamaninAltindaKazancGunler);


    }

    // Ortlamanin altindaki gunler:
    private static List<String> getOrtalamaninAltindaKazancGunleri(double[] gunlukKazanclar, double ortalamaKazanc) {
        List<String> OrtalamaninAltindaKazancGunler = new ArrayList<String>();
        int i = 0;
        while (i< gunler.size()) {
            if(gunlukKazanclar[i]<=ortalamaKazanc) {
                OrtalamaninAltindaKazancGunler.add (gunler.get(i));
            }
            i++;
        }

        return OrtalamaninAltindaKazancGunler;
    }

    // Ortlamanin uzerindeki gunler:
    private static List<String> getOrtalamaninUstundeKazancGunleri(double[] gunlukKazanclar,  double ortalamaKazanc) {
        List<String> OrtalamaninUstundeKazancGunler = new ArrayList<String>();
        int i = 0;
        while (i< gunler.size()) {
            if(gunlukKazanclar[i]>ortalamaKazanc) {
                OrtalamaninUstundeKazancGunler.add (gunler.get(i));
            }
            i++;
        }

        return OrtalamaninUstundeKazancGunler;
    }

    // gunluk kazancin ustundeki gunnleri burada listeye atalim


    // ortlama gunluk kazanci bulalim
    private static double getOrtalamaKazanc2(double[] gunlukKazanclar) {
        double toplam =0;
        for (int i = 0; i < gunlukKazanclar.length; i++) {
            toplam+=gunlukKazanclar[i];

        }
        return toplam/gunlukKazanclar.length;
    }


    // gunluk kazanclari girecegimiz method olusturalim
    private static double[] gunlukKazancGir(double[] gunlukKazanclar) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        System.out.println("Gunlere gore kazanclari giriniz");
        while (i<7) {
            System.out.print(gunler.get(i)+" . gunun kazancini giriniz : ");
            gunlukKazanclar[i]= scan.nextDouble();
            i++;
        }
        return gunlukKazanclar;
    }
}

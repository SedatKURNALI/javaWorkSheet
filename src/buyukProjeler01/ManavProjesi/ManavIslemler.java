package buyukProjeler01.ManavProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavIslemler {
    static List<String> urunler = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyat = new ArrayList<>();

    /* Basarili Market-manav al??-veri? program?.
        *
        * 1. Ad?m: Ürünler ve fiyatlar? içeren listeleri olu?turunuz.
        *        No       Ürün         Fiyat
                ====     =======      =========
                00      Domates        20.10 TL
                01      Patates        30.20 TL
                02      Biber          30.50 TL
                03      So?an          20.30 TL
                04      Havuç          30.10 TL
                05      Elma           50.20 TL
                06      Muz            100.90 TL
                07      Çilek          60.10 TL
                08      Kavun          40.30 TL
                09      Üzüm           20.70 TL
                10      Limon          10.50 TL
        * 2. Ad?m: Kullan?c?n?n ürün nosuna göre listeden ürün seçmesini
        * isteyiniz.
        * 3. Ad?m: Kaç kg sat?n almak istedi?ini ve urun kodunu  aliniz.
        * 4. Ad?m: Al?nacak bu ürünü sepete ekleyiniz
        * 5. Sepeti yazd?r?n?z.
        * 6. E?er devam etmek istiyorsa yeniden ürün seçme k?sm?na
        * yönlendiriniz.
        * 7. E?er bitirmek istiyorsa ödeme k?sm?na geçiniz ve
        * ödeme sonras?nda program? bitiriniz.
    */
    public static void main(String[] args) {
        urunler.add("Domates");
        urunFiyatlari.add(20.10);
        urunler.add("Patates");
        urunFiyatlari.add(30.20);
        urunler.add("Biber");
        urunFiyatlari.add(30.50);
        urunler.add("Sogan");
        urunFiyatlari.add(20.30);
        urunler.add("Havuc");
        urunFiyatlari.add(30.10);
        urunler.add("Elma");
        urunFiyatlari.add(50.20);
        urunler.add("Muz");
        urunFiyatlari.add(100.90);
        urunler.add("Cilek");
        urunFiyatlari.add(60.10);
        urunler.add("Kavun");
        urunFiyatlari.add(40.30);
        urunler.add("Uzum");
        urunFiyatlari.add(20.70);
        urunler.add("Limon");
        urunFiyatlari.add(10.50);
        Scanner scan = new Scanner(System.in);

        int urunNo = 0;
        double urunMiktari = 0;
        String devamMi = "E";
        double toplamFiyat = 0;
        devamMi = "E";

        do {
            urunleriListele();

            System.out.print("Satin alinacak urunun numarasini giriniz :");
            urunNo = scan.nextInt();

            System.out.print("Urunden ne kadar alacaksiniz (kg / tane) :");
            urunMiktari = scan.nextDouble();
            scan.nextLine();

            sepeteEkle(urunNo, urunMiktari);

            toplamFiyat += sepetFiyat.get(sepetFiyat.size() - 1) * sepetKg.get(sepetKg.size() - 1);

            if (toplamFiyat > 1000) {
                sepetiYazdir(toplamFiyat);
            }
            System.out.print("Alisverise devam mi ( E / H ) :");

            devamMi = scan.nextLine().substring(0, 1);

        } while (devamMi.equals("E") || devamMi.equals("e"));

        System.out.println("Odeyecegimiz Toplam Tutar : " + toplamFiyat);
        System.out.println("Yeniden Bekleriz Tesekkurler");
    }

    public static void sepetiYazdir(double toplamFiyat) {
        System.out.println("Urun Sepeti Listesi ");
        System.out.println("No      Urun        Fiyat       Adet/KG     Fiyat Toplami");
        System.out.println("====    =======     =========   ========    ==============");
        for (int i = 0; i < sepetFiyat.size(); i++) {
            System.out.println((i + 1) + "\t\t " +
                    sepetUrunler.get(i) + "\t\t " +
                    sepetFiyat.get(i) + "\t\t " +
                    sepetKg.get(i) + "\t\t " +
                    (sepetFiyat.get(i) * sepetKg.get(i)) + " TL");
        }
        System.out.println("\nSepetteki Urunlerin Toplam Fiyati : " + toplamFiyat);
    }

    public static void sepeteEkle(int urunNo, double urunMiktari) {
        sepetUrunler.add(urunler.get(urunNo - 1));
        sepetFiyat.add(urunFiyatlari.get(urunNo - 1));
        sepetKg.add(urunMiktari);
    }

    public static void urunleriListele() {
        System.out.println("BASARILI MARKET-MANAV ALIS-VERIS PROGRAMI");
        System.out.println(" No      Urun         Fiyat");
        System.out.println("====    =======     =========");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + "\t\t " + urunler.get(i) + "\t\t " + urunFiyatlari.get(i) + " TL");
        }
    }
}
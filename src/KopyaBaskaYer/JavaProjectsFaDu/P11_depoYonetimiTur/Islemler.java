package JavaProjectsFaDu.P11_depoYonetimiTur;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islemler {

    static Scanner scan = new Scanner(System.in);
    static String secim;



    // DEPO YONETIM SISTEMI - ANAMENU
    public static void depoYonetimSistemi() {

        System.out.println("*****  DEPO YONETIM SISTEMI ****** ");
        System.out.println("-------------------------");
        System.out.println("1 - Yeni Urun Ekleme\t\t4 - Urunleri Listeleme");
        System.out.println("2 - Urunleri Guncelleme\t\t5 - Raf Planlamasi");
        System.out.println("3 - Urun Silme \t\t\t\t6 - Urunleri Depodan Cikar");
        System.out.println("                           Q - Quit");
        System.out.print("Seciminizi Yapiniz -> : ");
        secim = scan.next().toUpperCase();
        switch (secim) {

            case "1":
                yeniUrunEkle();
                break;

            case "2":
                urunGuncelle();
                break;

            case "3":
                urunSil();
                break;

            case "4":
                urunListele();
                break;


            case "5":
                rafPlanla();
                break;

            case "6":
                urunCikisi();
                break;

            case "Q":
                cikis();
                break;

            default:
                System.out.println("Lutfen Listeden Secim Yapiniz");
                depoYonetimSistemi();

        }

    }

    // 6- Urun Cikisi Methodu
    private static void urunCikisi() {
        System.out.println("*****  DEPODAN URUN CIKISI SAYFASI ****** ");
        System.out.println("-------------------------");

        int gelenUrunKodu = HataKontrol.urunKoduSec(); // urun kodu girisi yap ve kontrol et
        int gelenUrunMiktari = HataKontrol.urunCikisMiktarKontrol(gelenUrunKodu); // urun miktar bilgisi gir ve kontrol et

        Urunler urunObje = Urunler.eklnenUrunlerMap.get(gelenUrunKodu);


        int productQuantity = urunObje.getUrunMiktar();
        System.out.println("Product Code : " + gelenUrunKodu + " - Product Quantity : " + urunObje.getUrunMiktar());


        if (gelenUrunMiktari > productQuantity) {
            System.out.println("Please enter enough quantity to deliver");

        } else {
            urunObje.setUrunMiktar((urunObje.getUrunMiktar() - gelenUrunMiktari));
            Urunler.eklnenUrunlerMap.put(gelenUrunKodu, urunObje);
        }


        depoYonetimSistemi();
    }

    // Q- CIKIS
    private static void cikis() {
        System.out.println("******** IYI GUNLER ********");
    }

    // 5- Raf Planlama
    private static void rafPlanla() {
        String yeniRafNo = "";
        System.out.println("*****  RAF PLANLAMA SAYFASI ****** ");
        System.out.println("-------------------------");

        int gelenUrunKodu = HataKontrol.urunKoduSec(); // write code number of the registered product


        if (HataKontrol.rafIcinUrunKodundanMiktariAl(gelenUrunKodu) > 0) {
            System.out.print("Urunu atayacaginiz raf numarasini giriniz :");
            yeniRafNo = scan.next();
            Urunler urunObje = Urunler.eklnenUrunlerMap.get(gelenUrunKodu);
            urunObje.setUrunRafNo(yeniRafNo);

            Urunler.eklnenUrunlerMap.put(gelenUrunKodu, urunObje);
        } else {
            System.out.println("UYARI ! Sadece miktarı belirlenen urunleri raflara atayabilirsiniz. ");
            int islemSonuSecim = HataKontrol.secilanUrunKoduMiktarSifir();
            switch (islemSonuSecim) {
                case 1:
                    rafPlanla();
                    break;
                case 2:
                    depoYonetimSistemi();
                    break;
                default:
                    System.out.println("Lutfen ilgili linki seciniz");
                    HataKontrol.secilanUrunKoduMiktarSifir();
                    break;
            }
        }

        System.out.println("Raf No " + yeniRafNo + " secilen " + gelenUrunKodu + "Urunu icin ayrilmistir.");

        depoYonetimSistemi();
    }


    // 4- Urun Listeleme
    private static void urunListele() {
        System.out.printf("%-6s %-20.20s %-20.20s %-15.15s %-8s %-8s\n","Prd ID", "Urun Adi","Uretici","Urun Birimi","Miktar","RafNo");
        System.out.println("---------------------------------------------------------------------------------------");

        Set<Map.Entry<Integer, Urunler>> productEntrySet = Urunler.eklnenUrunlerMap.entrySet();
        // hem key hem de value lari alip isleyebilmek icin EntrySet sekline sokuyoruz

        for (Map.Entry<Integer, Urunler> each : productEntrySet
        ) {
            System.out.printf("%-6d %-20.20s %-20.20s %-15.15s %-8d %-8s \n", each.getKey(), each.getValue().getUrunAdi(), each.getValue().getUrunUretici(),
                    each.getValue().getUrunBirim(), each.getValue().getUrunMiktar(), each.getValue().getUrunRafNo());
        }
        System.out.println("--------------------------------------------------------------------------------------");

        secimMethodu();

    }


    // 3- Urun Silme
    private static void urunSil() {
        System.out.println("*****  URUN SILME SAYFASI ****** ");
        System.out.println("-------------------------");

        int gelenUrunKodu = HataKontrol.urunKoduSec(); // Urun Kodu Gir ve Kontrol Et

        Urunler urunObje = Urunler.eklnenUrunlerMap.get(gelenUrunKodu);
        System.out.println("Urun Kodu : " + gelenUrunKodu + " - Urun Miktari : " + urunObje.getUrunMiktar());

        Urunler.eklnenUrunlerMap.remove(gelenUrunKodu);
        System.out.println(gelenUrunKodu + " Ilgili Urun Bilgisi Sistemden Silinmistir");

        secimMethodu();

    }

    // 2- Urun Guncelleme
    private static void urunGuncelle() {
        System.out.println("*****  URUN GUNCELLEME SAYFASI ****** ");
        System.out.println("-------------------------");

        int gelenUrunKodu = HataKontrol.urunKoduSec(); // Urun Kodu Al ve Kontrol Et

        Urunler urunObje = Urunler.eklnenUrunlerMap.get(gelenUrunKodu);

        System.out.println("Urun Kodu : " + gelenUrunKodu + " - Urun Miktari : " + urunObje.getUrunMiktar());
        int gelenUrunMiktar = HataKontrol.urunMiktarGir(); //Urun Miktar gir ve Kontrol Et

        urunObje.setUrunMiktar(gelenUrunMiktar);

        Urunler.eklnenUrunlerMap.put(gelenUrunKodu, urunObje);

        secimMethodu();

    }



    // 1- Yeni Urun Ekleme
    private static void yeniUrunEkle() {
        System.out.println("*****  YENI URUN EKLEME SAYFASI *****");
        System.out.println("-------------------------");

        int gelenSayi = HataKontrol.eklenecekUrunSayisi(); // Kac tane urun girisi yapacaksiniz gir ve kontrol et

        scan.nextLine(); // dummy scan
        int urunKey = 0;
        String urunAdiAl = "";
        String urunUreticiAl = "";
        String urunMiktarAl = "";
        for (int i = 0; i < gelenSayi; i++) {

            Urunler urunObje = new Urunler();

            urunKey = Urunler.getUrunId();

            System.out.print("("+(i + 1) + "/"+gelenSayi+") Urun Adi : ");
            urunAdiAl = scan.nextLine();
            urunObje.setUrunAdi(urunAdiAl);

            System.out.print("("+(i + 1) + "/"+gelenSayi+") Urun Uretici : ");
            urunUreticiAl = scan.nextLine();
            urunObje.setUrunUretici(urunUreticiAl);

            System.out.print("("+(i + 1) + "/"+gelenSayi+")  Birimi : ");
            urunMiktarAl = scan.nextLine();
            urunObje.setUrunBirim(urunMiktarAl);


            Urunler.eklnenUrunlerMap.put(urunKey, urunObje);

            System.out.println("----------------------");
        }
        System.out.println("Girdiginiz Urunler Depo Yonetim Sistemine Kaydedilmistir");

        secimMethodu();

    }

    private static void secimMethodu() {
        int selectionMethod = HataKontrol.secimMethoduKontrolu();
        switch (selectionMethod) {
            case 1:
                depoYonetimSistemi();
                break;
            case 2:
                cikis();
                break;
            default:
                secimMethodu();
                break;
        }
    }

}

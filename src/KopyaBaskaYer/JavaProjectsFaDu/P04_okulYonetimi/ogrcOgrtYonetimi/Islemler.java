package KopyaBaskaYer.JavaProjectsFaDu.P04_okulYonetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static List<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikisIslemi();
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz");
                girisPaneli();
                break;

        }

    }

    private static void cikisIslemi() {
        System.out.println("Tesekkur Ederiz, Iyi Gunler");
    }

    // ALT ISLEMLER MENUSU
    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");

        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz");
                islemMenusu();
                break;

        }


    }

    private static void sil() {

        System.out.println("   ****   " + kisiTuru + " SILME SAYFASI   ****");
        boolean flag = true;
        scan.nextLine(); // dummy scan
        System.out.print("Silmek istediginiz kisinin kimlik numrasini giriniz : ");
        String silinecekKimlikNo = scan.nextLine();
        int kontrol = 0;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {  // silinecek ogrenci ise
            for (Kisi each : ogrenciListesi
            ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Silinecek Ogrenci : " + each.getAdSoyad());
                    ogrenciListesi.remove(each);
                    kontrol = 1;
                    break;
                }
            }
        } else { // aranan ogretmen ise
            for (Kisi each : ogretmenListesi
            ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Silinecek Ogretmen : " + each.getAdSoyad());
                    ogretmenListesi.remove(each);
                    kontrol = 1;
                    break;
                }
            }


        }
        if (kontrol == 0) {
            System.out.println("Aradiginiz kisi sistem kayitli degildir");
        }

    }

    private static void listele() {
        System.out.println("   ****   " + kisiTuru + " LISTELEME SAYFASI   ****");
        if(kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci listeleme

            System.out.println(ogrenciListesi);

        }else {  // ogretmen listeleme

            for (Kisi each:ogretmenListesi
                 ) {
                System.out.println(each.toString()+"Ad Soyad:"+each.getAdSoyad());
            }

        }

    }

    private static void arama() {
        System.out.println("   ****   " + kisiTuru + " ARAMA SAYFASI   ****");
        boolean flag = true;
        scan.nextLine(); // dummy scan
        System.out.print("Lutfen kimlik numrasini giriniz : ");
        String arananKimlikNo = scan.nextLine();
        int kontrol = 0;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {  // aranan ogrenci ise
            for (Kisi each : ogrenciListesi
            ) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {
                    System.out.println("Aradiginiz Ogrenci : " + each.getAdSoyad());
                    kontrol = 1;
                    break;
                }
            }
        } else { // aranan ogretmen ise
            for (Kisi each : ogretmenListesi
            ) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {
                    System.out.println("Aradiginiz Ogretmen : " + each.getAdSoyad());
                    kontrol = 1;
                    break;
                }
            }


        }
        if (kontrol == 0) {
            System.out.println("Aradiginiz kisi sistem kayitli degildir");
        }
    }

    private static void ekle() {

        System.out.println("   ****   " + kisiTuru + " EKLEME SAYFASI   ****");
        System.out.print("Ad Soyad Giriniz : ");
        scan.nextLine(); // dummy scan
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik No Giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("Yas Giriniz : ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")) {
            System.out.print("Ogrenci No Giriniz : ");
            String ogrenciNo = scan.next();
            scan.nextLine();
            System.out.print("Sinif Giriniz : ");
            String sinif = scan.nextLine();

            Ogrenci sefilOgrenci = new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrenciListesi.add(sefilOgrenci);

            // parametreli constructor dan ogrenci objesi create edilecek

        } else {
            System.out.print("Sicil No Giriniz : ");
            String sicilNo = scan.next();
            scan.nextLine(); // dummy scan
            System.out.print("Bolum Giriniz : ");
            String bolum = scan.nextLine();

            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
            ogretmenListesi.add(muhtesemOgretmen);
        }


    }


}

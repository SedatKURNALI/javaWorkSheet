package buyukProjeler01.ManavProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreenGrocer {
    static List<String> urunler = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static String kartNo = "1234 5678 5896 6547";
    static int CVC = 127;
    static String kartOwner = "Recep Kardes";
    static String expiredTime = "09/27";
    static List<String> sepettekiUrunler = new ArrayList<>();
    static List<Double> sepetkg = new ArrayList<>();
    static List<Double> sepetFiyat = new ArrayList<>();
    static int urunNo = 0;
    static double urunMiktari = 0;
    static double toplamFiyat = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "";
        urunler.add("Domates");
        urunFiyatlari.add(20.10);
        urunler.add("Patates");
        urunFiyatlari.add(30.20);
        urunler.add("Biber");
        urunFiyatlari.add(30.50);
        urunler.add("Sogan");
        urunFiyatlari.add(20.30);
        urunler.add("HAvuc");
        urunFiyatlari.add(30.10);
        urunler.add("Elma");
        urunFiyatlari.add(50.20);
        urunler.add("Muz");
        urunFiyatlari.add(100.90);
        urunler.add("Kivi");
        urunFiyatlari.add(60.10);
        urunler.add("Limon");
        urunFiyatlari.add(40.30);
        urunler.add("Mandalina");
        urunFiyatlari.add(20.70);
        urunler.add("Ejder Meyvesi");
        urunFiyatlari.add(212.50);
        do {
            urunleriListele();
            System.out.println("Almak istediginiz urunun numarasini giriniz");
            urunNo = scan.nextInt();

            System.out.println("Sectiginiz urunden ne kadar almak istiyorsunuz?(Kg/adet)");
            urunMiktari = scan.nextDouble();

            toplamFiyat += urunFiyatlari.get(urunNo - 1) * urunMiktari;
            scan.nextLine();

            System.out.println(urunler.get(urunNo - 1) + "\t" + urunFiyatlari.get(urunNo - 1) + "\t" + toplamFiyat);
            sepeteEkle(urunNo, urunMiktari);

            if (toplamFiyat > 1000) {
                System.out.println("Alisverisiniz 1000 TL'yi gecmistir");
            }
            System.out.println("Alisverise devam etmek ister misiniz?(E-H)");
            str = scan.next().substring(0, 1).toLowerCase();
            if (!str.equals("e")) {
                break;
            }
        } while (true);
        System.out.println("Odeme kismina geldiniz");
        sepetiYazdir(toplamFiyat);
        odeme(toplamFiyat);
    }

    public static void odeme(double toplamFiyat) {
        System.out.println("Odeyeceginiz toplam tutar : " + toplamFiyat);
        System.out.println("ODEME SECENEKLERI \n 1-KREDI KARTI ILE \n " +
                "2-HAVALE ILE \n 3-KAPIDA NAKIT ODEME \n 4-IPTAL \n SECIMINIZ :");
        int secim = scan.nextInt();
        scan.nextLine();

        String mkartNo = "";
        int mCVC = 0;
        String mkartOwner = "";
        String mExpiredTime = "";
        String adres = "";

        if (secim == 1) {
            System.out.println("Lutfen adres bilgilerinizi giriniz");
            adres = scan.nextLine();
            System.out.print("Kart no giriniz");
            mkartNo = scan.nextLine();
            System.out.print("Kart sahibinin ismini giriniz");
            mkartOwner = scan.nextLine();
            System.out.print("Kart son kullanma tarihini giriniz");
            mExpiredTime = scan.nextLine();
            System.out.print("Kart CCV giriniz");
            mCVC = scan.nextInt();
            if (kartNo.equals(mkartNo) && kartOwner.equalsIgnoreCase(mkartOwner) && expiredTime.equals(mExpiredTime)
                    && CVC == mCVC) {
                System.out.println("Bilgileriniz dogrudur, urunler en kisa zamanda adresinize gelecektir");
            } else {
                System.out.println("Bilgileriniz hatalidir, tekrar kontrol ediniz");
                odeme(toplamFiyat);
            }
        } else if (secim == 2) {
            System.out.println("Lutfen adres bilgilerinizi giriniz");
            adres = scan.nextLine();
            System.out.println("Hesap adi:Kardes Manav AS \nBanka-Sube:Kardes Bank-Kocaeli \n" +
                    "Hesap no:1234 1345667 5002");
            System.out.println("Havale bilgileri onaylaninca, urunler en kisa zamanda adresinize gelecektir");
        } else if (secim == 3) {
            System.out.println("Lutfen adres bilgilerinizi giriniz");
            adres = scan.nextLine();
            System.out.println("Kapida odemelerde ekstra 20 TL alinir");
            System.out.println("Urunler en kisa zamanda adresinize gelecektir");
        } else if (secim == 4) {
            System.out.println("Alisverisi iptal ettiniz, iyi gunler diler tekrar bekleriz");
        } else {
            System.out.println("Yanlis secim yaptiniz lutfen seciminizi yineleyiniz");
            odeme(toplamFiyat);
        }
    }

    public static void sepetiYazdir(double toplamFiyat) {
        System.out.println("Sepetinizdeki urunler");
        System.out.println("Urun adi        Adet/Kg       Urun fiyati");
        for (int i = 0; i < sepettekiUrunler.size(); i++) {
            System.out.println(sepettekiUrunler.get(i) + " " + sepetkg.get(i) + " " + sepetFiyat.get(i));
        }
        System.out.println("Alisveris sonunda odeyeceginiz tutar : " + toplamFiyat);
    }

    public static void sepeteEkle(int urunNo, double urunMiktari) {
        sepetkg.add(urunMiktari);
        sepetFiyat.add(urunFiyatlari.get(urunNo - 1) * urunMiktari);
        sepettekiUrunler.add(urunler.get(urunNo - 1));
    }

    public static void urunleriListele() {
        System.out.println("KARDES MANAVA HOSGELD?N?Z");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(i + 1 + "\t" + urunler.get(i) + "\t" + urunFiyatlari.get(i));
        }
    }
}
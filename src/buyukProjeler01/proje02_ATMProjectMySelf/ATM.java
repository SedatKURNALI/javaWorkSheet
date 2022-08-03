package buyukProjeler01.proje02_ATMProjectMySelf;

import java.util.Scanner;

public class ATM {

    static Scanner scan = new Scanner(System.in);
    static String kartNo = "";
    static String kartSifresi = "";

    public static void main(String[] args) {
        /*  *Kullaniciya giri? için kart numarasi ve ?ifresini isteyin, eger herhangi birini yanlis
            *girerse tekrar isteyin.
            *Kart numarasi aralarda bo?luk ile girerse de eger do?ruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilece?i i?lemleri ekrana yazdirin,
            Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre de?i?tirme ve cikis.
            Para çekme ve para gonderme i?leminde mevcut bakiyeden buyuk para çekilemez,
            Para gönderme i?leminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
            eger de?ilse menü ekranina geri donsun.
            Sifre de?i?tirme i?leminde mevcut ?ifreyi teyit ettikten sonra, sifre de?i?iklik i?lemini yapmali,
        */

        int kartVePara = -1;
        int sayac = 0;
        do {
            System.out.print("Kart numarasini giriniz : ");
            kartNo = scan.nextLine();
            kartNo = kartNo.replace(" ", "");

            System.out.print("Kart sifresini giriniz : ");
            kartSifresi = scan.nextLine();

            kartVePara = kullaniciDogrula(kartNo, kartSifresi);
            sayac++;
        } while (kartVePara == -1 && sayac < 3);

        if (kartVePara == -1) {
            System.out.println("iyi gunler kartiniz bloke oldu");
        } else {
            menu(kartVePara);
        }
    }

    public static void menu(int para) {
        KullaniciData data = new KullaniciData();
        // Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre de?i?tirme ve cikis
        String iban = "";
        int para2 = 0;
        String sifre1 = "";
        String sifre2 = "";
        String eskiSifre = "";
        System.out.println("1 - Bakiye sorgula");
        System.out.println("2 - Para yatirma");
        System.out.println("3 - Para Cekme");
        System.out.println("4 - Para Gonderme");
        System.out.println("5 - Sifre Degistirme");
        System.out.println("6 - Cikis");
        String secim = scan.nextLine();
        switch (secim) {
            case "1":
                System.out.println("Bakiyeniz : " + para);
                menu(para);
                break;
            case "2":
                System.out.print("Ne kadar yatiracaksiniz: ");
                para += scan.nextInt();
                System.out.println("Yeni bakiyeniz : " + para);
                menu(para);
                break;
            case "3":
                System.out.print("Ne kadar cekeceksiniz: ");
                para2 = scan.nextInt();
                if (para2 > para) {
                    System.out.println("En fazla " + para + " tl cekebilirsiniz");
                } else {
                    para -= para2;
                }
                System.out.println("Yeni bakiyeniz : " + para);
                menu(para);
                break;
            case "4":
                System.out.print("Ne kadar gondereceksiniz: ");
                para2 = scan.nextInt();
                if (para2 > para) {
                    System.out.println("En fazla " + para + " tl gonderebilirsiniz");
                } else {
                    System.out.println("IBAN nosunnu giriniz :");
                    iban = scan.nextLine();
                    if (iban.substring(0, 2).equals("TR") && iban.length() == 26 &&
                            iban.substring(2).
                                    equals(iban.substring(2).
                                            replaceAll("\\D", ""))) {
                        System.out.println("istediginiz para gonderilmistir");
                        para -= para2;
                        System.out.println("Yeni bakiyeniz : " + para);
                    }
                }
                menu(para);
                break;
            case "5":
                System.out.println("Eski sifrenizi giriniz");
                eskiSifre = scan.nextLine();
                if (eskiSifre.equals(kartSifresi)) {
                    System.out.println("Yeni sifre giriniz");
                    sifre1 = scan.nextLine();
                    System.out.println("Yeni sifreyi tekrar giriniz");
                    sifre2 = scan.nextLine();
                    if (sifre1.equals(sifre2)) {
                        System.out.println("Yeni sifreniz basari ile degitirildi");
                        kartSifresi = sifre1;
                    } else {
                        System.out.println("Yeni sifreyi yanlis girdiginiz icin degistirilmedi");
                    }
                } else {
                    System.out.println("Eski sifrenizi yanlis girdiginiz icin degisiklik yapilamadi");
                }
                menu(para);
                break;
            case "6":
                System.out.println("iyi gunler ve tesekkurler");
                break;
            default:
                menu(para);
                break;
        }
    }

    private static int kullaniciDogrula(String kartNo, String kartSifresi) {
        KullaniciData bilgi = new KullaniciData();
        int sonKontrol = -1;
        for (int i = 0; i < bilgi.getVeriler().length; i++) {
            if (bilgi.getVeriler()[i][0].equals(kartNo) &&
                    bilgi.getVeriler()[i][1].equals(kartSifresi)) {
                sonKontrol = Integer.parseInt(bilgi.getVeriler()[i][2]);
            }
        }
        return sonKontrol;
    }
}

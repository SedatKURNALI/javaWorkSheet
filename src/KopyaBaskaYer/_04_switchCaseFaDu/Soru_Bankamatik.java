package _04_switchCaseFaDu;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
    para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
    ATM app. code create ediniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifrenizi Giriniz");
        int sifre = scan.nextInt();

        if (sifre == 1234) {
            System.out.println("1: Bakiye Ogrenme \n2: Para Cekme \n3: Para Yatirma \n4:Cikis \nLutfen Birini Seciniz");
            int secim = scan.nextInt();
            int bakiye = 1000;

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz : 1000 TL");
                    break;
                case 2:
                    System.out.println("Ne Kadar Para Cekeceksiniz");
                    int cekme = scan.nextInt();
                    if (cekme > 1000) {
                        System.out.println("Bakiyeniz Yetersiz tekrar deneyiniz");
                    } else {
                        bakiye = bakiye - cekme;
                        System.out.println("Kalan Bakiyeniz :" + bakiye);
                    }
                    break;
                case 3:
                    System.out.println("Ne kadar Para Yatiracaksiniz");
                    int yatirma = scan.nextInt();
                    bakiye = bakiye + yatirma;
                    System.out.println("Yatirdiktan sonra bakiyeniz :" + (bakiye + yatirma));
                    break;
                case 4:
                    System.out.println("Iyi gunler dileriz");
                    break;
                default:
                    System.out.println("Hatali Secim Yaptiniz");
            }
        }
        else {
          System.out.println("Hatali Sifre Girdiniz");
        }

    }
}


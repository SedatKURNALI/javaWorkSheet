package _04_switchCaseFaDu;

import java.util.Scanner;

public class Soru_Bankamatik_SC {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
    para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
    ATM app. code create ediniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sifrenizi Giriniz : ");
        int sifre = scan.nextInt();
        int checkPass = sifre == 1234 ? 1 : 0;

        switch (checkPass) {
            case 0:
                System.out.print("Sifreyi hatali girdiniz \nYeniden Giriniz : ");
                int sifre2 = scan.nextInt();

                String str1 = "Sifreyi ard arda hatali girdininiz \nIsleminiz sonlandirilmistir kartinizi aliniz";
                String str2 = "Sifenizi ikinci denemede dogru girdiniz";
                String sonuc = sifre2 != 1234 ? str1 : str2;
                System.out.println(sonuc);

                if (sifre2 == 1234) {
                    checkPass = 1;
                } else {
                    break;
                }


            case 1:
                System.out.println("Sifreniz Doğru");
                System.out.println("--------ISLEM MENUSU---------");
                System.out.println("1: Bakiye Ogrenme \n2: Para Cekme \n3: Para Yatirma \n4:Cikis \nLutfen Birini Seciniz");
                int secim = scan.nextInt();
                int bakiye = 1000;

                switch (secim) {
                    case 1:
                        System.out.println("Bakiyeniz : 1000 TL");
                        System.out.println("--------ISLEM MENUSU---------");
                        System.out.println("1: Bakiye Ogrenme \n2: Para Cekme \n3: Para Yatirma \n4:Cikis \nLutfen Birini Seciniz");
                        int secim1 = scan.nextInt();

                        if (secim1 == 1 || secim1 == 2 || secim1 == 3 || secim1 == 4) {
                            secim = secim1;
                        } else {
                            break;
                        }

                    case 2:
                        System.out.println("Ne Kadar Para Cekeceksiniz");
                        int cekme = scan.nextInt();
                        if (cekme > 1000) {
                            System.out.println("Bakiyeniz Yetersiz tekrar deneyiniz");
                        } else {
                            bakiye = bakiye - cekme;
                            System.out.println("Kalan Bakiyeniz :" + bakiye);
                        }
                        System.out.println("--------ISLEM MENUSU---------");
                        System.out.println("1: Bakiye Ogrenme \n2: Para Cekme \n3: Para Yatirma \n4:Cikis \nLutfen Birini Seciniz");
                        int secim2 = scan.nextInt();

                        if (secim2 == 1 || secim2 == 2 || secim2 == 3 || secim2 == 4) {
                            secim = secim2;
                        } else {
                            break;
                        }
                    case 3:
                        System.out.println("Ne kadar Para Yatiracaksiniz");
                        int yatirma = scan.nextInt();
                        System.out.println("Yatirdiktan sonra bakiyeniz :" + (bakiye + yatirma));

                        System.out.println("--------ISLEM MENUSU---------");
                        System.out.println("1: Bakiye Ogrenme \n2: Para Cekme \n3: Para Yatirma \n4:Cikis \nLutfen Birini Seciniz");
                        int secim3 = scan.nextInt();

                        if (secim3 == 1 || secim3 == 2 || secim3 == 3 || secim3 == 4) {
                            secim = secim3;
                        } else {
                            break;
                        }
                    case 4:
                        System.out.println("Iyi gunler dileriz");
                        break;
                    default:
                        System.out.println("Hatali Secim Yaptiniz");
                }

        }

    }
}


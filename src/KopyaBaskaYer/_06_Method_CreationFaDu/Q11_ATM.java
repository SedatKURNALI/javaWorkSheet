package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q11_ATM {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
        ve cekme, çıkış işlemlerinin yapıldıgı bir
        ATM app. method create ediniz
        */

        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4 ");


        secim();


    }

    private static void secim() {
        // secim yaptiracak method

        System.out.print("Yapacaginiz Islemi Seciniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cikis();
                break;

        }
    }

    private static void paraYatir() {
        System.out.print("Ne kadar para yatiracaksiniz ? : ");
        int yatirilacakMiktar = scan.nextInt();
        bakiye += yatirilacakMiktar;
        System.out.println("Paraniz hesabiniza yatirilmistir");

        System.out.println("   ***   ");
        System.out.print("Isleme devam etmek istiyorsaniz " +
                "1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz : ");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else {
            cikis();
        }
    }

    private static void paraCek() {

        System.out.print("Ne kadar cekeceksiniz ? : ");
        int cekikecekMiktar = scan.nextInt();

        if (cekikecekMiktar > bakiye) {
            System.out.println("Bakiyeniz yetersiz");
        } else {
            bakiye -= cekikecekMiktar;
            System.out.println("Cekilen Miktar : " + cekikecekMiktar);
        }
        System.out.println("   ***   ");
        System.out.print("Isleme devam etmek istiyorsaniz " +
                "1\nisleme devam etmek istemiyorsaniz 0\n tuslayiniz : ");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else {
            cikis();
        }

    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("   ***   ");
        System.out.print("Isleme devam etmek istiyorsaniz " +
                "1\nisleme devam etmek istemiyorsaniz 0\n tuslayiniz : ");

        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else {
            cikis();
        }
    }

    private static void cikis() {
        System.out.println("Cikisiniz yapildi, yine bekleriz");
    }

}




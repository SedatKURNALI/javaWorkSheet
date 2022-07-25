package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q09_PinKontrol {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gecerli bir pin giriniz \n" +
                "En fazla 5 kere hatali girilmesi durumunda sifreniz gecersiz olacaktir. ");
        System.out.print("Pin giriniz : ");
        int pin = scan.nextInt();
        int sayac = 1;
        while (pin != 1234) {


            if (sayac != 5) {

                if (pin != 1234) {
                    System.out.print("Yanlis Pin girisi \n" + (sayac + 1) + ". kez deneyiniz : ");
                    sayac++;
                    pin = scan.nextInt();
                }
            } else {
                System.out.println("*****HATA*****");
                System.out.println("5 kez hatali giris yaptiginiz icin sistem sizi bloke etmistir.");
                break;
            }


        }
        if (pin == 1234) {
            System.out.println("******BASARILI******");
            System.out.println(sayac + ". denemenizde dogru girdiniz");
        }

    }
}


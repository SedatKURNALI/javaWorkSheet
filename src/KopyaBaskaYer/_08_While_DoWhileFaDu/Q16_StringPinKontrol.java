package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q16_StringPinKontrol {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gecerli bir pin (String) giriniz \n" +
                "En fazla 3 kere hatali girilmesi durumunda sifreniz gecersiz olacaktir. ");
        System.out.print("Pin giriniz : ");
        String pin = scan.next();
        int sayac = 1;

        while (!pin.equals("asdf") ) {

            if (sayac != 3) {

                if (!pin.equals("asdf") ) {
                    System.out.print("Yanlis Pin girisi \n" + (sayac + 1) + ". kez deneyiniz : ");
                    sayac++;
                    pin = scan.next();
                }
            } else {
                System.out.println("*****HATA*****");
                System.out.println("3 kez hatali giris yaptiginiz icin sistem sizi bloke etmistir.");
                break;
            }


        }
        if (pin.equals("asdf") ) {
            System.out.println("******BASARILI******");
            System.out.println(sayac + ". denemenizde dogru girdiniz");
        }

    }
}

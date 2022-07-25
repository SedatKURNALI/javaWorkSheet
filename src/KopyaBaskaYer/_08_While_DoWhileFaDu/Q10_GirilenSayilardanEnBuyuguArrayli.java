package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q10_GirilenSayilardanEnBuyuguArrayli {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        int arrSayi[] = new int[5];

        System.out.print ("Sayi1 Giriniz : ");
        arrSayi[1] = scan.nextInt();
        System.out.print ("Sayi2 Giriniz : ");
        arrSayi[2] = scan.nextInt();
        System.out.print ("Sayi3 Giriniz : ");
        arrSayi[3] = scan.nextInt();
        System.out.print ("Sayi4 Giriniz : ");
        arrSayi[4] = scan.nextInt();
        System.out.print ("Sayi5 Giriniz : ");
        arrSayi[5] = scan.nextInt();

        sayiKontrol(arrSayi);


    }

    private static void sayiKontrol(int[] arrSayi) {
        int minSayi = arrSayi[0];
        int maxSayi = arrSayi[0];
        int i=0;

        while (i<=arrSayi.length) {

            // en kucuk sayiyi bulma

            if(arrSayi[i]<minSayi) {
                minSayi = arrSayi[i];
                i++;
            } else {
                i++;
            }

            // en buyuk sayiyi bulma

            if(arrSayi[i]>maxSayi) {
                maxSayi = arrSayi[i];
                i++;
            } else {
                i++;
            }

        }

        System.out.println("En kucuk sayi : "+minSayi);
        System.out.println("En buyuk sayi : "+maxSayi);

    }

}



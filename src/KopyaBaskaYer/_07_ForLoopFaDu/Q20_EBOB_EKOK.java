package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q20_EBOB_EKOK {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("2 tane pozitif tamsayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int gcd = 0;
        int lcm = 0;
        int buyuk = 0;
        int kucuk = 0;

        // EN BUYUK ORTAK BOLEN i Bulalim
        // burada buyuk sayi ve kucuk sayi ayrimi yapiyoruz
        if (sayi1 >= sayi2) {
            buyuk = sayi1;
            kucuk = sayi2;
        } else {
            buyuk = sayi2;
            kucuk = sayi1;
        }

        for (int i = buyuk; i >= 1; i--) {
            for (int j = kucuk; j >= 1; j--) {
                if (kucuk % j == 0 && buyuk % j == 0) {
                    gcd = j;
                    break;
                }
            }
        }
        System.out.println("EBOB : " + gcd);

        // EN KUCUK ORTAK KATI i Bulalim
        int sayilarinCarpimi = buyuk*kucuk;

        for (int i = buyuk; i <=sayilarinCarpimi ; i++) {
            for (int j = kucuk; j <=sayilarinCarpimi ; j++) {
                if(j%kucuk==0 && j%buyuk==0) {
                    lcm=j;
                    break;
                }

            }

        }
        System.out.println("EKOK : "+lcm);


    }
}

package KopyaBaskaYer._10_ListFaDu;

import java.util.Scanner;

public class QAsalSayi_MethodluCozum {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Baslangic Sayisi (Dahil) : ");
        int baslangicSayi = scan.nextInt();
        System.out.print("Bitis Sayisi (Dahil Degil) : ");
        int bbitisSayi = scan.nextInt();

        primeNumbers(baslangicSayi,bbitisSayi);


    } // main method sonu

    private static void primeNumbers(int baslangicSayi, int bbitisSayi) {

        for (int i = baslangicSayi; i < bbitisSayi ; i++) {
            if(primeNumberCheck(i)) {
                System.out.print(i+" - ");
            }
        }


    } // primeNumbers method sonu


    private static boolean primeNumberCheck(int tekSayi) {

        boolean control = false;

        if (tekSayi == 2 || tekSayi == 3) {
            control= true;
        } else {

            for (int i = 2; i < tekSayi / 2 + 1; i++) {
                control = false;
                if (tekSayi % i == 0) {
                    control=false;
                    i++;
                    break;
                } else {
                    control = true;
                }

            }
        } return control;
    } // tek sayi prime kontrol method sonu
}

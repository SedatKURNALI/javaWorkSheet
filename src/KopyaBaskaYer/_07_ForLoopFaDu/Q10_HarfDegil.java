package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q10_HarfDegil {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String girilen = "";
        char ilkHarf = 'a';
        int kucukHarf = 0;
        int buyukHarf = 0;

        for (int i = 0; i < 999; i++) {
            System.out.print("Bir karakter giriniz : ");
            girilen = scan.nextLine();
            ilkHarf = girilen.charAt(0);
            if (ilkHarf >= 'a' && ilkHarf <= 'z') {
                kucukHarf = 1;
            } else if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                buyukHarf = 1;
            }

            if (girilen.length() > 1) {
                System.out.println("HATA : girilen deger 1 karakterden fazla");
                kucukHarf = 0;
                buyukHarf = 0;
            } else if ((buyukHarf+kucukHarf)==0) {
                System.out.println("HATA : girilen deger harf degildir");
            } else if(ilkHarf=='a' || ilkHarf=='e' ||ilkHarf=='i' ||ilkHarf=='o' ||ilkHarf=='u'
                    || ilkHarf=='A' || ilkHarf=='E' ||ilkHarf=='I' ||ilkHarf=='O' ||ilkHarf=='U'
            ){
                System.out.println("Girilen harf -SESLI- harfdir");
                kucukHarf = 0;
                buyukHarf = 0;
            } else {
                System.out.println("Girilen harf -SESSIZ- harfdir");
                kucukHarf = 0;
                buyukHarf = 0;
            }

        }

    }
}





package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q10_SesliSessizHarfifliCozum {
    public static void main(String[] args) {
 /*
    Kullanıcıdan bir harf girmesini isteyiniz.
        Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın.
        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
        (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

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

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir karakter giriniz : ");
        String input=scan.nextLine();

        if(input.length()>1) {
            System.out.println("Yanlis karakter girdiniz");
        }
        else if (input.charAt(0)>='a' && input.charAt(0)<='z') {

            if(input.charAt(0)=='a' || input.charAt(0)=='e' || input.charAt(0)=='i' ||
                    input.charAt(0)=='o' || input.charAt(0)=='u' ) {
                System.out.println(input.charAt(0)+" harfi sesli bir karakterdir");
            } else {
                System.out.println(input.charAt(0)+" harfi sessiz bir karakterdir");
            }

        } else if (input.charAt(0)>='A' && input.charAt(0)<='Z') {
            if(input.charAt(0)=='A' || input.charAt(0)=='E' || input.charAt(0)=='I' ||
                    input.charAt(0)=='O' || input.charAt(0)=='U' ) {
                System.out.println(input.charAt(0)+" harfi sesli bir karakterdir");
            } else {
                System.out.println(input.charAt(0)+" harfi sessiz bir karakterdir");
            }
        } else {
            System.out.println("Yanliz karakter girdiniz");
        }


    }
}

package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q01_Basic_calculator {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in); // kullanicidan input almak icin scanner obje creat ettik
        System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");// kullanıcıya bildirimde bulunuldu
        System.out.println("toplama icin  1\n cikarma icin 2\n bolme icin 3\n carpma icin 4");
        // kullanici secim icin islem menusu yazdirdik
        int islem = scan.nextInt(); // kullanicinin islem tercihi icin variable create edildi
        System.out.println("lutfen iki tam sayi giriniz"); // kullaniciya bildirmde bulunuldu
        double num1 = scan.nextDouble(); // 1 sayi assign edildi
        double num2 = scan.nextDouble(); // 2 sayi assign edildi

        if (islem == 1) {
            System.out.println("Toplama Islemi Sonucu:" + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma Islemi Sonucu:" + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Bolme Islemi Sonucu:" + num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (islem == 4) {
            System.out.println("Carpma Islemi Sonucu:" + num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println("Hatali secim yaptiniz, Tekrar deneyiniz");
        }


    }

}

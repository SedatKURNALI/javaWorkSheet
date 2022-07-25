package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q14_FaktoriyelWhile {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */
        Scanner scan = new Scanner (System.in);
        System.out.print("Faktoriyelini gireceginiz sayiyi giriniz : ");
        int num = scan.nextInt();
        int sonuc = faktoriyelHesapla(num);
        System.out.println(num+" sayisinin faktoriyeli : "+sonuc);


    }

    public static int faktoriyelHesapla(int num) {
        int hesaplanan = 1;

        while (num>1) {
            hesaplanan *=num;
            num--;
        }

        return hesaplanan;
    }
}



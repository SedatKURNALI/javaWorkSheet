package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q14_RecursiveFaktoriyel {

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

    private static int faktoriyelHesapla(int num) {
        int hesaplanan = 1;

        if(num==0 || num==1) {
            hesaplanan=1;
        } else {
            hesaplanan = faktoriyelHesapla(num-1)*num;
        }

        return hesaplanan;
    }
}



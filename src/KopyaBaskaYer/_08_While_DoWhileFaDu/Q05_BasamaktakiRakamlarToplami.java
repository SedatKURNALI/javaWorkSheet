package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q05_BasamaktakiRakamlarToplami {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int sonuc = rakamlarToplami(sayi);
        System.out.println("Girdiginiz sayinin basamaklarindaki rakamlarin toplami : "+sonuc);


    }

    private static int rakamlarToplami(int sayi) {
        int rakam = 0;
        int toplam = 0;

        while (sayi>0) {
            rakam=sayi%10;
            toplam+=rakam;
            sayi/=10;
        }
        return toplam;
    }

}

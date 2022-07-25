package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q03_TextIcindeHarfSayisi {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        int toplam = 0;

        for(int i=0; i<text.length(); i++) {
            if(text.substring(i,i+1).equalsIgnoreCase("c")) {
                System.out.println("c harfine geldigi icin donguden cikildi");
                break; // c ye geldiginde donguden cik
            }
            else {
                if(text.substring(i,i+1).equalsIgnoreCase("a")) {
                    toplam+=1; // a gordugunde toplama ekle
                } else {
                    toplam=toplam; // a haricindekileri bos gec
                }
            }
        }
        System.out.println("toplam a sayisi = "+toplam);


    }
}

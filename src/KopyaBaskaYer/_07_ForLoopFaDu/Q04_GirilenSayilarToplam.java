package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q04_GirilenSayilarToplam {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner (System.in);
        int toplam = 0;
        int sayi= 0;
        System.out.println("****Lutfen 5 tane sayi giriniz*****");

        for (int i=1; i<=5; i++) {
            System.out.print(i+". Sayiyi Giriniz: ");
            sayi = scan.nextInt();

            if(sayi<5 || sayi >10) {
                toplam+=sayi;
            }

        }
        System.out.println("Girdiginiz sayilarin (5 ile 10 arasindakileri haric) toplami : "+toplam);


    }

}

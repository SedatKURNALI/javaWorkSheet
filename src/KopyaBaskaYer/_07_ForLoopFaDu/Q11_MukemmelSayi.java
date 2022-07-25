package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q11_MukemmelSayi {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0) {
                System.out.print(i+",");
                toplam+=i;
            } else {
                toplam=toplam;
            }
        }
        System.out.print(" = "+toplam);
        System.out.print(" Sayi:"+sayi);

       String sonuc= (sayi==toplam)? " (Mukemmel) " : " (Mukemmel Degil) " ;
        System.out.println(sonuc);




    }


}

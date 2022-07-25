package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q13_KarVarMi_EksikKaldi {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner (System.in);
        System.out.print("Kac adet urun alacaksiniz :");
        int adet = scan.nextInt();
        System.out.print("Liste fiyatı nedir :");
        double fiyat = scan.nextDouble();
        System.out.print("Musteri Kartiniz Var ise 1, Yok ise 0 :");
        int kartVarMi = scan.nextInt();

        double tutar = adet*fiyat;

        if(kartVarMi==1) {
            if(adet>10) {
                System.out.println("Indirim orani : 20% ");
                System.out.println("Hesaplanan Tutar : "+tutar*0.8);
            } else {
                System.out.println("Indirim orani : 15% ");
                System.out.println("Hesaplanan Tutar : "+tutar*0.85);
            }

        } else {
            if(adet>10) {
                System.out.println("Indirim orani : 15% ");
                System.out.println("Hesaplanan Tutar : "+tutar*0.85);
            } else {
                System.out.println("Indirim orani : 10% ");
                System.out.println("Hesaplanan Tutar : "+tutar*0.9);
            }
        }


    }
}

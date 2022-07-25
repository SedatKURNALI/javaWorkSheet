package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q01_ArmstrongSayi {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int rakam = 0;
        int rakamlarinKuplerToplami = 0;
        int sayiIslem = sayi;

        while (sayiIslem>0) {

            rakam = sayiIslem%10;
            rakamlarinKuplerToplami+=(rakam*rakam*rakam);
            sayiIslem/=10;

        }
        System.out.println("Girdiginiz Sayinin Rakamlarinin Kupleri Toplami : "+rakamlarinKuplerToplami);
        if(rakamlarinKuplerToplami==sayi) {
            System.out.println("Girdiginiz Sayi Armstron Sayidir");
        } else {
            System.out.println("Girdiginiz Sayi Armstron Sayi Degildir");
        }
    }

}

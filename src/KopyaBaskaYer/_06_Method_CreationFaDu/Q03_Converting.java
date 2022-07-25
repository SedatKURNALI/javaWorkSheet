package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q03_Converting {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */

        System.out.println("1: Saati saniyeye Cevirir");
        System.out.println("2: Mili Kilometreye Cevirir");
        System.out.println("3: Kilogrami Grama Cevirir");
        System.out.print("Lutfen Seciminizi Yapiniz : ");

        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Saniyeye donustureceginiz saat : ");
                double saat = scan.nextDouble();
                saatiSaniyeyeCevir(saat);
                break;
            case 2:
                System.out.print("Kilometreye donustureceginiz mil : ");
                double mil = scan.nextInt();
                miliKilomeyreyeCevir(mil);
                break;
            case 3:
                System.out.print("Grama donustureceginiz kilogram : ");
                double kg = scan.nextInt();
                kgiGramaCevir(kg);
                break;
            default:
                System.out.println("Hatali bir secim yaptiniz");


        }

    }

    private static void kgiGramaCevir(double kg) {
        System.out.println("Girdiginiz Kg : " + kg);
        System.out.println("Gram Karsiligi : " + (kg * 1000));
    }

    private static void miliKilomeyreyeCevir(double mil) {
        System.out.println("Girdiginiz Mil : " + mil);
        System.out.println("Kilometre Karsiligi : " + (mil * 1.609344));
    }

    private static void saatiSaniyeyeCevir(double saat) {
        System.out.println("Girdiginiz Saat : " + saat);
        System.out.println("Saniye Karsiligi : " + (saat * 3600));
    }
}


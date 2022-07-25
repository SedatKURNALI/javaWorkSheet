package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q10_HarfDegilCaseLi {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz.
        Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın.
        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
        (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir karakter giriniz : ");
        String input=scan.nextLine();
        int durum=0;

        for(int i=1; i<4; i++) {
            durum = i;
            karakterKontrol(durum,input);
        }




    }

    private static void karakterKontrol(int durum, String input) {

        switch (durum) {
            case 1: // tek karakter mi degil mi?
                if(input.length()>1) {
                    System.out.println("HATA 1: Girdiginiz veri tek karakterden uzun");
                    break;
                }

            case 2: // kucuk harf kontrol kucuk harf ise sesli sessiz kontrol
                if(input.charAt(0)>='a' && input.charAt(0)<='z') {
                    if (input.charAt(0)=='a' || input.charAt(0)=='e' || input.charAt(0)=='i' || input.charAt(0)=='o' || input.charAt(0)=='u' ) {
                        System.out.println("Girdiginiz harf sesli kucuk harftir");
                    } else {
                        System.out.println("Girdiginiz harf sessiz kucuk harftir");
                    }


                        break ;
                } else {

                }
            case 3: // buyuk harf konttol
                if(input.charAt(0)>='A' && input.charAt(0)<='Z') {
                    if (input.charAt(0)=='A' || input.charAt(0)=='E' || input.charAt(0)=='I' || input.charAt(0)=='O' || input.charAt(0)=='U' ) {
                        System.out.println("Girdiginiz harf sesli buyuk harftir");
                    } else {
                        System.out.println("Girdiginiz harf sessiz buyuk harftir");
                    }
                    break;
                } else {

                }
            case 4: // ne buyuk harf ne de kucuk harf ise bu case devreye girecek
                System.out.println("HATA 2: Girdiginiz karakter harf degildir");
                break;
            default:
                System.out.println("System Error");
                break;

        }


    }
}

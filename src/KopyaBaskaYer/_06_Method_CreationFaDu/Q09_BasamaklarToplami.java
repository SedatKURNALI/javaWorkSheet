package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q09_BasamaklarToplami {
    /*
        TASK :
        addDigits isminde bir method create ediniz.
        Parametresi int
        Return tipi de int
        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, return etsin

        Örnek1:
        Girdi 38
        Çıktı: 2
        Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamaklı olduğundan, bunu döndürün.
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int girilenSayi = scan.nextInt();

        int gelenSayi = addDigit(girilenSayi);
        System.out.println(gelenSayi);


        /*
        while (input>0) {
            rakam = input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
         */

    }

    private static int addDigit(int girilenSayi) {
        // basamak sayisini bulalaim

        String sayi = Integer.toString(girilenSayi);
        int basamakSayi=sayi.length();
        int basamakToplam = 0;
        int basamakToplam2 = 0;

        for (int i=0; i<basamakSayi; i++) {
            basamakToplam+= Integer.valueOf(sayi.substring(i,i+1));
        }
        sayi = Integer.toString(basamakToplam);
        basamakSayi=sayi.length();

        if(basamakToplam>=10) {
            for (int i=0; i<basamakSayi; i++) {
                basamakToplam2+= Integer.valueOf(sayi.substring(i,i+1));

            }
            return basamakToplam2;
        } else {
            return basamakToplam;
        }







    }


}

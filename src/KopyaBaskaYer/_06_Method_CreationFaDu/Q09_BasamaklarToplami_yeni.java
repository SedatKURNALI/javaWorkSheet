package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q09_BasamaklarToplami_yeni {
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
        int input = scan.nextInt();

        int rakam = 0;
        int rakamlarToplami=0;

        while (input>0) {
            rakam = input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }

        System.out.println("Birinci Asama Rakamlar Toplami : "+rakamlarToplami);

        if(rakamlarToplami>10) {

        input = rakamlarToplami;
        rakam = 0;
        rakamlarToplami=0;

            while (input>0) {
                rakam = input%10;
                rakamlarToplami+=rakam;
                input/=10;
            }

            System.out.println("Ikinci Asama Rakamlar Toplami : "+rakamlarToplami);
        } else {
            System.out.println("Ikinci Asama Rakamlar Toplami : "+rakamlarToplami);
        }


    }
}

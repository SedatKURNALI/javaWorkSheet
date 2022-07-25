package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Ter03_3Basamak_Tek_Cift {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
         o pozitif tamsayı
         3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
            Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
            Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int num = scan.nextInt();

        String sonuc = ((num>=100 && num<1000) ? "3 Basamakli" : ((num%2==0) ? "Cift Sayi" : "Tek Sayi")) ;
        System.out.println(sonuc);


    }
}
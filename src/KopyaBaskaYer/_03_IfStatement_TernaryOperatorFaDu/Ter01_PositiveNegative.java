package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Ter01_PositiveNegative {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num1 = scan.nextInt();

        String sonuc = num1>=0 ? (num1>10 ? "10 dan buyuk":"10 dan kucuk") : "Negatif Sayi";
        System.out.println(sonuc);

    }
}

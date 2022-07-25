package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Ter02_LowerUpperCase {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a character");
        char chr = scan.next().charAt(0);

        String sonuc = ((chr>='a' && chr <='z') || (chr >='A' && chr <='Z'))
                ? ((chr>='a' && chr <='z')? "Kucuk Harf":"Buyuk Harf") : "Harf Degildir" ;
        System.out.println(sonuc);
    }
}

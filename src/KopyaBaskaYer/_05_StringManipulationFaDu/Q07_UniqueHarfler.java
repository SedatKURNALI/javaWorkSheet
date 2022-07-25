package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q07_UniqueHarfler {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Uc harfli bir isim giriniz : ");
        String isim = scan.next();

        char ilkHarf = isim.charAt(0);
        char ikinciHarf = isim.charAt(1);
        char ucuncuHarf = isim.charAt(2);

        String harfKontrol = isim.length()==3 ?


                (ilkHarf != ikinciHarf &&
                ilkHarf != ucuncuHarf &&
                ikinciHarf != ucuncuHarf) ? "Harfler Unique": "Harfler Unique Degil"

        : "Grilen isim 3 harfli degildir";


        System.out.println(harfKontrol);


    }
}
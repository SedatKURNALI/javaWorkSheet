package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q08_KelimeSonIkiHarf {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.next();

        if(kelime.length()>=3) {
            System.out.println(
                    kelime.substring(kelime.length()-2)+
                            kelime.substring(kelime.length()-2)+
                            kelime.substring(kelime.length()-2));
        } else {
            System.out.println(kelime);
        }

    }
}

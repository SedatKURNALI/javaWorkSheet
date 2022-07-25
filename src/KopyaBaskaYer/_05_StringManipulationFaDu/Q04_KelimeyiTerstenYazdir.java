package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q04_KelimeyiTerstenYazdir {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime giriniz : ");
        String kelime = scan.nextLine();

        if (kelime.length() != 4) {
            System.out.println("Girdiginiz kelime 4 harfli degildir");
        } else {
            System.out.print("Girdiginiz Kelimenin Tersten Yazilisi : ");
            System.out.print(kelime.substring(3, 4));
            System.out.print(kelime.substring(2, 3));
            System.out.print(kelime.substring(1, 2));
            System.out.print(kelime.substring(0, 1));
        }

        // HOCANIN COZUMU
        System.out.println(" ");
        System.out.println("*******HOCANIN COZUMU********");

        // verilen kelimenin ilk harf buyuk digerleri kucuk yazdirlaim
        String input = "Mavi";
        String tersStr = input.substring(3).toUpperCase()+input.substring(2,3).toLowerCase()+input.substring(1,2).toLowerCase()+input.substring(0,1).toLowerCase();
        System.out.println(tersStr);


    }
}

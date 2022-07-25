package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q02_AdSoyadAyriYaz {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen adinizi ve soyadinizi bosluk birakarak giriniz : ");
        String nameSurname = scan.nextLine();

        int boslukIndex = nameSurname.indexOf(" ");
        String name = nameSurname.substring(0,boslukIndex);
        String surname = nameSurname.substring(boslukIndex+1,nameSurname.length());
        System.out.println("Adiniz : "+name);
        System.out.println("Soyadiniz : "+surname);

    }
}

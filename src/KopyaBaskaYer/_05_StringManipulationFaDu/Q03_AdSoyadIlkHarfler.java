package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q03_AdSoyadIlkHarfler {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen adinizi, orta adinizi ve soyadinizi bosluk birakarak giriniz : ");
        String nameSurname = scan.nextLine();

        int ilkBosluk = nameSurname.indexOf(" ");
        int ikinciBosluk = nameSurname.indexOf(" ",ilkBosluk+1);
        System.out.println("Bas Harfleriniz : "+nameSurname.substring(0,1)+
                "."+nameSurname.substring(ilkBosluk+1,ilkBosluk+2)+
                "."+nameSurname.substring(ikinciBosluk+1,ikinciBosluk+2));

    }
}

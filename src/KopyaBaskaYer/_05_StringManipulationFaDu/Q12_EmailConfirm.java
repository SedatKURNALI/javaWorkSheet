package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q12_EmailConfirm {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir e-mail adresi giriniz : ");
        String email = scan.nextLine();

        /*
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
        @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
        @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
         */

        if (!email.contains("@")) {
            System.out.println("gecerli bir email girin");
        } else if (email.contains("gmail.com")) {
            System.out.println("Email adresiniz ");
        } else {
            System.out.println("Lutfen gmail hesabinizi girin");
        }

    }


}



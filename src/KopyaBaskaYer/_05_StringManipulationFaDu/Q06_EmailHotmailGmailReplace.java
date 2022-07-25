package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q06_EmailHotmailGmailReplace {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin,
        ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner (System.in);
        System.out.print("E-mail adresinizi giriniz : ");
        String email = scan.nextLine();

        if(email.contains("hotmail")) {
            email = email.replace("hotmail", "gmail");
        } else {
            email = email;
        }
        System.out.println("Email adresi : "+email);

    }
}

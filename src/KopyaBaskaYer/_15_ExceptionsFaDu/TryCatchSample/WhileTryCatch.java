package _15_ExceptionsFaDu.TryCatchSample;


import java.util.Scanner;

public class WhileTryCatch {

    public static String emailGirKontrolEt() {
        Scanner scan = new Scanner(System.in);
        String email = "";

        while (true) {
            try {
                System.out.print("E-Mail adresi giriniz : ");
                email = scan.nextLine();
                if (!email.contains("@") || !email.contains(".")) {  //@ isareti ve . icermiyorsa
                    throw new IllegalArgumentException();
                } else {
                    System.out.println("Girilen e-mail adresi dogrudur");
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : girilen e-mail adresinde hem @ isareti hem de . olmalidir");

            } catch (Exception e) {   // baska bir exception olusursa
                scan.next();
                System.out.println("UYARI ! lutfen gecerli bir e-mail adresi giriniz");

            }
        }


       return email;
    }
}

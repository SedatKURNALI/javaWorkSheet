package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q08_Panlindrome {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scan = new Scanner (System.in);
        System.out.print("Bir string giriniz : ");
        String str = scan.nextLine();
        String strTers ="";

        for (int i = str.length()-1; i >= 0; i--) {
            strTers+=str.substring(i,i+1);

        }

        System.out.println("Girdiginiz String : "+str);
        System.out.println("Stringin tersi : "+strTers);
        if(str.equalsIgnoreCase(strTers)) {
            System.out.println("Palindrome dur");
        } else {
            System.out.println("Palindrome degildir");
        }

    }

}


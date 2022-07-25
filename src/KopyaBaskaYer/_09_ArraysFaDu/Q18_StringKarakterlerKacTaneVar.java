package _09_ArraysFaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Q18_StringKarakterlerKacTaneVar {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini
         bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();

        // String i array yapalim
        String[] arr = str.split("");

        // String i her karakteri 1 kez yazacak sekilde kisa halini bulalim
        String strKisa = "";
        for (int i = 0; i < arr.length; i++) {
            if (!strKisa.contains(arr[i])) {
                strKisa += arr[i];
            }

        }
        System.out.println(strKisa);

        // kisaltilmis String i Array e donusturelim
        String[] arrKisa = strKisa.split("");


        // Kisa Array ile Normal Array i karsilastirip, kisa array icindeki karakterlerin
        // normal Array icinde kac tane oldugunu sayacla bulalim.

        int sayac=0;
        for (int i = 0; i < arrKisa.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals(arrKisa[i])) {
                    sayac++;
                }
                    // kisa array deki karakterleri : karakter=adet seklinde yeniden atayalim
            } arrKisa[i]=arrKisa[i]+"="+sayac;
                    // Kisa arrayden aldigimiz her karakteri kontrol ettikten sonra (j dongusu sonunda)
                    // sifirlayalim
            sayac=0;

        }

        System.out.println(Arrays.toString(arrKisa));

    }
}
    


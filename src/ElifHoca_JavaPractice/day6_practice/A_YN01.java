package ElifHoca_JavaPractice.day6_practice;

import java.util.Scanner;

public class A_YN01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yazi giriniz : ");
        String str = scan.nextLine();
        System.out.println("Bir sayi giriniz : ");
        int tekrar = scan.nextInt();
        System.out.println(ilkSonUcTekrar(str,tekrar));
    }

    public static String ilkSonUcTekrar(String str,int tekrar) {
        String a = "";
        for (int i = 1; i <= tekrar; i++) {
            a += str.substring(0, 1) + str.substring(str.length() - 1);
        }
        return a;
    }
}

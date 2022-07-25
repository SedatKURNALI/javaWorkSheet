package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q02_IndexiTekOlanlariYaz {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String metin = scan.nextLine();
        String bosMetin = "";
        int i = 0;

        while (i < metin.length()) {

            if (i % 2 != 0) {
                bosMetin += metin.substring(i, i + 1);
                i++;
            } else {
                i++;
            }
        }

        System.out.println("Olusan Metin : " + bosMetin);

    }

}

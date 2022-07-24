package denemeler001;

import java.util.Scanner;

public class Asal002 {
    public static void main(String[] args) {
        // Klavyeden girilen sayiya kadar olan asal sayilari bulan programi yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1 den büyük bir tamsayi giriniz : ");
        int sayi = scan.nextInt();
        int kontrol;
        if (sayi > 1) {
            System.out.println("2 sayisi asal sayidir.");
            for (int j = 3; j <= sayi; j++) {
                kontrol = 1;
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        kontrol = 0;
                    }
                }
                if (kontrol == 1) {
                    System.out.println(j + " sayisi asal sayidir.");
                }
            }
        } else {
            System.out.println("Lütfen 1 den büyük bir tamsayi giriniz");
        }
    }
}
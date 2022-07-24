package denemeler001;

import java.util.Scanner;

public class Asal001 {
    public static void main(String[] args) {
        // Klavyeden girilen sayinin asal sayi olup olmadigini kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1 den büyük bir tamsayi giriniz : ");
        int sayi = scan.nextInt();
        int kontrol = 1;
        if (sayi > 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 0;
                }
            }
            if (kontrol == 1) {
                System.out.println(sayi + " sayisi asal sayidir.");
            }else{
                System.out.println(sayi + " sayisi asal sayi degildir.");
            }
        } else if (sayi == 2) {
            System.out.println(sayi + " sayisi asal sayidir.");
        } else {
            System.out.println("Lütfen 1 den büyük bir tamsayi giriniz");
        }
    }
}

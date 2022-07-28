package CalismaSorulari01;

import java.util.Scanner;

public class Q07_1 {
    public static void main(String[] args) {
        /*
             Ugly Number: Girilen bir say?n?n  ugly number olup olmad???n? kontrol etmek i﷿in
                bir Java program? yaz?n.
                Say? sisteminde,  ugly number  sadece asal fakt﷿rleri 2, 3 veya 5 olan pozitif say?lard?r.
                ilk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
                Test Data:      13
                Beklenen ﷿?kt?:  ugly number  degildir
                Test Data:      25
                Beklenen ﷿?kt?:  ugly number
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        int kontrol = 0;
        int temp;
        for (int j = 1; j <= sayi; j++) {
            kontrol = 0;
            temp = j;
            for (int i = 1; i <= j; i++) {
                if (temp % 2 == 0) {
                    temp /= 2;
                }
                if (temp % 3 == 0) {
                    temp /= 3;
                }
                if (temp % 5 == 0) {
                    temp /= 5;
                }
                if (temp == 1) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 1) {
                System.out.print(j + " ");
            }
        }
    }
}

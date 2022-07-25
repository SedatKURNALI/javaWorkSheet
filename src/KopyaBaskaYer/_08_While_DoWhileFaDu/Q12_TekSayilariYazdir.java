package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q12_TekSayilariYazdir {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir sayi giriniz : ");
        int num=scan.nextInt();
        int i=1;
        while (i<=num) {
            if (i<0) {
                System.out.println("Lutfen pozitif bir sayi giriniz");
            }
            else if(i%2==1 && i!=num) {
                System.out.print(i+", ");
                i++;
            } else if (i%2==1 && i==num) {
                System.out.print(i);
                i++;
            }
            else {
                i++;
            }
        }


    }
}

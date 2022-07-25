package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q10_GirilenSayilardanEnBuyugu {


    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner scan = new Scanner (System.in);

        System.out.print ("Kac tane sayi gireceksiniz : ");
        int num = scan.nextInt();

        buyukSayiBul (num);

    }

    private static void buyukSayiBul(int num) {
        Scanner scan2 = new Scanner (System.in);

        // max sayiyi bulma
        int maxNum=0;
        int i = 1;
        int temp = 0;
        while(i<=num) {
            System.out.print(i+". sayiyi giriniz : ");
            temp = scan2.nextInt();
            if(temp>=maxNum) {
                maxNum=temp;
                i++;
            } else {
                i++;
            }
        }

        System.out.println("En Buyuk Sayi = "+maxNum);

    }


}



package _09_ArraysFaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_UceBolunebilenlerinSayisi {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
        // eleman sayisi sabit ve 8 olacak
        Scanner scan = new Scanner (System.in);
        int elemanSayi=8;
        int arr[] = new int[elemanSayi];
        // burada tek tek 8 elemani girdirelim
        for (int i = 0; i < elemanSayi; i++) {
            System.out.print(i+" . index icin eleman giriniz: ");
            arr[i]=scan.nextInt();
        }

        System.out.println("Olusutulan Array : "+Arrays.toString(arr));

        // 3 e bolunebilen elemanlari saydiralim
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0) {
                sayac++;
            }
        }

        System.out.println("Array icinde 3'e bolunebilenlerin sayisi : "+sayac);

    }

}

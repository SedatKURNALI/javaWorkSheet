package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_GirilenlerdenTekOlanlar {
    static Scanner scan = new Scanner (System.in);
    static int arr[] = new int[6];
    static List<Integer> tekSayilar = new ArrayList<Integer>();


    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        System.out.println("*** TEK SAYILARI BUL***");
        System.out.println("6 adet sayi giriniz");
        sayilariGir();
        System.out.println("Girilenler icinde tek sayi olanlar: "+tekSayilar);


    }

    private static void sayilariGir() {
        int i = 0;
        while (i<6) {
            System.out.print(i+1+ ". elemani giriniz: ");
            arr[i]=scan.nextInt();
            if(arr[i]%2==1) {
                tekSayilar.add(arr[i]);
            }
            i++;
        }

    }




}

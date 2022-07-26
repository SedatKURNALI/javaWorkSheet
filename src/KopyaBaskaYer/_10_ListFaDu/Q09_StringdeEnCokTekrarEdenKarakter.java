package KopyaBaskaYer._10_ListFaDu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09_StringdeEnCokTekrarEdenKarakter {
    static Scanner scan = new Scanner(System.in);
    static List<String> strKisa = new ArrayList<String>();
    static List<Integer> strKisaAdet = new ArrayList<Integer>();



    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        enCokTekrarEdenKarakter();

    }

    private static void enCokTekrarEdenKarakter() {

       // kullanicidan String ifadeyi alip, Array a atalim
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();
        String strArr[] = str.split("");


        // Array deki elemanlarin tekrar etmeyen kisa halini strKisa List e atayalim
        for (int i = 0; i < strArr.length; i++) {
            if(!strKisa.contains(strArr[i])) {
                strKisa.add(strArr[i]);
            }
        }

        // Listedeki elemanlarin Array icinde kac kere kullanildigini hesaplayip strKisaAdet Listesine yazalim
        int adet=0;
        for (int i = 0; i < strKisa.size() ; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if(strKisa.get(i).equals(strArr[j])) {
                    adet++;
                }
            } strKisaAdet.add(adet);
            adet = 0;

        }
        System.out.println(strKisa);
        System.out.println(strKisaAdet);

        // en falz kullanilan elemanin adetini ve sira nosuna gore elemani bulup yazdiralim
        int maxNum=strKisaAdet.get(0);
        int sira = 0;

        for (int i = 0; i < strKisaAdet.size(); i++) {
            if(strKisaAdet.get(i)>maxNum) {
                maxNum=strKisaAdet.get(i);
                sira = i;
            }
        }

        // en fazla kullanilani yazdiralim
        System.out.println("En fazla kullanilan karakter : "+strKisa.get(sira)+" dir ve "+maxNum+" adet kullanilmistir.");



    }
}


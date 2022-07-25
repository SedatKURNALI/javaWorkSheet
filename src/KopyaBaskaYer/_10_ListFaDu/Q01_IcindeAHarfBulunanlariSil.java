package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;

public class Q01_IcindeAHarfBulunanlariSil {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<String>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Omer");

        System.out.println("Mevcut isimler : \n" + isimler);

        String harf = "a"; // dongu icinde list.i deki elemani lower case e donusturecegiz

        for (int i = 0; i < isimler.size(); i++) {
            for (int j = 0; j < isimler.get(i).length(); j++) {

                if (isimler.get(i).toLowerCase().charAt(j)=='a') {  // her bir liste elemaninin
                    // tum karakterlerini kontrol etmek icin j li dongu kullandik
                    isimler.remove(i);
                }
            }
        }

        System.out.println("Icinde a harfi gecenler silindikten sonra : \n" + isimler);


    }


}

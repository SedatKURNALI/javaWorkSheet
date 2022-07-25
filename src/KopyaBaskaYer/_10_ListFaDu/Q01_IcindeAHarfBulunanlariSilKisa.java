package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;

public class Q01_IcindeAHarfBulunanlariSilKisa {

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

        List<String> isimlerYeni= new ArrayList<>(); // isimleri buraya atmak ve listenin sirasi degismemesi icin

        String harf = "a"; // dongu icinde list.i deki elemani lower case e donusturecegiz

        for (int i = 0; i < isimler.size(); i++) {

                if (!isimler.get(i).toLowerCase().contains("a")) {  // her bir liste elemaninin
                    // tum karakterlerini kontrol etmek icin j li dongu kullandik
                    isimlerYeni.add(isimler.get(i));
                }

        }

        System.out.println("Icinde a harfi gecenler silindikten sonra : \n" + isimlerYeni);


    }


}

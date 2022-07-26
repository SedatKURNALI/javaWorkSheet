package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_ArrayIsimlerHarfSirasinaGoreListe {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String isimler[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
        isimleriDuzenle(isimler);


    }

    private static void isimleriDuzenle(String[][] isimler) {

        System.out.println("Array in ilk hali : "+Arrays.deepToString(isimler));

        // once tum isimleri tek boyutlu arraye atalim. Bunun icin boyutu ogrenelim
        int adet = 0;
        for (int i = 0; i < isimler.length; i++) {
            for (int j = 0; j < isimler[i].length; j++) {
                adet++;
            }

        }

        System.out.println("Isim sayisi : " + adet);

        // yeni bos bir array olusturup icine isimleri tek tek atalim

        String arr[] = new String[adet]; // boyuta gore yeni tek boyutlu bir array olusturduk
        int k = 0;
        for (int i = 0; i < isimler.length; i++) {
            for (int j = 0; j < isimler[i].length; j++) {
                arr[k] = isimler[i][j];
                k++;
            }
        }
        System.out.println("Tum isimler Tek Arrayde : "+Arrays.toString(arr));

        // olusan array i sort edelim
        Arrays.sort(arr);

        // arraydeki elemanlari List olusturup icine atalim
        List<String> isimlerList = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            isimlerList.add(arr[i]);
        }

        // icine isimleri attigimiz List i yazdiralim
        System.out.println("Harf Sirasina Gore Liste : "+isimlerList);

    }
}
